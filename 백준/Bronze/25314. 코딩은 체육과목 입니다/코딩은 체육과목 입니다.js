const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split(" ");

let mul = parseInt(input[0]) / 4;
let text = "";

for (let i = 0; i < mul; i++) {
  text += "long ";
}
text += "int";

console.log(text);
