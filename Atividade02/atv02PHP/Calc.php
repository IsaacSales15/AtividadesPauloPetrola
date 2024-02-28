<?php
class Calculo {
    // Questão 1
    public function Soma($n1, $n2) {
        $resultado = $n1 + $n2;
        echo "O resultado da soma é: $resultado\n";
    }

    // Questão 2
    public function Operacao($op, $n1, $n2) {
        switch ($op) {
            case "+":
                return $n1 + $n2;
            case "-":
                return $n1 - $n2;
            case "*":
                return $n1 * $n2;
            case "/":
                return $n1 / $n2;
            default:
                return "Operação inválida";
        }
    }

    // Questão 3
    public function Hora() {
        $horaAtual = date("G");
        if ($horaAtual >= 5 && $horaAtual < 12) {
            return "Bom dia!";
        } elseif ($horaAtual >= 12 && $horaAtual < 18) {
            return "Boa tarde!";
        } elseif ($horaAtual >= 19 && $horaAtual < 24) {
            return "Boa noite!";
        } else {
            return "Vai dormir, seu fela!";
        }
    }
}