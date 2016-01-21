(ns arithmetic.core
  (:require [clojure.math.numeric-tower :as math]))

(def interest 0.1)

(defn cumulative-interest [initial-amount interest years]
  (* initial-amount (math/expt (+ 1 interest) years)))
