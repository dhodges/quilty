(ns quilty.core
  (:require [quil.core :as q :include-macros true]
            [quil.middleware :as m]))

(defn setup [state]
  (q/background 255)
  (q/fill 0)
  {})

(defn draw [state]
  (q/ellipse 56 46 55 55))

(q/defsketch hello
  :draw draw
  :setup setup
  :host "sketch"
  :middleware [m/fun-mode]
  :size [300 300])
