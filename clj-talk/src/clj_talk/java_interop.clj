(ns clj-talk.java-interop
  (:require [clojure.string :as str]))


;; (.instanceMember instance args*)

(.toUpperCase "hello")

(str/upper-case "hello")

(.getName String)
