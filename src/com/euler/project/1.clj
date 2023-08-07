(ns com.euler.project.1)

;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.

(defn- is-remainder-zero [dividend]
  (fn [divisor]
    (zero? (rem dividend divisor))))

(defn- divisible-by [divisors]
  (fn [dividend]
    (some (is-remainder-zero dividend) divisors)))

(def divisible-by-3-or-5 (divisible-by [3 5]))

(defn sum-of-multiple-of-3-and-5 [rng] (->> (range rng)
                                            (filter divisible-by-3-or-5)
                                            (reduce +)))
