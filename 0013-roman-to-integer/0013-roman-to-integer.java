class Solution {
    public int romanToInt(String s) {
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] dec = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        int num = 0;
        int i = 0;

        while (i < s.length()) {
            for (int j = 0; j < roman.length; j++) {
                String token = roman[j];
                
                if (s.startsWith(token, i)) {
                    num += dec[j];
                    i += token.length();
                    break;
                }
            }
        }

        return num;
    }
}
