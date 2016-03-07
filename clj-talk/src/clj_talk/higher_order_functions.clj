(ns clj-talk.higher-order-functions)

;; It all just functions and data

((first [* "I won't do anything"]) 5 3)

;; Higher order functions are functions that take functions as parameters

;; map returns a new collection with function run for every list member
(map #(* % 80) [1 4 5 6])

(map inc "hello")

;; filter returns a new collection with all list members that passes predicate
(filter #(= 3 (count %)) ["bear" "dog" "wolf" "cat"])

(filter even? [1 2 3 4 5])

;; reduce runs through list applying func for every member
(reduce * (range 1 10))

;; can take start argument
(reduce * 500 (range 1 10))


(take 3 [1 2 3 4 5 6 7])

(drop 3 [1 2 3 4 5 6 7])

;; take-while takes until predicate fails
(take-while #(< % 4) [1 2 3 4 5 6 7])

;; Lazy and infinite seqs
(take 100 (repeat "1 million bottles of beer on the wall"))

(take 3 (repeatedly #(rand-int 10)))

;; Functions returning functions

;; Closure
(defn greeting [greeting-string]
  (fn [guest]
    (str greeting-string guest)))

(let [greet (greeting "Welcome to the Pleasure Dome, ")]
  (greet "Marcus"))


;; Partial

(def add-10 (partial + 10))

(add-10 20)


;; complement

(defn is-my-name [candidate]
  (= candidate "Marcus"))

(def is-not-my-name (complement is-my-name))

(is-not-my-name "Jens")

