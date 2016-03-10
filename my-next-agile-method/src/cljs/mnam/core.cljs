(ns mnam.core
  (:require [reagent.core :as reagent :refer [atom]]
            [reagent.session :as session]
            [ajax.core :refer [GET]]
            [secretary.core :as secretary :include-macros true]
            [accountant.core :as accountant]))



(def method (atom ""))


(defn handler [response]
  (reset! method (str response)))

(defn get-new-method []
  (GET "/new-method" {:handler handler}))

;; -------------------------
;; Views

(defn home-page []
  [:div [:h1 "My Next Agile Method Is"]
   [:h2 @method]
   [:input {:type "button" :value "Another!" :on-click get-new-method }]])

(defn current-page []
  [:div [(session/get :current-page)]])

;; -------------------------
;; Routes

(secretary/defroute "/" []
  (do 
    (session/put! :current-page #'home-page)))

;; -------------------------
;; Initialize app

(defn mount-root []
  (get-new-method)
  (reagent/render [current-page] (.getElementById js/document "app")))

(defn init! []
  (accountant/configure-navigation!
   {:nav-handler
    (fn [path]
      (secretary/dispatch! path))
    :path-exists?
    (fn [path]
      (secretary/locate-route path))})
  (accountant/dispatch-current!)
  (mount-root))
