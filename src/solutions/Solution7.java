package solutions;

public class Solution7 {
    public static void main(String[] args) {
        System.out.println(reverse(1234567897));
    }
    public static int reverse(int x){
        int rev = 0;
        while(x!=0){
            int pop = x%10;
            x = x/10;
            if (rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE && pop==7)){
                return 0;
            }
            if (rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE && pop==-8)){
                return 0;
            }
            rev = rev*10+pop;
        }
        return rev;
    }
}
