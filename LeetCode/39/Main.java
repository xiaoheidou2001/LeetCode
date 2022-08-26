import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] candidates = {2};
        int target = 1;
        System.out.print(new Solution().combinationSum(candidates, target));
    }
}

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        findSolution(candidates, target, new ArrayList<>(), 0, res);
        return res;
    }

    public void findSolution(int[] candidates, int target, List<Integer> solution, int currSum, List<List<Integer>> res) {
        if(currSum == target){
            res.add(new ArrayList<>(solution));
            return;
        } else if(currSum > target) return;
        int currIdx = 0;
        if(solution.isEmpty());
        else currIdx = getIdx(candidates, solution.get(solution.size() - 1));
        for(int i = currIdx;i < candidates.length;i ++){
            solution.add(candidates[i]);
            findSolution(candidates, target, solution, currSum + candidates[i], res);
            solution.remove(solution.size() - 1);
        }
    }

    public int getIdx(int[] array,int target){
        for(int i = 0;i < array.length;i ++){
            if(array[i] == target) return i;
        }
        return -1;
    }
    
}