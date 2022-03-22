(ns girouette-issue-90.events
  (:require
   [re-frame.core :as re-frame]
   [girouette-issue-90.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
