(ns clj-talk.destructuring)

;; let for local variable assignment

(let [a 2 b 3]
  (* a b))

(def a-list {:a 3 :b 4 :c 5})


(defn multiplier [{a :a b :b}]
  (* a b))

(multiplier {:a 3 :b 4})


(defn same-same-but-different [{:keys [a b]}]
  (* a b))

(same-same-but-different {:a 3 :b 8})
(defn my-first [[first]]
  (str "The first one: " first))

(my-first ["a" "b"])
