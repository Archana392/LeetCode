class Solution {
    public int countDigits(int num) {
        int original=num;
        int temp=num;
        int count=0;
        while(temp>0)
        {
            int digit=temp%10;
            if(original%digit==0)
            {
                count++;
            }temp/=10;
        }return count;
    }
}