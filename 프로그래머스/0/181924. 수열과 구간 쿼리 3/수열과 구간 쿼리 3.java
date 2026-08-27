class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i = 0; i < queries.length; i++) {
            int swap = 0;
            swap = arr[queries[i][1]];
            arr[queries[i][1]] = arr[queries[i][0]];
            arr[queries[i][0]] = swap;
        }
        return arr;
    }
}