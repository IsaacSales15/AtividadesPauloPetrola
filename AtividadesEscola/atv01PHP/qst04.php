<?php

while (true){
    echo "DIgite a hora atual: ";
    $hora = intval(readline());

    if ($hora >= 5 && $hora <= 11) {
        echo "Bom dia!\n";
    } elseif ($hora >= 12 && $hora <= 18) {
        echo "Boa tarde!\n";
    } elseif ($hora >= 19 && $hora <= 23) {
        echo "Boa noite!\n";
    } elseif ($hora <= 4 || $hora >= 24) { 
        echo "Vai dormir, seu fela!\n";
    }
}

?>