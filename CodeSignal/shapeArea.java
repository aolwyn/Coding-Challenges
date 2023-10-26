int solution(int n) {
    int sum = 1;
	    
	    for(int i = 1; i <= n; i++){
	        sum = sum + ((i-1) * 4);
	    }
	    return sum;
}
