// 8 - String to Integer

int myAtoi(string s) {
    long res = 0;
    int idx = 0;

    while(idx < s.size() && s[idx] == ' ') idx++;

    bool isNegative = s[idx] == '-';
    if(s[idx] == '+' || s[idx] == '-') {
        idx++;
    }

    while(idx < s.size() && isdigit(s[idx])) {
        res = res * 10 + (s[idx] - '0');
        if(res > INT_MAX || (isNegative && -res < INT_MIN)) {
            return isNegative ? INT_MIN : INT_MAX;
        }
        idx++;
    }
    return isNegative ? int(-res) : int(res);
}