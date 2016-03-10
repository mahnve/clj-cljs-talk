(ns mnam.namer
  (:require [clojure.string :as s]))

(def agile-methods ["XP" "RUP" "Scrum" "Kanban" "Crystal" "FDD" "SAFe" "LeSS"])
(def prefixes ["Extreme" "Lean" "Safe" "Disciplined" "Scaled" "Waterfallish"])
(def suffixes ["Ban"])

(defn suffix []
  (if (> 8 (rand-int 10))
    (apply str (repeat (rand 3) (rand-nth suffixes)))
    ""))

(defn random-case [string]
  (if (< 5 (rand-int 10))
    (s/upper-case string)
    (s/lower-case string)))

(defn crazy-case [string]
  (apply str (map random-case string)))

(defn new-method []
  (let [new-name (str (rand-nth prefixes) " " (rand-nth agile-methods) (suffix))]
    (if (< 5 (rand-int 10))
      (crazy-case new-name)
      new-name)))

