(ns looping-is-recursion)

(defn power-helper [base exp acc]
  (if (zero? exp)
    acc
    (recur exp (dec exp) (* base acc))
    ))

(defn power [base exp]
  (power-helper base exp 1))



(defn last-element [a-seq]
  ":(")

(defn seq= [seq1 seq2]
  ":(")

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

