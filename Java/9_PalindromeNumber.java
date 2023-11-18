// 9 - Palindrome Number

public boolean isPalindrome(int x) {
    if(x < 0) return false;

    long reverse = 0;
    int n = x;
    while(n != 0) {
        reverse = reverse * 10 + (n % 10);
        n /= 10;
    }

    return x == reverse;
}