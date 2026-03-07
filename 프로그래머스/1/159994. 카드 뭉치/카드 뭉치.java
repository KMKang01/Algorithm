class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        int c1 = 0;
        int c2 = 0;
        boolean flag = true;
        
        for(int i = 0; i< goal.length; i++) {
            String card1 = cards1[c1];
            String card2 = cards2[c2];
            String goalCard = goal[i];
            // System.out.println(card1 + " " + card2 + " " + goalCard);
            if(goalCard.equals(card1)) {
                c1 = c1 + 1 < cards1.length ? c1 + 1 : c1;
            } else if (goalCard.equals(card2)) {
                c2 = c2 + 1 < cards2.length ? c2 + 1 : c2;
            } else {
                flag = false;
                break;
            }
        }
        
        return flag ? "Yes" : "No";
    }
}
