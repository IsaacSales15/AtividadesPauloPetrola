<?php
$n1 = intval(readline("Coloque o primeiro número: "));
$n2 = intval(readline("Coloque o segundo número: "));
$op = readline("Coloque a operação: ");

$cal = new Calculo();
$cal->Soma($n1, $n2);
$resultado = $cal->Operacao($op, $n1, $n2);
echo "O resultado é: $resultado\n";
$hora = $cal->Hora();
echo "$hora\n";
