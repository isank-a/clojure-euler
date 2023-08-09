(ns com.euler.project.9-test
  (:require
   [clojure.test :refer [deftest is]]
   [com.euler.project.9 :as subject]))

(deftest special-pythagorean-triplet-test
  (is (= 31875000
         (subject/special-pythagorean-triplet 1000))))