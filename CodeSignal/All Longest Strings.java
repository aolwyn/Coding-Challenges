/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"].


*/

String[] solution(String[] inputArray) {
    int currMax = inputArray[0].length();
    List<String> strings = new ArrayList<>();
    
    for(int i = 0; i < inputArray.length; i++){
        if(inputArray[i].length() > currMax){
            currMax = inputArray[i].length();
            strings.clear();
            strings.add(inputArray[i]);
        }else if(inputArray[i].length() == currMax){
            strings.add(inputArray[i]);
        }else {
            
        }
    }
    String[] stringArray = strings.toArray(new String[0]);
    return stringArray;
       

}
