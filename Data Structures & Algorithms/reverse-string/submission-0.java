class Solution {
    public void reverseString(char[] s) {
        int l = 0, r = s.length-1; char k = 0;
        while(l < r) {
            k = s[l];
            s[l] = s[r];
            s[r] = k;
            l++;
            r--;
        }
    }
}