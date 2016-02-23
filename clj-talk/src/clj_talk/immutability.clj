(ns clj-talk.immutability)

(def a (atom {}))

(swap! a #(assoc % :a 1))

@a
