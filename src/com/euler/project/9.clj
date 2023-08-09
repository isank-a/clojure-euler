(ns com.euler.project.9)

;; A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
;; a^2 + b^2 = c^2.
;; For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
;; There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.

(defn- is-triplet? [a b c]
  (= (+ (* a a) (* b b)) (* c c)))

(defn special-pythagorean-triplet [x] (first (for [a (range 1 x)
                                                   b (range a (- x a))
                                                   :let [c (- x a b)]
                                                   :when (and (> c b) (is-triplet? a b c))]
                                               (* a b c))))
