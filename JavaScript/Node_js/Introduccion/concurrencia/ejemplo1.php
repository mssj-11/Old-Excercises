/* Concurrencia, Ciclo de Eventos y I/O no bloqueante   PHP */
<?php

$books = array("Myst: The Book of Atrus", "Myst: The Book of King", "Myst: The Book of Tina");

serveBooks($books);

function serveBooks($books){
    echo $html = '<b>'.join($books, '</b><br/><b>').'</b>';
    $books = array();   //  Intentionally Cleaned
}

?>