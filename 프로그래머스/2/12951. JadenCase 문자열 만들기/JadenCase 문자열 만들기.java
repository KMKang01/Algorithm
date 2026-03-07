class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
          boolean isFirst = true;  // 단어의 첫 글자인지 체크

          for (int i = 0; i < s.length(); i++) {
              char c = s.charAt(i);

              if (c == ' ') {
                  sb.append(c);
                  isFirst = true;  // 다음 문자는 단어의 첫 글자
              } else {
                  if (isFirst) {
                      // 첫 글자는 대문자로
                      if (c >= 'a' && c <= 'z') {
                          sb.append((char)(c - 32));
                      } else {
                          sb.append(c);
                      }
                      isFirst = false;
                  } else {
                      // 나머지는 소문자로
                      if (c >= 'A' && c <= 'Z') {
                          sb.append((char)(c + 32));
                      } else {
                          sb.append(c);
                      }
                  }
              }
          }

          return sb.toString();
    }
}