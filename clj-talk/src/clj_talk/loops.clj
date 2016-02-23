(ns clj-talk.loops)


;; let allows for local assignment
(let [no-of-chars (apply max (map count ["words" "come" "so" "easily"]))]
  (str "The longest word is " no-of-chars " chars long"))
;; if statement

(if false
  "This is true"
  "This is false")

;; if true, the statement is evaluated, if false the second.
;; So, what happens if there is only one statement?

(if false
  "this is true")

;; Can be simplified into when

(when false
  "this is true"
  "this might be true")

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

