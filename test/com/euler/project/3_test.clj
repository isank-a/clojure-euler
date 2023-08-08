(ns com.euler.project.3-test
  (:require
   [clojure.test :refer [deftest is]]
   [com.euler.project.3 :as subject]))

(deftest largest-prime-test
  (is (= 29
         (subject/largest-prime 13195)))
  (is (= 6857
         (subject/largest-prime 600851475143))))