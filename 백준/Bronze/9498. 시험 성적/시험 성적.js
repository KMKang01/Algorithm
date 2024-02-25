const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split(' ');

const a = parseInt(input[0]);

if( 100 >= a && a >= 90) {
    console.log("A");
} else if ( a >= 80){
    console.log("B");
} else if ( a >= 70){
    console.log("C");
} else if ( a >= 60){
    console.log("D");
} else if ( 60 > a && a >= 0) {
    console.log("F");
}