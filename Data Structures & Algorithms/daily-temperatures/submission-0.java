class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<int[]> st = new Stack<>();
        int res[] = new int[temp.length];
        for(int i = 0; i <temp.length; i++) {
            int t = temp[i];
            while(!st.isEmpty() && t > st.peek()[0]) {
                int[] pair = st.pop();
                res[pair[1]] = i - pair[1];
            }
            st.push(new int[]{t,i});
        }
        return res;
    }
}
