(ns com.euler.project.7)

;; By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
;; What is the 10001st prime number?

(defn- is-remainder-zero [dividend]
  (fn [divisor]
    (zero? (rem dividend divisor))))

(defn- prime-range [n]
  (range 3 (inc' (Math/floor (Math/sqrt n))) 2))

(defn is-prime? [n]
  (cond
    (and (> n 1) (<= n 3)) true
    (even? n) false
    :else (not-any? (is-remainder-zero n) (prime-range n))))

(defn prime-at [x] (->> (range 2 Integer/MAX_VALUE)
                        (filter is-prime?)
                        (take x)
                        (last)))
