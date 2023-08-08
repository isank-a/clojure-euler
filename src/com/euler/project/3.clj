(ns com.euler.project.3)

;; The prime factors of 13195 are 5, 7, 13 and 29.
;; What is the largest prime factor of the number 600851475143?

(defn- is-remainder-zero [dividend]
  (fn [divisor]
    (zero? (rem dividend divisor))))

(defn- prime-range [n]
  (range 3 (inc' (Math/floor (Math/sqrt n))) 2))

(defn- is-prime? [n]
  (cond
    (and (> n 1) (<= n 3)) true
    (even? n) false
    :else (not-any? (is-remainder-zero n) (prime-range n))))

(defn factor [n] (->> (range 2 (inc n))
                      (filter (is-remainder-zero n))
                      (filter is-prime?)
                      (first)))

(defn factors [n] (loop [n n
                         factors #{}]
                    (if (nil? n)
                      factors
                      (let [factor (factor n)
                            next (if (not (nil? factor)) (/ n factor) nil)]
                        (recur next (conj factors factor))))))

(defn largest-prime [n] (last (sort (factors n))))
