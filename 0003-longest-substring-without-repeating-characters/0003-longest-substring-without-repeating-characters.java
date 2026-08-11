import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int l=0;
        int maxLen=0;
        for(int r=0;r<s.length();r++)
        {
            char c=s.charAt(r);
            while(hs.contains(c))
            {
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(c);
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}