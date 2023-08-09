(ns com.euler.project.8-test
  (:require
   [clojure.test :refer [deftest is]]
   [com.euler.project.8 :as subject]))

(deftest largest-product-test
  (is (= 5832
         (subject/largest-product 4)))
  (is (= 23514624000
         (subject/largest-product 13))))