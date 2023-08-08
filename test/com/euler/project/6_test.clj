(ns com.euler.project.6-test
  (:require
   [clojure.test :refer [deftest is]]
   [com.euler.project.6 :as subject]))

(deftest sum-square-difference-test
  (is (= 2640
         (subject/sum-square-difference 10)))
  (is (= 25164150
         (subject/sum-square-difference 100))))