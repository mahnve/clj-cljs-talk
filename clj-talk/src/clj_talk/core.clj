(ns clj-talk.core)



;; Lists are the basic building block in Lisps
;; Clojure is a Lisp
;; This a list

'(1 2 3)

;; Lists can hold anything

'("this is a list" 1 2)

;; Lisp programs are build with lists into operations.
;; The interpretator reads the list and evaluates it.
;; This is how addition is done

(+ 1 2)

;; The first element in the list is the symbol for a
;; function. In this case there is a function called "+"


;; This is a string

"Hello"

;; Only doublequotes btw

;; This is a keyword. You Ruby/Smalltalk people recognize them

:3

;; Arrays are a form of lists

[1 3 4]

;; This is a map
;; (dict for you python people, and a hash if you're from Ruby)

{:a 1 :b 2}

;; Commas are syntactic sugar, use them if needed, but I don't really ever see them

;; They can be nested

{:a 1 :b {:c 3 :d 4}}

;; We like to have keywords as map keys, but anything will do

{1 3 3 4 "something" :f}



;; The plus function can take multiple arguments

(+ 1 2 3 4 5 6)

;; Division is fun

(/ 1 3)
(/ 1 3.0)

(/ 1 3 4)

;; Automatic conversion to Big(Int|Long)

(class  (* 9999999999999999 888888888888888888888888))

;; Symbols
;; TODO
(def a-symbol 1)

;; Functions

(fn [x] (* x 2))

((fn [x] (* x 2)) 2)

;; Give a function a name
(def doubler (fn [x] (* x 2)))

(doubler 2)

;; defn is a shortcut
(defn tripler [x] (* x 3))

(tripler 4)

;; Multi arity
(defn greeting
  ([name]
   (str "Hello there, " name))
  ([]
   (greeting "handsome stranger")))

(println (greeting))
