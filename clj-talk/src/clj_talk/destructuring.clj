(ns clj-talk.destructuring)

;; let for local variable assignment

(let [a 2 b 3]
  (* a b))

(def a-list {:a 3 :b 4 :c 5})

(let [a (:a a-list)]
  (* a a))

(let [{a :a} a-list]
  (* a a))
