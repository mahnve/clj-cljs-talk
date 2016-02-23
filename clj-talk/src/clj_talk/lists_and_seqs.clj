(ns clj-talk.lists-and-seqs)

;; Lists can be constructed with functions

(list 1 2 3)

(vector 1 2 3)

(hash-set 1 2 2 3)

(hash-map :a 1 :b 2)

;; It's better to have 100 methods acting on one data type that 10 data types with 10 methods each
;; - Alan Perlis

(count "hello")

(count [1 2 3])

(count {:a 1 :b 2 :c 3})

;; The classic car/cdr has readable names

(first "hello")

(first [1 2 3])

(first {:a 1 :b 2 :c 3})

(rest "hello")

(rest [1 2 3])

(rest {:a 1 :b 2 :c 3})


;; Accessing dicts

(get {:a 1 :b 2} :a)

;; defaults

(get {:a 1 :b 2} :c "unknown")

;; keys as methods. Crazy stuff

(:a {:a 1 :b 2})

({:a 1 :b 2} :a)

;; no defaults -> returns nil

(:c {:a 1 :b 2})


;; Modification

(conj [1 2 3] 4)

;; Done in most efficient manner
(conj '(1 2 3) 4)


;; max apply

(max 1 2 3)

(max [1 2 3])

(apply max [1 2 3])

(apply + [3 4])
