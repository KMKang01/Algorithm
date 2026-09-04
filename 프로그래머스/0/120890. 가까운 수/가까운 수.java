class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int near = -10000;
        for(int i = 0; i < array.length; i++) {
            if(Math.abs(array[i] - n) < Math.abs(near - n)) {
                near = array[i];
            } else if (Math.abs(array[i] - n) == Math.abs(near - n)) {
                near = Math.min(array[i], near);
            }
        }
        return near;
    }
}