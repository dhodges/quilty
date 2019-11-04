(ns quilty.random-rects
  (:require [quil.core :as q]
            [quil.middleware :as m]
            [quilty.palette :refer [rand-palette rand-color]]))

(defn setup
  ([]
   (setup {}))
  ([state]
   (q/frame-rate 1)
   {}))

(defn draw-random-rectangle
  ([]
   (draw-random-rectangle (rand-palette)))
  ([palette]
   (q/no-fill)
   (q/stroke-weight 10)
   (apply q/stroke (rand-color palette))
   (let [x      (q/random   5 (- (q/width)   5))
         y      (q/random   5 (- (q/height)  5))
         width  (q/random  10 (- (q/width)  10 x))
         height (q/random  10 (- (q/height) 10 y))
         radius (q/random   5 30)]
     (q/rect x y width height radius))))

(defn draw [state]
  (let [palette (rand-palette)]
    (apply q/fill (:background palette))
    (q/stroke-weight 0)
    (q/rect 0 0 (q/width) (q/height))
    (dotimes [n (q/random 1 5)]
      (draw-random-rectangle palette))))

(q/defsketch hello
  :draw draw
  :setup setup
  :host "sketch"
  :middleware [m/fun-mode]
  :size [500 500])
