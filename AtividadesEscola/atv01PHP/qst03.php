<?php
echo "Digite o seu nome:";
$nome = trim(fgets(STDIN));
$i = 0;

while ($i<=10){
    echo "Buenos días, $nome\n";
    $i++;
}
?>