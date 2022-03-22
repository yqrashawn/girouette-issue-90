(ns hooks
  (:require
   [girouette.processor :as css-processor]))

(defn compile-css
  {:shadow.build/stage :configure}
  [build-state & _]
  (css-processor/process {:css           {:output-file "resources/public/css/compiled/main.css"}
                          :watch?        true
                          :verbose?      true})
  build-state)
