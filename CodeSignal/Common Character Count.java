/*
Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

*/

int solution(String s1, String s2) {
    int common = 0;
    HashMap<Character, Integer> count = new HashMap<>();
    
    for(int i =0; i < s1.length(); i++){
        char curr = s1.charAt(i);
        count.put(curr, count.getOrDefault(curr, 0)+1);
    }
    
    for(int j = 0; j < s2.length(); j++){
        char temp = s2.charAt(j);
        if(count.containsKey(temp)){
            if(count.get(temp) >0){
                common++;
                count.put(temp, count.get(temp)-1);
            }
        }
    }
    return common;
}

