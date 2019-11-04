(ns quilty.palette-test
  (:require
   [clojure.test :refer [deftest is testing]]
   [quilty.palette :refer [hex-to-rgb]]))

(deftest hex-to-rgb-test
  (is (= [255 255 255] (hex-to-rgb "#ffffff")))
)
