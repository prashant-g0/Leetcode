// Code
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        int[] pFreq = new int[26];
        int[] wFreq = new int[26];
        List<Integer> result = new ArrayList<>();

        if (sLen < pLen) {
            return result;
        }

        for (int i = 0; i < pLen; i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < sLen; i++) {
            wFreq[s.charAt(i) - 'a']++;

            if (i >= pLen) {
                wFreq[s.charAt(i - pLen) - 'a']--;
            }

            if (i >= pLen - 1 && Arrays.equals(pFreq, wFreq)) {
                result.add(i - pLen + 1);
            }
        }

        return result;
    }
}
