/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod;

/**
 *
 * @author HP
 */
// Conversion from Binary to ASCII or ASCII to Binary
// Created by G. Marshall Brown
// Copyright 2002 G. Marshall Brown
// version 1.0 -- created 4/29/02
// version 1.1 -- modified 12/04/02 Added many characters that weren't in version 1.0.
// version XX -- modified --/--/--
// All rights reserved, no modification without prior consent from creator.
// Usage is free if Copyright statement remains intact.
function dobin(text,sepa) {
var letbin = "";
for (i=0; i<text.length;i++) {

let = text.substr(i,1);
if (i>0) {
var sep = sepa;
if (i % 10 == 0) {
letbin=letbin+'<BR>'
}
}
else {
var sep = "";
}

//Ascii -- Binary Code
if (let == "A") {letbin = letbin + sep + '01000001'}
if (let == "B") {letbin = letbin + sep + '01000010'}
if (let == "C") {letbin = letbin + sep + '01000011'}
if (let == "D") {letbin = letbin + sep + '01000100'}
if (let == "E") {letbin = letbin + sep + '01000101'}
if (let == "F") {letbin = letbin + sep + '01000110'}
if (let == "G") {letbin = letbin + sep + '01000111'}
if (let == "H") {letbin = letbin + sep + '01001000'}
if (let == "I") {letbin = letbin + sep + '01001001'}
if (let == "J") {letbin = letbin + sep + '01001010'}
if (let == "K") {letbin = letbin + sep + '01001011'}
if (let == "L") {letbin = letbin + sep + '01001100'}
if (let == "M") {letbin = letbin + sep + '01001101'}
if (let == "N") {letbin = letbin + sep + '01001110'}
if (let == "O") {letbin = letbin + sep + '01001111'}
if (let == "P") {letbin = letbin + sep + '01010000'}
if (let == "Q") {letbin = letbin + sep + '01010001'}
if (let == "R") {letbin = letbin + sep + '01010010'}
if (let == "S") {letbin = letbin + sep + '01010011'}
if (let == "T") {letbin = letbin + sep + '01010100'}
if (let == "U") {letbin = letbin + sep + '01010101'}
if (let == "V") {letbin = letbin + sep + '01010110'}
if (let == "W") {letbin = letbin + sep + '01010111'}
if (let == "X") {letbin = letbin + sep + '01011000'}
if (let == "Y") {letbin = letbin + sep + '01011001'}
if (let == "Z") {letbin = letbin + sep + '01011010'}
if (let == "a") {letbin = letbin + sep + '01100001'}
if (let == "b") {letbin = letbin + sep + '01100010'}
if (let == "c") {letbin = letbin + sep + '01100011'}
if (let == "d") {letbin = letbin + sep + '01100100'}
if (let == "e") {letbin = letbin + sep + '01100101'}
if (let == "f") {letbin = letbin + sep + '01100110'}
if (let == "g") {letbin = letbin + sep + '01100111'}
if (let == "h") {letbin = letbin + sep + '01101000'}
if (let == "i") {letbin = letbin + sep + '01101001'}
if (let == "j") {letbin = letbin + sep + '01101010'}
if (let == "k") {letbin = letbin + sep + '01101011'}
if (let == "l") {letbin = letbin + sep + '01101100'}
if (let == "m") {letbin = letbin + sep + '01101101'}
if (let == "n") {letbin = letbin + sep + '01101110'}
if (let == "o") {letbin = letbin + sep + '01101111'}
if (let == "p") {letbin = letbin + sep + '01110000'}
if (let == "q") {letbin = letbin + sep + '01110001'}
if (let == "r") {letbin = letbin + sep + '01110010'}
if (let == "s") {letbin = letbin + sep + '01110011'}
if (let == "t") {letbin = letbin + sep + '01110100'}
if (let == "u") {letbin = letbin + sep + '01110101'}
if (let == "v") {letbin = letbin + sep + '01110110'}
if (let == "w") {letbin = letbin + sep + '01110111'}
if (let == "x") {letbin = letbin + sep + '01111000'}
if (let == "y") {letbin = letbin + sep + '01111001'}
if (let == "z") {letbin = letbin + sep + '01111010'}
if (let == " ") {letbin = letbin + sep + '00100000'}

//Numbers:
if (let == "0") {letbin = letbin + sep + '00110000'}
if (let == "1") {letbin = letbin + sep + '00110001'}
if (let == "2") {letbin = letbin + sep + '00110010'}
if (let == "3") {letbin = letbin + sep + '00110011'}
if (let == "4") {letbin = letbin + sep + '00110100'}
if (let == "5") {letbin = letbin + sep + '00110101'}
if (let == "6") {letbin = letbin + sep + '00110110'}
if (let == "7") {letbin = letbin + sep + '00110111'}
if (let == "8") {letbin = letbin + sep + '00111000'}
if (let == "9") {letbin = letbin + sep + '00111001'}

//Special Characters:
if (let == "!") {letbin = letbin + sep + '00100001'}
if (let == """) {letbin = letbin + sep + '00100010'}
if (let == "#") {letbin = letbin + sep + '00100011'}
if (let == "$") {letbin = letbin + sep + '00100100'}
if (let == "%") {letbin = letbin + sep + '00100101'}
if (let == "&") {letbin = letbin + sep + '00100110'}
if (let == "'") {letbin = letbin + sep + '00100111'}
if (let == "(") {letbin = letbin + sep + '00101000'}
if (let == ")") {letbin = letbin + sep + '00101001'}
if (let == "*") {letbin = letbin + sep + '00101010'}
if (let == "+") {letbin = letbin + sep + '00101011'}
if (let == ",") {letbin = letbin + sep + '00101100'}
if (let == "-") {letbin = letbin + sep + '00101101'}
if (let == ".") {letbin = letbin + sep + '00101110'}
if (let == "/") {letbin = letbin + sep + '00101111'}
if (let == ":") {letbin = letbin + sep + '00111010'}
if (let == ";") {letbin = letbin + sep + '00111011'}
if (let == "<") {letbin = letbin + sep + '00111100'}
if (let == "=") {letbin = letbin + sep + '00111101'}
if (let == ">") {letbin = letbin + sep + '00111110'}
if (let == "?") {letbin = letbin + sep + '00111111'}
if (let == "@") {letbin = letbin + sep + '01000000'}
if (let == "[") {letbin = letbin + sep + '01011011'}
if (let == "\") {letbin = letbin + sep + '01011100'}
if (let == "]") {letbin = letbin + sep + '01011101'}
if (let == "^") {letbin = letbin + sep + '01011110'}
if (let == "_") {letbin = letbin + sep + '01011111'}
if (let == "`") {letbin = letbin + sep + '01100000'}
if (let == "{") {letbin = letbin + sep + '01111011'}
if (let == "|") {letbin = letbin + sep + '01111100'}
if (let == "}") {letbin = letbin + sep + '01111101'}
if (let == "~") {letbin = letbin + sep + '01111110'}
if (let == "€") {letbin = letbin + sep + '10000000'}
if (let == "¡") {letbin = letbin + sep + '10100001'}
if (let == "¢") {letbin = letbin + sep + '10100010'}
if (let == "£") {letbin = letbin + sep + '10100011'}
if (let == "¤") {letbin = letbin + sep + '10100100'}
if (let == "¥") {letbin = letbin + sep + '10100101'}
if (let == "¦") {letbin = letbin + sep + '10100110'}
if (let == "§") {letbin = letbin + sep + '10100111'}
if (let == "¨") {letbin = letbin + sep + '10100111'}
if (let == "©") {letbin = letbin + sep + '10101001'}
if (let == "ª") {letbin = letbin + sep + '10101010'}
if (let == "«") {letbin = letbin + sep + '10101011'}
if (let == "¬") {letbin = letbin + sep + '10101100'}
if (let == "­") {letbin = letbin + sep + '10101101'}
if (let == "®") {letbin = letbin + sep + '10101110'}
if (let == "¯") {letbin = letbin + sep + '10101111'}
if (let == "°") {letbin = letbin + sep + '10110000'}
if (let == "±") {letbin = letbin + sep + '10110001'}
if (let == "²") {letbin = letbin + sep + '10110010'}
if (let == "³") {letbin = letbin + sep + '10110011'}
if (let == "´") {letbin = letbin + sep + '10110100'}
if (let == "µ") {letbin = letbin + sep + '10110101'}
if (let == "¶") {letbin = letbin + sep + '10110110'}
if (let == "·") {letbin = letbin + sep + '10110111'}
if (let == "¸") {letbin = letbin + sep + '10111000'}
if (let == "¹") {letbin = letbin + sep + '10111001'}
if (let == "º") {letbin = letbin + sep + '10111010'}
if (let == "»") {letbin = letbin + sep + '10111011'}
if (let == "¼") {letbin = letbin + sep + '10111100'}
if (let == "½") {letbin = letbin + sep + '10111101'}
if (let == "¾") {letbin = letbin + sep + '10111110'}
if (let == "¿") {letbin = letbin + sep + '10111111'}
if (let == "À") {letbin = letbin + sep + '11000000'}
if (let == "Á") {letbin = letbin + sep + '11000001'}
if (let == "Â") {letbin = letbin + sep + '11000010'}
if (let == "Ã") {letbin = letbin + sep + '11000011'}
if (let == "Ä") {letbin = letbin + sep + '11000100'}
if (let == "Å") {letbin = letbin + sep + '11000101'}
if (let == "Æ") {letbin = letbin + sep + '11000110'}
if (let == "Ç") {letbin = letbin + sep + '11000111'}
if (let == "È") {letbin = letbin + sep + '11001000'}
if (let == "É") {letbin = letbin + sep + '11001001'}
if (let == "Ê") {letbin = letbin + sep + '11001010'}
if (let == "Ë") {letbin = letbin + sep + '11001011'}
if (let == "Ì") {letbin = letbin + sep + '11001100'}
if (let == "Í") {letbin = letbin + sep + '11001101'}
if (let == "Î") {letbin = letbin + sep + '11001110'}
if (let == "Ï") {letbin = letbin + sep + '11001111'}
if (let == "Ð") {letbin = letbin + sep + '11010000'}
if (let == "Ñ") {letbin = letbin + sep + '11010001'}
if (let == "Ò") {letbin = letbin + sep + '11010010'}
if (let == "Ó") {letbin = letbin + sep + '11010011'}
if (let == "Ô") {letbin = letbin + sep + '11010100'}
if (let == "Õ") {letbin = letbin + sep + '11010101'}
if (let == "Ö") {letbin = letbin + sep + '11010110'}
if (let == "×") {letbin = letbin + sep + '11010111'}
if (let == "Ø") {letbin = letbin + sep + '11011000'}
if (let == "Ù") {letbin = letbin + sep + '11011001'}
if (let == "Ú") {letbin = letbin + sep + '11011010'}
if (let == "Û") {letbin = letbin + sep + '11011011'}
if (let == "Ü") {letbin = letbin + sep + '11011100'}
if (let == "Ý") {letbin = letbin + sep + '11011101'}
if (let == "Þ") {letbin = letbin + sep + '11011110'}
if (let == "ß") {letbin = letbin + sep + '11011111'}
if (let == "à") {letbin = letbin + sep + '11100000'}
if (let == "á") {letbin = letbin + sep + '11100001'}
if (let == "â") {letbin = letbin + sep + '11100010'}
if (let == "ã") {letbin = letbin + sep + '11100011'}
if (let == "ä") {letbin = letbin + sep + '11100100'}
if (let == "å") {letbin = letbin + sep + '11100101'}
if (let == "æ") {letbin = letbin + sep + '11100110'}
if (let == "ç") {letbin = letbin + sep + '11100111'}
if (let == "è") {letbin = letbin + sep + '11101000'}
if (let == "é") {letbin = letbin + sep + '11101001'}
if (let == "ê") {letbin = letbin + sep + '11101010'}
if (let == "ë") {letbin = letbin + sep + '11101011'}
if (let == "ì") {letbin = letbin + sep + '11101100'}
if (let == "í") {letbin = letbin + sep + '11101101'}
if (let == "î") {letbin = letbin + sep + '11101110'}
if (let == "ï") {letbin = letbin + sep + '11101111'}
if (let == "ð") {letbin = letbin + sep + '11110000'}
if (let == "ñ") {letbin = letbin + sep + '11110001'}
if (let == "ò") {letbin = letbin + sep + '11110010'}
if (let == "ó") {letbin = letbin + sep + '11110011'}
if (let == "ô") {letbin = letbin + sep + '11110100'}
if (let == "õ") {letbin = letbin + sep + '11110101'}
if (let == "ö") {letbin = letbin + sep + '11110110'}
if (let == "÷") {letbin = letbin + sep + '11110111'}
if (let == "ø") {letbin = letbin + sep + '11111000'}
if (let == "ù") {letbin = letbin + sep + '11111001'}
if (let == "ú") {letbin = letbin + sep + '11111010'}
if (let == "û") {letbin = letbin + sep + '11111011'}
if (let == "û") {letbin = letbin + sep + '11111100'}
if (let == "ý") {letbin = letbin + sep + '11111101'}
if (let == "þ") {letbin = letbin + sep + '11111110'}
if (let == "ÿ") {letbin = letbin + sep + '11111111'}

}
binary.innerHTML = letbin
return false;
}

function doasc(text) {

if (text.length % 8 != 0) {
alert (text + " is not an even binary.

You may have missed a digit or maybe added an additional digit/character.

Separaters are NOT required here.")
return false;
last;
}
var letasc = ""
lettot = text.length / 8
j=0
for (i=0; i<lettot;i++) {

let = text.substr(j,8);



if (let == "01000001") {letasc = letasc + 'A'}
if (let == "01000010") {letasc = letasc + 'B'}
if (let == "01000011") {letasc = letasc + 'C'}
if (let == "01000100") {letasc = letasc + 'D'}
if (let == "01000101") {letasc = letasc + 'E'}
if (let == "01000110") {letasc = letasc + 'F'}
if (let == "01000111") {letasc = letasc + 'G'}
if (let == "01001000") {letasc = letasc + 'H'}
if (let == "01001001") {letasc = letasc + 'I'}
if (let == "01001010") {letasc = letasc + 'J'}
if (let == "01001011") {letasc = letasc + 'K'}
if (let == "01001100") {letasc = letasc + 'L'}
if (let == "01001101") {letasc = letasc + 'M'}
if (let == "01001110") {letasc = letasc + 'N'}
if (let == "01001111") {letasc = letasc + 'O'}
if (let == "01010000") {letasc = letasc + 'P'}
if (let == "01010001") {letasc = letasc + 'Q'}
if (let == "01010010") {letasc = letasc + 'R'}
if (let == "01010011") {letasc = letasc + 'S'}
if (let == "01010100") {letasc = letasc + 'T'}
if (let == "01010101") {letasc = letasc + 'U'}
if (let == "01010110") {letasc = letasc + 'V'}
if (let == "01010111") {letasc = letasc + 'W'}
if (let == "01011000") {letasc = letasc + 'X'}
if (let == "01011001") {letasc = letasc + 'Y'}
if (let == "01011010") {letasc = letasc + 'Z'}
if (let == "01100001") {letasc = letasc + 'a'}
if (let == "01100010") {letasc = letasc + 'b'}
if (let == "01100011") {letasc = letasc + 'c'}
if (let == "01100100") {letasc = letasc + 'd'}
if (let == "01100101") {letasc = letasc + 'e'}
if (let == "01100110") {letasc = letasc + 'f'}
if (let == "01100111") {letasc = letasc + 'g'}
if (let == "01101000") {letasc = letasc + 'h'}
if (let == "01101001") {letasc = letasc + 'i'}
if (let == "01101010") {letasc = letasc + 'j'}
if (let == "01101011") {letasc = letasc + 'k'}
if (let == "01101100") {letasc = letasc + 'l'}
if (let == "01101101") {letasc = letasc + 'm'}
if (let == "01101110") {letasc = letasc + 'n'}
if (let == "01101111") {letasc = letasc + 'o'}
if (let == "01110000") {letasc = letasc + 'p'}
if (let == "01110001") {letasc = letasc + 'q'}
if (let == "01110010") {letasc = letasc + 'r'}
if (let == "01110011") {letasc = letasc + 's'}
if (let == "01110100") {letasc = letasc + 't'}
if (let == "01110101") {letasc = letasc + 'u'}
if (let == "01110110") {letasc = letasc + 'v'}
if (let == "01110111") {letasc = letasc + 'w'}
if (let == "01111000") {letasc = letasc + 'x'}
if (let == "01111001") {letasc = letasc + 'y'}
if (let == "01111010") {letasc = letasc + 'z'}
if (let == "00100000") {letasc = letasc + ' '}

//Numbers:
if (let == "00110000") {letasc = letasc + '0'}
if (let == "00110001") {letasc = letasc + '1'}
if (let == "00110010") {letasc = letasc + '2'}
if (let == "00110011") {letasc = letasc + '3'}
if (let == "00110100") {letasc = letasc + '4'}
if (let == "00110101") {letasc = letasc + '5'}
if (let == "00110110") {letasc = letasc + '6'}
if (let == "00110111") {letasc = letasc + '7'}
if (let == "00111000") {letasc = letasc + '8'}
if (let == "00111001") {letasc = letasc + '9'}

//Special Characters:
if (let == "00100001") {letasc = letasc + '!'}
if (let == "00100010") {letasc = letasc + '"'}
if (let == "00100011") {letasc = letasc + '#'}
if (let == "00100100") {letasc = letasc + '$'}
if (let == "00100101") {letasc = letasc + '%'}
if (let == "00100110") {letasc = letasc + '&'}
if (let == "00100111") {letasc = letasc + '''}
if (let == "00101000") {letasc = letasc + '('}
if (let == "00101001") {letasc = letasc + ')'}
if (let == "00101010") {letasc = letasc + '*'}
if (let == "00101011") {letasc = letasc + '+'}
if (let == "00101100") {letasc = letasc + ','}
if (let == "00101101") {letasc = letasc + '-'}
if (let == "00101110") {letasc = letasc + '.'}
if (let == "00101111") {letasc = letasc + '/'}
if (let == "00111010") {letasc = letasc + ':'}
if (let == "00111011") {letasc = letasc + ';'}
if (let == "00111100") {letasc = letasc + '<'}
if (let == "00111101") {letasc = letasc + '='}
if (let == "00111110") {letasc = letasc + '>'}
if (let == "00111111") {letasc = letasc + '?'}
if (let == "01000000") {letasc = letasc + '@'}
if (let == "01011011") {letasc = letasc + '['}
if (let == "01011100") {letasc = letasc + '\'}
if (let == "01011101") {letasc = letasc + ']'}
if (let == "01011110") {letasc = letasc + '^'}
if (let == "01011111") {letasc = letasc + '_'}
if (let == "01100000") {letasc = letasc + '`'}
if (let == "01111011") {letasc = letasc + '{'}
if (let == "01111100") {letasc = letasc + '|'}
if (let == "01111101") {letasc = letasc + '}'}
if (let == "01111110") {letasc = letasc + '~'}
if (let == "10000000") {letasc = letasc + '€'}
if (let == "10100001") {letasc = letasc + '¡'}
if (let == "10100010") {letasc = letasc + '¢'}
if (let == "10100011") {letasc = letasc + '£'}
if (let == "10100100") {letasc = letasc + '¤'}
if (let == "10100101") {letasc = letasc + '¥'}
if (let == "10100110") {letasc = letasc + '¦'}
if (let == "10100111") {letasc = letasc + '§'}
if (let == "10100111") {letasc = letasc + '¨'}
if (let == "10101001") {letasc = letasc + '©'}
if (let == "10101010") {letasc = letasc + 'ª'}
if (let == "10101011") {letasc = letasc + '«'}
if (let == "10101100") {letasc = letasc + '¬'}
if (let == "10101101") {letasc = letasc + '­'}
if (let == "10101110") {letasc = letasc + '®'}
if (let == "10101111") {letasc = letasc + '¯'}
if (let == "10110000") {letasc = letasc + '°'}
if (let == "10110001") {letasc = letasc + '±'}
if (let == "10110010") {letasc = letasc + '²'}
if (let == "10110011") {letasc = letasc + '³'}
if (let == "10110100") {letasc = letasc + '´'}
if (let == "10110101") {letasc = letasc + 'µ'}
if (let == "10110110") {letasc = letasc + '¶'}
if (let == "10110111") {letasc = letasc + '·'}
if (let == "10111000") {letasc = letasc + '¸'}
if (let == "10111001") {letasc = letasc + '¹'}
if (let == "10111010") {letasc = letasc + 'º'}
if (let == "10111011") {letasc = letasc + '»'}
if (let == "10111100") {letasc = letasc + '¼'}
if (let == "10111101") {letasc = letasc + '½'}
if (let == "10111110") {letasc = letasc + '¾'}
if (let == "10111111") {letasc = letasc + '¿'}
if (let == "11000000") {letasc = letasc + 'À'}
if (let == "11000001") {letasc = letasc + 'Á'}
if (let == "11000010") {letasc = letasc + 'Â'}
if (let == "11000011") {letasc = letasc + 'Ã'}
if (let == "11000100") {letasc = letasc + 'Ä'}
if (let == "11000101") {letasc = letasc + 'Å'}
if (let == "11000110") {letasc = letasc + 'Æ'}
if (let == "11000111") {letasc = letasc + 'Ç'}
if (let == "11001000") {letasc = letasc + 'È'}
if (let == "11001001") {letasc = letasc + 'É'}
if (let == "11001010") {letasc = letasc + 'Ê'}
if (let == "11001011") {letasc = letasc + 'Ë'}
if (let == "11001100") {letasc = letasc + 'Ì'}
if (let == "11001101") {letasc = letasc + 'Í'}
if (let == "11001110") {letasc = letasc + 'Î'}
if (let == "11001111") {letasc = letasc + 'Ï'}
if (let == "11010000") {letasc = letasc + 'Ð'}
if (let == "11010001") {letasc = letasc + 'Ñ'}
if (let == "11010010") {letasc = letasc + 'Ò'}
if (let == "11010011") {letasc = letasc + 'Ó'}
if (let == "11010100") {letasc = letasc + 'Ô'}
if (let == "11010101") {letasc = letasc + 'Õ'}
if (let == "11010110") {letasc = letasc + 'Ö'}
if (let == "11010111") {letasc = letasc + '×'}
if (let == "11011000") {letasc = letasc + 'Ø'}
if (let == "11011001") {letasc = letasc + 'Ù'}
if (let == "11011010") {letasc = letasc + 'Ú'}
if (let == "11011011") {letasc = letasc + 'Û'}
if (let == "11011100") {letasc = letasc + 'Ü'}
if (let == "11011101") {letasc = letasc + 'Ý'}
if (let == "11011110") {letasc = letasc + 'Þ'}
if (let == "11011111") {letasc = letasc + 'ß'}
if (let == "11100000") {letasc = letasc + 'à'}
if (let == "11100001") {letasc = letasc + 'á'}
if (let == "11100010") {letasc = letasc + 'â'}
if (let == "11100011") {letasc = letasc + 'ã'}
if (let == "11100100") {letasc = letasc + 'ä'}
if (let == "11100101") {letasc = letasc + 'å'}
if (let == "11100110") {letasc = letasc + 'æ'}
if (let == "11100111") {letasc = letasc + 'ç'}
if (let == "11101000") {letasc = letasc + 'è'}
if (let == "11101001") {letasc = letasc + 'é'}
if (let == "11101010") {letasc = letasc + 'ê'}
if (let == "11101011") {letasc = letasc + 'ë'}
if (let == "11101100") {letasc = letasc + 'ì'}
if (let == "11101101") {letasc = letasc + 'í'}
if (let == "11101110") {letasc = letasc + 'î'}
if (let == "11101111") {letasc = letasc + 'ï'}
if (let == "11110000") {letasc = letasc + 'ð'}
if (let == "11110001") {letasc = letasc + 'ñ'}
if (let == "11110010") {letasc = letasc + 'ò'}
if (let == "11110011") {letasc = letasc + 'ó'}
if (let == "11110100") {letasc = letasc + 'ô'}
if (let == "11110101") {letasc = letasc + 'õ'}
if (let == "11110110") {letasc = letasc + 'ö'}
if (let == "11110111") {letasc = letasc + '÷'}
if (let == "11111000") {letasc = letasc + 'ø'}
if (let == "11111001") {letasc = letasc + 'ù'}
if (let == "11111010") {letasc = letasc + 'ú'}
if (let == "11111011") {letasc = letasc + 'û'}
if (let == "11111100") {letasc = letasc + 'û'}
if (let == "11111101") {letasc = letasc + 'ý'}
if (let == "11111110") {letasc = letasc + 'þ'}
if (let == "11111111") {letasc = letasc + 'ÿ'}
if (letasc == "") {
alert ("not found")
break;
}
j=j+8
}
ascii.innerHTML = letasc
return false;
}
