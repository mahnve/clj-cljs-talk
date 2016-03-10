(ns clj-talk.threading)

;; Sometimes you get a long list of calls:

(dissoc
 (assoc {:a 1 :b 2} :c 1)
 :b)

;; Sort of hard to read

;; Threading to the rescue!
;; Thread first insert as first argument

(-> {:a 1 :b 2} (assoc :c 1) (dissoc :b))

;; Thread-last inserts last

(map #(* % %) (filter odd? (range 100)))

(->> (range 100) (filter odd?) (map #(* % %)))

