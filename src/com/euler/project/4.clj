(ns com.euler.project.4)

;; A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 x 99.
;; Find the largest palindrome made from the product of two 3-digit numbers.

(defn- is-palindrome [x]
  (let [x-str (str x)]
    (= (seq x-str) (reverse x-str))))

(defn- perms [start end] (for [set-a (range start end)
                               set-b (range set-a end)]
                           (* set-a set-b)))

(defn largest-palindrome [start end] (->> (perms start end)
                                          (filter is-palindrome)
                                          (reduce max)))
