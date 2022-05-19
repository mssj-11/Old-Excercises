/* Concurrencia, Ciclo de Eventos y I/O no bloqueante   Node js    */
var books = ['The Fellowship of the Ring', 'The Two Towers', 'The Return of the King'];

function serveBooks(){
    var html = '<b>' + books.join('</b></br><b>')+'</b>';
    books = []; //  Intentionally Cleaned
}