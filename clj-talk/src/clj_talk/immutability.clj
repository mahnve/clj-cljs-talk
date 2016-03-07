(ns clj-talk.immutability)

;; Clojure has a lot of ways to handle state safely - atom is the one most
;; commonly used

(def a (atom {}))

(swap! a #(assoc % :a 1))

;; access the value by deref/@
@a
(deref a)
