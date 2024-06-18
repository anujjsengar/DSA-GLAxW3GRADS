

//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        int num=n;
        int count_digit=(int)(Math.log10(n)+1);
        int ans=0;
        while(num>0){
            ans=ans+(int)Math.pow(num%10,count_digit);
            num=num/10;
    }
    if(ans==n){
        return "Yes";
    }
    else{
        return "No";
    }
}
}
