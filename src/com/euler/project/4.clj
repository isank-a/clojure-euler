(ns com.euler.project.4)

(defn- is-palindrome [x]
  (let [x-str (str x)]
    (= (seq x-str) (reverse x-str))))

(defn- perms [start end] (for [set-a (range start end)
                               set-b (range set-a end)]
                           (* set-a set-b)))

(defn largest-palindrome [start end] (->> (perms start end)
                                          (filter is-palindrome)
                                          (reduce max)))
