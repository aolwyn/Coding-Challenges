int solution(int[] inputArray) {
    if(inputArray.length == 2) 
        return inputArray[0] * inputArray[1];
    
    int max = inputArray[0] * inputArray[1];
    int currMax = inputArray[0] * inputArray[1];
    
    
    for(int i = 2; i < inputArray.length; i++){
        if(inputArray[i-2] == 0 || inputArray[i] == 0){
            currMax = 0;
        }else{
            currMax /= inputArray[i-2];
        currMax *= inputArray[i];
        }
        
        max = Math.max(max, currMax);
    }
    return max;
}
