(ns clj-talk.core)

;; Lists are the basic building block in Lisps
;; Clojure is a Lisp
;; This a list

'(1 2 3)

;; Lists can hold anything

'("this is a list" 1 2)

;; This is a string

"Hello"

;; This is a keyword. You Ruby/Smalltalk people recognize them

:3

;; Lisp programs are build with lists.
;; The interpretator reads the list and evaluates it.
;; This is how addition is done

(+ 1 2)

;; The first element in the list is the symbol for a
;; function. In this case there is a function called "+"

;; The plus function can take multiple arguments

(+ 1 2 3 4 5 6)

;; Arrays are a form of lists

[1 3 4]

;; This is a dict

{:a 1 :b 2}



;; We like to have keywords as map keys

(+ 1 1)

;;

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
