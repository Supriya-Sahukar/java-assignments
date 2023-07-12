import java.util.*;

public class Program_1 {
    public static void longestSubstring(String str) {

        String LongestSubstring = null;
        int LongestSubstringLength = 0;
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        //char[] arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                i = map.get(ch);
                map.clear();
            }
            if (map.size() > LongestSubstringLength) {
                LongestSubstringLength = map.size();
                LongestSubstring = map.keySet().toString();
            }
        }
        System.out.println(LongestSubstring);
        System.out.println(LongestSubstringLength);
    }

        public static void main(String[] args) {
        longestSubstring("java");
    }
    }

