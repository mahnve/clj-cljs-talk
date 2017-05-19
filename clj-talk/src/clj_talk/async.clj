(ns clj-talk.async)

;; Futures
(let [a (future
          (println "about to sleep")
          (Thread/sleep 4000)
          (println "done sleeping")
          "done")]
  (println "in main")
  (println @a)
  (println "again"))

;; Dereffing a future halts the execution


;; There is also promises and channels


