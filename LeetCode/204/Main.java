public class Main{
    public static void main(String[] args) {
        // int n = 5000000;
        int n = 10;
        System.out.println(new Solution().countPrimes(n));
    }
}

// class Solution {
//     public int countPrimes(int n) {
//         int count = 0;
//         for(int i = 2;i < n;i ++){
//             if(judgePrime(i)) count++;
//         }
//         return count;
//     }
//     private boolean judgePrime(int n){
//         int x = (int)Math.sqrt(n);
//         for(int i = 2;i <= x;i ++){
//             if(n % i == 0) return false;
//         }
//         return true;
//     }
// }

class Solution {
    public int countPrimes(int n) {
        int[] isComposite = new int[n];
        int count = 0;
        for(int i = 2;i < n;i ++){
            if(isComposite[i] == 0){
                count ++;
                if((long)i * i < n){
                    for(int j = i * i;j < n;j += i){
                        isComposite[j] = 1;
                    }
                }
            }
        }
        return count;
    }
}