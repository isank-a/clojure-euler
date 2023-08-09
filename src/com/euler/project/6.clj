(ns com.euler.project.6)

;; The sum of the squares of the first ten natural numbers is,
;; 1^2 + 2^2 + ... + 10^2 = 385.
;; The square of the sum of the first ten natural numbers is,
;; (1 + 2 + ... + 10)^2 = 55^2 = 3025.
;; Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
;; Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

(def square-of #(* % %))

(def sum-of #(apply + %))

(defn sum-square-difference [x] (let [first-x-numbers (range 1 (inc x))]
                                  (- (square-of (sum-of first-x-numbers))
                                     (sum-of (map square-of first-x-numbers)))))
