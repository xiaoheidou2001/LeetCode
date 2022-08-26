public class Main{
    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "987654321";
        System.out.println(new Solution().multiply(num1, num2));
        // System.out.println(new Solution().add(num1, num2));
    }
}

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        String res = new String();
        for(int i = num2.length() - 1;i >= 0;i --){
            StringBuffer currRes = new StringBuffer();
            for(int j = num2.length() - 1;j > i;j --){
                currRes.append("0");
            }
            int carry = 0;
            int b = num2.charAt(i) - '0';
            for(int j = num1.length() - 1;j >= 0;j --){
                int a = num1.charAt(j) - '0';
                int c = a * b + carry;
                currRes.append(c % 10);
                carry = c / 10;
            }
            if(carry != 0){
                currRes.append(carry);
            }
            res = add(res, currRes.reverse().toString());
        }
        return res;
    }

    public String add(String num1,String num2){
        StringBuffer res = new StringBuffer();
        int rear1 = num1.length() - 1;
        int rear2 = num2.length() - 1;
        int carry = 0;
        while(rear1 >= 0 || rear2 >= 0 || carry != 0){
            int a = rear1 >= 0 ? num1.charAt(rear1) - '0' : 0;
            int b = rear2 >= 0 ? num2.charAt(rear2) - '0' : 0;
            int currRes = a + b + carry;
            res.append(currRes%10);
            carry = currRes / 10;
            rear1 --;
            rear2 --;
        }
        res.reverse();
        return res.toString();
    }
}