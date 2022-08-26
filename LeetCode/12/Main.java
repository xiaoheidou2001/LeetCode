public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(1099));
    }
}

/**
 * 从尾到头计算
 */
// class Solution {
//     public String intToRoman(int num) {
//         String s = new String();
//         for(int i = 1;i <= 4;i ++){
//             if(num == 0) break;
//             int tmp = num % 10;num = num / 10; 
//             if(i == 1) s = singleStep(tmp, "I", "V", "X") + s;
//             else if(i == 2) s = singleStep(tmp, "X", "L", "C") + s;
//             else if(i == 3) s = singleStep(tmp, "C", "D", "M") + s;
//             else if(i == 4) s = singleStep(tmp, "M", "", "") + s;
//         }
//         return s;
//     }
//     public String singleStep(int tmp, String op1, String op2, String op3){
//         String res = new String();
//         if(tmp >= 1 && tmp <= 3){
//             for(int j = 1;j <= tmp;j ++) 
//                 res += op1;
//         } else if(tmp == 4){
//             res = op1 + op2; 
//         } else if(tmp >= 5 && tmp <= 8){
//             res += op2;
//             for(int j = 1;j <= tmp - 5;j ++)
//                 res += op1;
//         } else if(tmp == 9){
//             res = op1 + op3;
//         }
//         return res;
//     }
// }

/**
 * 从头到尾扫描
 */
class Solution {
    public String intToRoman(int num) {
        String res = new String();int ptr = 0;
        int[] val = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        while(num > 0){
            if(num >= val[ptr]){
                res += str[ptr];
                num -= val[ptr];
            } else ptr++;
        }
        return res;
    }
}
