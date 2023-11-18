// 9 - Palindrome Number

bool isPalindrome(int x) {
    if(x < 0) return false;

    long reverse = 0;
    int n = x;
    while(n) {
        reverse = reverse * 10 + (n % 10);
        n /= 10;
    }

    return x == reverse;
}