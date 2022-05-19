/* JSON = js Object Notation */

if(process.argv.length<3){
    console.error("missing argument (file to parse)");
    return(-1);
}

var fs = require('fs'), readline = requi