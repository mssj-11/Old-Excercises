const http = require('http');

//Requerimiento y Respuesta
const server = http.createServer((req, res) => {
    res.end('Respondinedo a la solicitud');
});

// Puerto
const puerto = 3000;
server.listen(puerto, () => {
    console.log('Escuchando la solicitud');
});