public class Problem1780 {
    /*
     * Given an integer n, return true if it is possible to represent n as the sum
     * of distinct powers of three. Otherwise, return false.
     * 
     * An integer y is a power of three if there exists an integer x such that y ==
     * 3x.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: n = 12
     * Output: true
     * Explanation: 12 = 31 + 32
     * Example 2:
     * 
     * Input: n = 91
     * Output: true
     * Explanation: 91 = 30 + 32 + 34
     * Example 3:
     * 
     * Input: n = 21
     * Output: false
     * 
     */
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            int check=n%3;
            n=n/3;
            if(n==2 || check==2)
                return false;
        }
        return true;
    }
    /*
     * The number can not be represented as a sum of powers of 3 if it's ternary presentation has a 2 in it. 
     * Detail explaination is in the .txt file.
     * 
     */
}
