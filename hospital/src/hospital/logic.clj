(ns hospital.logic)

; Test Driven Development
; Test Driven Design

; Existe um problema de condicional quando o departamento não existe
;(defn cabe-na-fila?
;  [hospital departamento]
;  (-> hospital
;      departamento
;      count
;      (not=< 5)))

; Funciona para o caso de não ter departamento
(defn cabe-na-fila?
  [hospital departamento]
  (when-let [fila (get hospital departamento)]
      (-> fila
      count
      (< 5))))

; Também funciona, mas usa o some->
; Desvantagem/vantagem "menos explícito"
; Desvantagem qq um que der nil, devolve nil
;(defn cabe-na-fila?
;  [hospital departamento]
;  (some-> hospital
;          departamento
;          count
;          (< 5)))