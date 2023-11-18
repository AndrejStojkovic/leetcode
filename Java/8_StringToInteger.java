// 8 - String To Integer

public int myAtoi(String s) {
    if(s.isEmpty()) return 0;

    long res = 0;
    int idx = 0;

    while(idx < s.length() && s.charAt(idx) == ' ') {
        idx++;
    }

    if(idx >= s.length()) return 0;

    boolean isNegative = s.charAt(idx) == '-';
    if(s.charAt(idx) == '+' || s.charAt(idx) == '-') {
        idx++;
    }

    while(idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
        res = res * 10 + (s.charAt(idx) - '0');
        if(res > Integer.MAX_VALUE || (isNegative && -res < Integer.MIN_VALUE)) {
            return isNegative ?  Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        idx++;
    }
    
    return isNegative ? (int)(-res) : (int)res;
}