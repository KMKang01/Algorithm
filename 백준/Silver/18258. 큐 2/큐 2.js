const fs = require("fs");
let [N, ...arr] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

class Queue {
  head = 0;
  rear = 0;
  data = [];
  push(x) {
    this.data[this.rear++] = x;
  }
  pop() {
    if (this.empty() === 0) {
      return this.data[this.head++];
    } else {
      return -1;
    }
  }
  size() {
    return this.rear - this.head;
  }
  empty() {
    if (this.head === this.rear) {
      return 1;
    } else {
      return 0;
    }
  }
  front() {
    if (this.empty() === 0) {
      return this.data[this.head];
    } else {
      return -1;
    }
  }
  back() {
    if (this.empty() === 0) {
      return this.data[this.rear - 1];
    } else {
      return -1;
    }
  }
}

let queue = new Queue();
let answer = "";
for (let i = 0; i < parseInt(N); i++) {
  let [command, x] = arr[i].split(" ");
  switch (command) {
    case "push":
      queue.push(parseInt(x));
      break;
    case "pop":
      answer += `${queue.pop()}\n`;
      break;
    case "size":
      answer += `${queue.size()}\n`;
      break;
    case "empty":
      answer += `${queue.empty()}\n`;
      break;
    case "front":
      answer += `${queue.front()}\n`;
      break;
    case "back":
      answer += `${queue.back()}\n`;
      break;
  }
}
console.log(answer.trim());
