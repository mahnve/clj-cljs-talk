(ns clj-talk.java-interop
  (:require [clojure.string :as str]))

(.toUpperCase "hello")

(str/upper-case "hello")

(.getName String)

;; Swing

(import '(javax.swing JLabel JButton JPanel JFrame))

(defn counter-app []
  (let [label (JLabel. "A label")
        button (JButton. "Click me")
        panel (JPanel.)
        frame (JFrame. "An App That Does Nothing")]
    (.setOpaque panel true)
    (.add panel label)
    (.add panel button)
    (.setContentPane frame panel)
    (.setSize frame 300 100)
    (.setVisible frame true)))

(counter-app)
