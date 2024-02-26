const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split(" ");

let hour = parseInt(input[0]);
let minute = parseInt(input[1]);

if (minute < 45) {
  if (hour >= 1) {
    hour -= 1;
  } else {
    hour = 23;
  }
  minute += 60;
}
minute -= 45;

console.log(hour + " " + minute);
