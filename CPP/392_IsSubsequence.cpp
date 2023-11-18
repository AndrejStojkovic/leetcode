// 392 - Is Subsequence

bool isSubsequence(string s, string t) {
    if(s.size() == 0) return true;

    int ct = 0;
    for(int i = 0; i < t.size(); i++) {
        if(ct < s.size() && s[ct] == t[i]) {
            ct++;
        }
    }
    return ct == s.size();
}