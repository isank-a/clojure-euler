(ns com.euler.project.2-test
  (:require
   [clojure.test :refer [deftest is]]
   [com.euler.project.2 :as subject]))

(deftest fib-sum-test
  (is (= 4613732
         (subject/fib-sum))))