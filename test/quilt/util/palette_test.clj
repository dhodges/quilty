(ns quilt.util.palette-test
  (:require
   [clojure.test :refer [deftest is testing]]
   [quilt.util.palette :refer [hex-to-rgb]]))

(deftest hex-to-rgb-test
  (is (= [255 255 255] (hex-to-rgb "#ffffff")))
)
