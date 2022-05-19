/* Concurrencia, Ciclo de Eventos y I/O no bloqueante   Node js    */
console.log('Hello');

setTimeout(function() {
    console.log('World');
}, 5000);   //  Esperara 5 segundos y despues ejecutara el mensaje

console.log('(Im waiting here meanwhile .. but not blocked)');