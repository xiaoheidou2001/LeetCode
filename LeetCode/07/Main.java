import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println(solution.reverse(in.nextInt()));
        in.close();
    }
}

// class Solution {
//     public int reverse(int x) {
//         int flag = 0;
//         if(x < 0){
//             x = -x;
//             flag = 1;
//         }
//         StringBuffer s = new StringBuffer();s.append(x);
//         for(int i = s.length() - 1;i >= 0;i --){
//             if(s.charAt(i) != '0') break;
//             else s.delete(i, i+1);
//         }
//         s.reverse();
//         if(flag == 1) s.insert(0, "-");
//         if(s.toString().equals("")) return 0;
//         try{
//             return Integer.valueOf(s.toString());
//         } catch(Exception ex){
//             return 0;
//         }
//     }
// }

class Solution {
    public int reverse(int x){
        double res = 0;
        while(x != 0){
            res = res * 10 + x % 10;
            x = x / 10;
        }
        if((int)res == res) return (int)res;
        else return 0;
    }
}
