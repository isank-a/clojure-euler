(ns com.euler.project.5-test
  (:require
   [clojure.test :refer [deftest is]]
   [com.euler.project.5 :as subject]))

(def divisible-through-1-to-10 (subject/divisble-by (range 1 11)))
(def divisible-through-1-to-20 (subject/divisble-by (range 1 21)))

(deftest smallest-dividend-test
  (is (= 2520
         (subject/smallest-dividend divisible-through-1-to-10)))
  (is (= 232792560
         (subject/smallest-dividend divisible-through-1-to-20))))