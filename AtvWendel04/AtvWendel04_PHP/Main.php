<?php 
include 'Pessoa.php'; 

$pessoa = new Pessoa("Pedro", "2004-02-27");
$pessoa->surname = "Zé bigode";
echo $pessoa->hello();
