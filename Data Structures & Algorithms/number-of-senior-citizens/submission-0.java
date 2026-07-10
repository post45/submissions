class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s : details) {
            if(Integer.valueOf(s.substring(s.length()-4, s.length()-2)) > 60)
            count++;
        }
        return count;
    }
}