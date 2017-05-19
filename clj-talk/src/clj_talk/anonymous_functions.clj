(ns clj-talk.anonymous-functions)

;; Things that start with a #

;; Anonymous functions

(fn [x] (* x 2))

;; is the same thing as

#(+ % 2)

(#(* % 2) 4)

;; More args

(fn [x y] (* x y))

;; is the same thing as

#(* %1 %2)

(#(* %1 %2) 2 4)
