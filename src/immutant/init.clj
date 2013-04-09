(ns immutant.init
  (:use immutant-demo.core)
  (:require [immutant.messaging :as messaging]
            [immutant.web :as web]))

(web/start "/" #'ring-handler)