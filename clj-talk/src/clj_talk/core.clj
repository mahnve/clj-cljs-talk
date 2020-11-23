(ns clj-talk.core)

;; Welcome to Clojure! 
;; This is a short code based introduction to Clojure

;; Clojure is a member of the Lisp family of languages. 
;; Lisp stands for LISt Processing, and indeed, Lisp has a lot of lists.  
;; This a list

'(1 2 3)

;; Everything in a Lisp is an expression, that can be evaluated. This means that the above list can be evaluated. 

;; Lists can hold anything

'("A Forest" 1 2)

;; Lisp programs are build with lists into operations.
;; The interpretator reads the list and evaluates it.
;; This is how addition is done

(+ 1 2 9)

;; quote is function that returns a list

(quote (+ 1 2))

;; There is also reader macro for that, which is what we saw in the beginning

'(+ 1 2)


;; The first element in the list is the symbol for a
;; function. In this case there is a function called "+"


;; This is a string

"Glittering Prize"

;; Only doublequotes btw

;; This is a keyword. You Ruby/Smalltalk people recognize them

:a

;; Arrays are a form of lists

[1 3 4]

;; This is a map
;; (dict for you python people, and a hash if you're from Ruby)

{:a 1 :b 2}

;; Commas are syntactic sugar, use them if needed, but I don't really ever see them

;; They can be nested

{:a 1 :b {:c 3 :d 4}}

;; We like to have keywords as map keys, but anything will do

{1 3 3 4 "Somebody" :f}

;; Sets

#{1 2 4}

;; Regexps

#"^hello.*"

(re-seq #"Some\w*" "Someone, Somewhere, In Summertime")

;; List allow stuff like the plus function taking arbitrary number of args

(+ 1 2 3 4 5 6)

;; Division is fun

(/ 1 3)
(/ 1 3.0)

(/ 1 3 4)

;; Automatic conversion to Big(Int|Long)

(class  (* 9999999999999999 888888888888888888888888))

;; Symbols

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
   (greeting "William, it was really nothing")))

(greeting)
(greeting "Sylvie")


;; def multi

(defmulti area :shape)

(defmethod area :circle [{:keys [r]}]
  (* Math/PI r r))

(defmethod area :rectangle [{:keys [l w]}]
  (* l w))

(area {:shape :circle :r 5})

(area {:shape :rectangle :l 2 :w 5})
