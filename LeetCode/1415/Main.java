import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = "covid2019";
        System.out.println(new Solution().reformat(s));
    }
}

// class Solution {

//     List<String> list = new ArrayList<>();

//     public String getHappyString(int n, int k) {
//         get("", 0, n, k);
//         return list.get(k);
//     }

//     private void get(String curr, int i, int n, int k){
//         if(i == n){
//             list.add(curr);
//             if(list.size() == k) return;
//         } else {
//             for(int j = 0;j < 3;j ++){
//                 get(curr+"a", i+1, n, k);
//                 get(curr+"b", i+1, n, k);
//                 get(curr+"c", i+1, n, k);
//             }
//         }
//     }
// }

class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> res = new ArrayList<>();
        Set<String> cols = new HashSet<>();cols.add("Table");
        Map<Integer,Map<String,Integer>> dishes = new HashMap<>();
        for(int i = 0;i < orders.size();i ++){
            List<String> currList = orders.get(i);
            
        }
    }
}

// 输入：orders = [["David","3","Ceviche"],["Corina","10","Beef Burrito"],["David","3","Fried Chicken"],["Carla","5","Water"],["Carla","5","Ceviche"],["Rous","3","Ceviche"]]
// 输出：[["Table","Beef Burrito","Ceviche","Fried Chicken","Water"],["3","0","2","1","0"],["5","0","1","0","1"],["10","1","0","0","0"]] 