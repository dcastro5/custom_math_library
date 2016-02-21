(ns cmathlib.core)

(defn clear [] (dotimes [i 22] (println)))

(defn dr [x] (/ x (/ 360 (* 2 Math/PI))))

(defn sind [x] (Math/sin (dr x)))

(defn cosd [x] (Math/cos (dr x)))

(defn tand [x] (Math/tan (dr x)))

(defn rd [x] (* x (/ 360 (* Math/PI))))

(defn asind [x] (rd (Math/asin x)))

(defn acosd [x] (rd (Math/acos x)))

(defn atand [x] (rd (Math/atan x)))

(defn csec [x] (/ 1 (Math/sin x)))

(defn seca [x] (/ 1 (Math/cos x)))

(defn ctan [x] (/ 1 (Math/tan x)))

(defn csecd [x] (csec (dr x)))

(defn secad [x] (seca (dr x)))

(defn ctand [x] (ctan (dr x)))

(defn geomean [x y] (Math/sqrt (* x y))) 
