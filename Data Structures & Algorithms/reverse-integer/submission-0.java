class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        String ans = "";
        int j = 0;

        if(s.length() <= 1) return x;

        boolean negative = x < 0;

        char[] res = new char[s.length()];

        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                res[j++] = s.charAt(i);
            }
        }

        for(int i = 0; i < j; i++) {
            ans += res[i];
        }

        if(negative) {
            ans = "-" + ans;
        }

        try {
            int a = Integer.valueOf(ans);
            return a;
        } catch(NumberFormatException e) {
            return 0;
        }
    }
}