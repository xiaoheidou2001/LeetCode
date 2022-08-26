import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        System.out.println(new Solution().generate(5));
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        getLine(res, 1, numRows);
        return res;
    }
    public void getLine(List<List<Integer>> res,int lineCount,int maxCount){
        if(lineCount > maxCount) return;
        List<Integer> tmpList = new ArrayList<>();
        if(lineCount == 1){
            tmpList.add(1);
        } else if(lineCount == 2){
            tmpList.add(1);tmpList.add(1);
        } else{
            tmpList.add(1);
            List<Integer> prevList = res.get(res.size()-1);
            for(int i = 0;i < prevList.size() - 1;i ++){
                tmpList.add(prevList.get(i) + prevList.get(i+1));
            }
            tmpList.add(1);
        }
        res.add(tmpList);
        getLine(res, lineCount+1, maxCount);
    }
}