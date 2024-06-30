class Solution {
    int count(int v1, int v2) {
    	int ct=1;
    	boolean flag = true;
    	while(true) {
    		if(flag) {
    			if(ct <= v1) v1 -= ct;
    			else break;
    		} else {
    			if(ct <= v2) v2 -= ct;
    			else break;
    		}
    		ct++;
    		flag = !flag;
    	}
    	return ct-1;
    }

public int maxHeightOfTriangle(int red, int blue) {
	return Math.max(count(red, blue), count(blue, red));
}
}
