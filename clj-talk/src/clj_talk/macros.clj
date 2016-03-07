(ns clj-talk.macros)

;; sometime you want to write almost the same code 

;; We're looking for code like this

(html/page [:body [:form
                   (text-field "first_name")
                   (password-field "passwd")
                   (date-field "start_date")]])

(defn text-field [name] [:input {:type "text" :name name}])

(defn password-field [name] [:input {:type "password" :name name}])

(defn date-field [name] [:input {:type "date" :name name}])

;; Kind of tedious and error prone - macros to the rescue

(defmacro def-field [field-type]
  `(defn ~(symbol (str field-type "-field"))
     [field-name#]
     [:input {:type ~field-type :name field-name#}]))

(def-field "date")
(def-field "password")
(def-field "text")

[:body [:form
        (text-field "first_name")
        (password-field "passwd")
        (date-field "start_date")]]
