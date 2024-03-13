const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split(" ");

const money = BigInt(input.shift()); // 1000n

const People = BigInt(input.shift()); // 100n

console.log((money / People).toString());
console.log((money % People).toString());