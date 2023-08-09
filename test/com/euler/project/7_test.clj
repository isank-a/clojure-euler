(ns com.euler.project.7-test
  (:require
   [clojure.test :refer [deftest is]]
   [com.euler.project.7 :as subject]))

(deftest prime-at-test
  (is (= 13
         (subject/prime-at 6)))
  (is (= 104743
         (subject/prime-at 10001))))