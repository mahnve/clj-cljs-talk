(ns clj-talk.async)

(let [a (future
          (println "about to sleep")
          (Thread/sleep 4000)
          (println "done sleeping")
          "done")]
  (println "in main")
  (println @a))
