const readline = require("readline");
const fs = require("fs");

const path = "/dev/stdin";

const rl = readline.createInterface({
  input: fs.createReadStream(path),
  crlfDelay: Infinity,
});

let answer = "";

rl.on("line", (line) => {
  let tmp = line.toString().split(" ");

  if (tmp.length > 1) {
    a = Number(tmp[0]) + Number(tmp[1]);
    answer = answer + a + "\n";
  }
});

rl.on("close", () => {
  console.log(answer);
});
