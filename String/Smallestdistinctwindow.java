package DSA;

import java.util.HashMap;
import java.util.Map;

public class Smallestdistinctwindow {
	public static String minWindow(String s, String t) {
        int windowStart = 0, matched = 0;
        String res = "";
        Map<Character, Integer> map = new HashMap<>(); // char, freq
        
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char right = s.charAt(windowEnd);
            if (map.containsKey(right)) {
                map.put(right, map.get(right) - 1);
                if (map.get(right) == 0) {
                    matched++;
                }
            }
            
            while (matched == map.size()) {
                if (res.length() == 0) {
                    res = s.substring(windowStart, windowEnd + 1);
                }
                if (res.length() > (windowEnd - windowStart + 1)) {
                    res = s.substring(windowStart, windowEnd + 1);
                }
                char left = s.charAt(windowStart);
                if (map.containsKey(left)) {
                    if (map.get(left) == 0) {
                        matched--;
                    }
                    map.put(left, map.get(left) + 1);
                }
                windowStart++;
            }
        }
        return res;
	}
	public static void main(String ar[]) {
		String s = "ADOBECODEBANC", t = "ABC";
		System.out.println(minWindow(s,t));
	}
}
