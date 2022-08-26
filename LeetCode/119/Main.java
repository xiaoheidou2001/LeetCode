import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public List<Integer> getRow(int rowIndex, List<Integer> res) {
        List<Integer> tmp = new ArrayList<>();
        for(int i = 0;i < rowIndex-2;i ++){
            tmp.add(res.get(i)+res.get(i+1));
        }
        getRow()
    }
}