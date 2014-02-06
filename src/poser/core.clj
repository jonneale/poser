(ns  poser.core)

(def blank
  "")

(def space
  " ")

(def zero-nine
  (range 0 10))

(def A-Z
  (map char (range 65 91)))

(defn valid-postcode?
  [postcode]
  (not (nil? (re-find #"([A-Z]{1,2}[0-9R][0-9A-Z]?)\s*([0-9][A-Z]{2})$" (clojure.string/upper-case postcode)))))

(def ^:private postcode-specification
  [A-Z (into A-Z blank) (into zero-nine "R") (reduce into [zero-nine A-Z blank]) [space] zero-nine A-Z A-Z])

(defn random-postcode
  []
  (apply str (map (comp first shuffle) postcode-specification)))

(defn all-postcodes
  []
  (for [o1 A-Z
        o2 (into A-Z blank)
        o3 (into zero-nine "R")
        o4 (reduce into [zero-nine A-Z blank])
        s space
        i1 zero-nine
        i2 A-Z
        i3 A-Z]
    (str o1 o2 o3 o4 s i1 i2 i3)))
