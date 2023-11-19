// 383 - Ransom Note

public boolean canConstruct(String ransomNote, String magazine) {
    for(int i = 0; i < ransomNote.length(); i++) {
        int idx = magazine.indexOf(ransomNote.charAt(i));
        if(idx == -1) { return false; }
        magazine = magazine.substring(0, idx) + magazine.substring(idx + 1);
    }
    return true;
}