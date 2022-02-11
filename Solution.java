class Solution {
    public int findGCD(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        for (int element : nums) {
           a = Math.max(a, element);
           b = Math.min(b, element);
        }
        
        while(a%b !=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        return b;
    }
}
