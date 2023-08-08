(ns com.euler.project.4-test
  (:require
   [clojure.test :refer [deftest is]]
   [com.euler.project.4 :as subject]))

(deftest largest-palindrome-test
  (is (= 9009
         (subject/largest-palindrome 10 100)))
  (is (= 906609
         (subject/largest-palindrome 100 1000))))