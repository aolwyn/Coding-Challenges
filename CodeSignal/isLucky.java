/*
Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.

*/

boolean solution(int n) {
    String temp = Integer.toString(n);
    char[] halves = temp.toCharArray();
    int first = 0;
    int second = 0;
    //System.out.println(halves.length/2);
    int start = (halves.length/2);
    for(int i =0; i < halves.length/2; i++){
        first+= Character.getNumericValue(halves[i]);
        second+= Character.getNumericValue(halves[i+start]);
    }
    
    return first == second ? true : false;
}
