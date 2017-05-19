(ns clj-talk.destructuring)

;; let for local variable assignment


(defn multiplier [{a :a b :b}]
  (* a b))

(multiplier {:a 3 :b 4})

(defn same-same-but-different [{:keys [a b]}]
  (* a b))

(same-same-but-different {:a 3 :b 8})

(defn my-first [[f]]
  (str "The first one: " f))

(my-first ["a" "b"])
