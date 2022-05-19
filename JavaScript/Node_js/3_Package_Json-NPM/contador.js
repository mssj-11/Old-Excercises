const {animales, años} = require('./animales');
const cowsay = require("cowsay");

console.log(cowsay.say({
    text: "Soy el Modulo",
    e: "o0",
    T: "U "
}));

animales.forEach(item => {
    console.count(item);
});

console.log(años);