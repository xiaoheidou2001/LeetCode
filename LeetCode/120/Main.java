import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        // List<Integer> line0 = new ArrayList<>();line0.add(2);
        // List<Integer> line1 = new ArrayList<>();line1.add(3);line1.add(4);
        // List<Integer> line2 = new ArrayList<>();line2.add(6);line2.add(5);line2.add(7);
        // List<Integer> line3 = new ArrayList<>();line3.add(4);line3.add(1);line3.add(8);line3.add(3);
        // triangle.add(line0);triangle.add(line1);triangle.add(line2);triangle.add(line3);
        List<Integer> line0 = new ArrayList<>();line0.add(-1);
        List<Integer> line1 = new ArrayList<>();line1.add(-2);line1.add(-3);
        triangle.add(line0);triangle.add(line1);
        System.out.println(new Solution().minimumTotal(triangle));
    }
}

// class Solution {
//     int res = 0;
//     public int minimumTotal(List<List<Integer>> triangle) {
//         int curr = 0;
//         this.res = 10000*triangle.size();
//         findMin(triangle, 0, 0, curr);
//         return res;
//     }
//     public void findMin(List<List<Integer>> triangle, int lineIdx, int pointIdx, int curr){
//         if(lineIdx == triangle.size()){
//             int currSum = curr;
//             if(currSum < res){
//                 res = currSum;
//             }
//         } else{
//             curr += triangle.get(lineIdx).get(pointIdx);
//             findMin(triangle, lineIdx+1, pointIdx, curr);
//             findMin(triangle, lineIdx+1, pointIdx+1, curr);
//             curr -= triangle.get(lineIdx).get(pointIdx);
//         }
//     }
// }

// arraylist 可以改为二维数组
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> res = new ArrayList<>();
        int minSum = 1000*triangle.size();
        res.add(triangle.get(0));
        for(int i = 1;i < triangle.size();i ++){
            List<Integer> line = new ArrayList<>();
            line.add(res.get(i-1).get(0)+triangle.get(i).get(0));
            for(int j = 1;j < triangle.get(i).size()-1;j ++){
                line.add(Math.min(res.get(i-1).get(j)+triangle.get(i).get(j), 
                                res.get(i-1).get(j-1)+triangle.get(i).get(j)));
            }
            line.add(res.get(i-1).get(triangle.get(i).size()-2)+triangle.get(i).get(triangle.get(i).size()-1));
            res.add(line);
        }
        for(int i = 0;i < res.get(res.size()-1).size();i ++){
            minSum = Math.min(minSum,res.get(res.size()-1).get(i));
        }
        return minSum;
    }
}