import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        System.out.println(new Solution().merge(new int[][]{{1,3},{2,6},{8,10},{15,18},}));
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        int[] axis = new int[10001];
        for(int i = 0;i < intervals.length;i ++){
            for(int j = intervals[i][0];j <= intervals[i][1];j ++){
                axis[j] = 1;
            }
        }
        int flag = 0;
        int[] tmp = new int[2];
        for(int i = 0;i < 10001;i ++){
            if(axis[i] == 1 && flag == 0){
                tmp[0] = i;
                flag = 1;
            } else if(axis[i] == 0 && flag == 1){
                tmp[1] = i - 1;
                res.add(tmp.clone());
                flag = 0;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}