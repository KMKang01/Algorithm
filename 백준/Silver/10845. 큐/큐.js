const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
/*
    큐 자료구조

    큐의 특징:
    FIFO
    Enqueue => rear를 증가시키면서 queue에 값을 넣는다
    Dequeue => front를 증가시켜 다음 인덱스르 지정하게 하고 데이터를 삭제

    #10845
 */

let loc = parseInt(input[0]);

const maxQueueSize = 10000; // 큐의 최대 사이즈
class Queue {
  front = -1;
  rear = -1;
  data = new Array(maxQueueSize);
  // front, rear를 0로 초기화, queue 데이터 생성

  push(element) {
    this.data[++this.rear] = element;
  }
  pop() {
    if (this.size() == 0) return -1;
    let tmp = this.data[++this.front];
    return tmp;
  }
  size() {
    if (this.rear == -1 && this.front == -1) return 0;
    else return this.rear - this.front;
  }
  isEmpty() {
    if (this.size() == 0) return 1;
    else return 0;
  }
  queueFront() {
    if (this.size() == 0) return -1;
    else if (this.front == -1) {
      return this.data[this.front + 1];
    } else {
      return this.data[this.front + 1];
    }
  }
  queueBack() {
    if (this.size() == 0) return -1;
    return this.data[this.rear];
  }
}

let queue = new Queue();
let answer = "";
for (let i = 1; i <= loc; i++) {
  let cmd = input[i].split(" ");
  // console.log(cmd);
  switch (cmd[0]) {
    case "push":
      queue.push(parseInt(cmd[1]));
      break;
    case "pop":
      answer += queue.pop() + "\n";
      break;
    case "size":
      answer += queue.size() + "\n";
      break;
    case "empty":
      answer += queue.isEmpty() + "\n";
      break;
    case "front":
      answer += queue.queueFront() + "\n";
      break;
    case "back":
      answer += queue.queueBack() + "\n";
      break;
  }
}
console.log(answer.trim());
