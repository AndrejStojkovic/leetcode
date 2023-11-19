// 383 - Ransom Note

bool canConstruct(string ransomNote, string magazine) {
    for(int i = 0; i < ransomNote.size(); i++) {
        int idx = magazine.find(ransomNote[i]);
        if(idx == -1) { return false; }
        magazine = magazine.substr(0, idx) + magazine.substr(idx + 1);
    }
    return true;
}