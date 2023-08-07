(ns com.euler.project.1-test
  (:require
   [clojure.test :refer [deftest is]]
   [com.euler.project.1 :as subject]))

(deftest sum-of-multiple-of-3-and-5-test
  (is (= 23
         (subject/sum-of-multiple-of-3-and-5 10)))
  (is (= 78
         (subject/sum-of-multiple-of-3-and-5 20)))
  (is (= 233168
         (subject/sum-of-multiple-of-3-and-5 1000))))