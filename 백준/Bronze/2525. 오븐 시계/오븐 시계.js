const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
const tmp = input[0].split(" ");

let hour = parseInt(tmp[0]);
let min = parseInt(tmp[1]);
const cookTime = parseInt(input[1]);

const cHour = parseInt(cookTime / 60);
const cMin = cookTime % 60;

if (hour + cHour >= 24) {
  hour = hour + cHour - 24;
} else {
  hour += cHour;
}
if (min + cMin >= 60) {
  min = min + cMin - 60;
  hour++;
} else {
  min += cMin;
}
if (hour == 24) {
  hour = 0;
}

console.log(hour + " " + min);
