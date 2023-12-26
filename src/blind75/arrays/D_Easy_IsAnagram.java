package blind75.arrays;

import java.util.HashMap;
import java.util.Map;

/*
Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */
public class D_Easy_IsAnagram {


    public boolean isAnagram_optimal(String s, String t) {

        //Time Complexity O(n)
        //Space complexity O(1)

        int[] map = new int[26];

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            char currChar = s.charAt(i);
            map[currChar - 'a']++;
        }

        for(int i=0; i<s.length(); i++){
            char currChar = t.charAt(i);
            map[currChar - 'a']--;
        }

        for(int x: map){
            if(x!=0){
                return false;
            }
        }

        return true;
    }

    //Time Complexity O(n2) - n is size of string, worst case scenario is strings have unique chars
    //Space Complexity (n + m)
    public boolean isAnagram_Brute(String s, String t) {

        //maps to hold count of each char
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        //count occurence of each char
        for(int i=0; i<s.length(); i++){
            char sIdx = s.charAt(i);
            char tIdx = t.charAt(i);

            if(map1.containsKey(s.charAt(i))){
                int cnt = map1.get(sIdx) +1;
                map1.put(sIdx, cnt);
            }else{
                map1.put(sIdx, 1);
            }

            if(map2.containsKey(t.charAt(i))){
                int cnt =  map2.get(tIdx) +1;
                map2.put(tIdx, cnt);
            }else{
                map2.put(tIdx, 1);
            }
        }

        //iterate thru map 1 and get the value from map2, compare counts
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char key = entry.getKey();
            if(map2.get(key) ==null){
                return false;
            } else if(! map2.get(key).equals(entry.getValue())){
                return false;
            }
        }

        return true;


    }

}
