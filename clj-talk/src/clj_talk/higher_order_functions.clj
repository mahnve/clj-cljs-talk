(ns clj-talk.higher-order-functions)

;; Higher order functions are functions that take functions as parameters

;; map returns a new collection with function run for every list member
(map #(* % 80) [1 4 5 6])

;; filter returns a new collection with all list members that passes predicate
(filter #(= 3 (count %)) ["bear" "dog" "wolf" "cat"])

(filter even? [1 2 3 4 5])

;; reduce runs through list applying func for every member
(reduce * (range 1 10))

;; can take start argument
(reduce * 500 (range 1 10))

;; Functions returning functions

;; Closure
(defn greeting [greeting-string]
  (fn [guest]
    (str greeting-string guest)))

(let [greet (greeting "Welcome to the Pleasure Dome, ")]
  (greet "Marcus"))


