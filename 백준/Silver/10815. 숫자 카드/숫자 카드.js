const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let N = parseInt(input[0]); // myCard 개수
let myCard = {};
input[1].split(" ").forEach((e) => {
  myCard[e] = e;
});
let M = parseInt(input[2]); // isInCard 개수
let isInCard = ([] = input[3].split(" ").map((e) => {
  return (e = parseInt(e));
}));

let result = "";

isInCard.forEach((e) => {
  myCard.hasOwnProperty(e) ? (result += "1 ") : (result += "0 ");
});
console.log(result.trim());
