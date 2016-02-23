(ns clj-talk.loops)


;; let allows for local assignment
(let [no-of-chars (apply max (map count ["vicar" "in" "a" "tutu"]))]
  (str "The longest word is " no-of-chars " chars long"))
;; if statement

(if false
  "You Have Everything Now"
  "Still Ill")

;; if true, the statement is evaluated, if false the second.
;; So, what happens if there is only one statement?

(if false
  "This Is A Lie")

;; nil and false check in let

(if-let [a nil]
  (str "a is " a)
  "It's No Good")
;; Can be simplified into when

(when false
  "this never happens")

;; standard or

(or true false)

(or false)
;; standard and

(and true false)
(and true)
;; Ahh ... nil

(nil? nil)

;; nil is falsey

(if nil
  "nil is true"
  "nil is false")
;; for loop

(for [x (range 5)]
  (+ x 3))



;; loop and recur

(loop [counter 0]
  (println (str "Iteration " counter))
  (if (> counter 4)
    (println "bye then")
    (recur (inc counter))))

