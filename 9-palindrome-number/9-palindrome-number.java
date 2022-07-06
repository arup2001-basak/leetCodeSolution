class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)		return false;
		if(x==0)	return true;
		int tmp=x;
		int c=0;
		while(x!=0)
		{
			c = c*10 + x%10;
			x = x/10;
		}
		if(c==tmp)	return true;
		else		return false;
    }
}