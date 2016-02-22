(ns clj-talk.higher-order-functions)

;; Higher order functions are functions that take functions as parameters

(map #(* % 80) [1 4 5 6])

(filter #(= 3 (count %)) ["bear" "dog" "wolf" "cat"])

(filter even? [1 2 3 4 5])

;; Functions returning functions

;; Closure
(defn greeting [greeting-string]
  (fn [guest]
    (str greeting-string guest)))

(let [greet (greeting "Welcome to the Pleasure Dome, ")]
  (greet "Marcus"))

(reduce * (range 1 10))

