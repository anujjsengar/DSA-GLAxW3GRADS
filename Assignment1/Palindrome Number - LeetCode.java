class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int digit_count=(int)(Math.log10(x)+1);
        System.out.println(digit_count);
        int left=digit_count-1;
        int right=1;
        while(right<left &&right!=left){
            if(x%(10*left)!=x%(10*right)){
                return false;
            }
            right++;
            left--;
        }
        return true;
    }
}
