boolean solution(String inputString) {
    
 char[] revStr = new char[inputString.length()];
	    char[] inputStr = inputString.toCharArray();
	    
	    for(int i = inputString.length()-1; i >= 0; i--) {
	    	revStr[inputString.length()-1-i] = inputStr[i];
	    }    
	    String revStrs = new String(revStr,0,revStr.length);
	    String inputStrs = new String(inputStr,0,inputStr.length);
	    
 	    if(revStrs.equals(inputStrs)) {
 	    	return true;
 	    } else {return false;}
	}


