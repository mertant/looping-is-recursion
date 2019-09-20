(ns looping-is-recursion)

(defn power-helper [base exp acc]
  (if (zero? exp)
    acc
    (recur base (dec exp) (* base acc))
    ))

(defn power [base exp]
  (power-helper base exp 1))



(defn last-element [a-seq]
    (if (empty? (rest a-seq))
      (first a-seq)
      (recur (rest a-seq))
      ))

(defn seq= [seq1 seq2]
  (if (and (empty? seq1) (empty? seq2))
    true
    (if (and (= (first seq1) (first seq2)) (not (nil? (first seq1))))
      (recur (rest seq1) (rest seq2))
      false
      )))

(defn find-first-index [pred a-seq]
  (loop [r a-seq
         i 0]
    (if (empty? r)
      nil
      (if (pred (first r))
        i
        (recur (rest r) (inc i))
        )
      ))
  )

(defn avg [a-seq]
  (loop [remaining a-seq
         sum 0
         n 0]
    (if (empty? remaining)
      (/ sum n)
      (recur (rest remaining) (+ sum (first remaining)) (inc n))
      )))

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

