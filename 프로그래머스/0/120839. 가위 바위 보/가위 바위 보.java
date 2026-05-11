class Solution {
    public String solution(String rsp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(String s : rsp.split("")) {
            switch(s) {
                case "0":
                    sb.append("5");
                    break;
                case "2":
                    sb.append("0");
                    break;
                case "5":
                    sb.append("2");
                    break;
            }
        }
        return sb.toString();
    }
}