// 392 - Is Subsequence

public boolean isSubsequence(String s, String t) {
    if(s == null || t == null) return false;
    if(s.isEmpty()) return true;

    int ct = 0;
    for(int i = 0; i < t.length(); i++) {
        if(ct < s.length() && s.charAt(ct) == t.charAt(i)) {
            ct++;
        }
    }
    return ct == s.length();
}