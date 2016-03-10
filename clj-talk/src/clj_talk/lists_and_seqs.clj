(ns clj-talk.lists-and-seqs)

;; Lists can be constructed with functions

(list 1 2 3)

(vector 1 2 3)

(hash-set 1 2 2 3)

(hash-map :a 1 :b 2)

;; It's better to have 100 methods acting on one data type that 10 data types with 10 methods each
;; - Alan Perlis

(count "There Is A Light That Never Goes Out")

(count [1 2 3])

(count {:a 1 :b 2 :c 3})

;; The classic car/cdr has readable names

(first "hello")

(first [1 2 3])

(first {:a 1 :b 2 :c 3})

(rest "hello")

(rest [1 2 3])

(rest {:a 1 :b 2 :c 3})


;; Accessing maps

(get {:a 1 :b 2} :a)

;; defaults

(get {:a 1 :b 2} :c "It's No Good")

;; keys as function. Crazy stuff

(:a {:a 1 :b 2})

({:a 1 :b 2} :a)

;; no defaults -> returns nil

(:c {:a 1 :b 2})


;; Modification

(conj [1 2 3] 4)

;; Done in most efficient manner
(conj '(1 2 3) 4)

;; Sort

(sort [1 3 4 5 2])

(sort-by count ["Cold" "Just Like Heaven" "Inbetween Days"])
;; max apply

(max 1 2 3)

(max [1 2 3])

(apply max [1 2 3])

(apply + [3 4])

;; into

(into [2 3] [1 4]) 

(into {:a 1} {:b 2 :c 3})

;; assoc
;; vector associates in pos
(assoc [1 2] 0 2)

;; maps
;; Takes arbitrary number of arguments
(assoc {:a 1} :b 2 :c 3)

;; assoc-in takes an array of keys to walk the map
(assoc-in {:a {:b 2}} [:a :c] 4)





