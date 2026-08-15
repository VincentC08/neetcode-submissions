class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        Arrays.sort(charsS);

        char[] charsT = t.toCharArray();
        Arrays.sort(charsT);
        
        if (charsS.length != charsT.length)
            return false;

        for (int i = 0; i < charsS.length; i++) {
            if (charsS[i] != charsT[i])
                return false;
        }
        return true;
    }
}
