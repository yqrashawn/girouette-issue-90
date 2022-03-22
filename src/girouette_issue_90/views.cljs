(ns girouette-issue-90.views
  (:require
   ["@radix-ui/react-checkbox" :as CheckBox]
   [reagent.core :refer [adapt-react-class]]
   [re-frame.core :as re-frame]
   [girouette-issue-90.subs :as subs]))

;; uncomment below line and there's parse error
;; (def check-box-root (adapt-react-class CheckBox/Root))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1.m-px
      "Hello from " @name]]))
