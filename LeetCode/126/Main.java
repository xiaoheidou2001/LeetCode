import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>(){{
            add("hot");add("dot");add("dog");
            add("lot");add("log");add("cog");
        }};
        System.out.println(new Solution().findLadders(beginWord, endWord, wordList));
    }
}


// 难逃死循环
// class Solution {
//     String beginWord = new String();
//     String endWord = new String();
//     List<String> wordList = new ArrayList<>();
//     List<List<String>> results = new ArrayList<>();
//     public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
//         this.beginWord = beginWord;
//         this.endWord = endWord;
//         this.wordList = wordList;
//         List<String> res = new ArrayList<>();
//         findL(beginWord,res);
//         return results;
//     }
//     public List<String> findMatch(String curr){
//         List<String> tmpList = new ArrayList<>();
//         for(int i = 0;i < wordList.size();i ++){
//             int count = 0;
//             for(int j = 0;j < wordList.get(i).length();j ++){
//                 if(wordList.get(i).charAt(j) != curr.charAt(j)){
//                     count += 1;
//                 }
//             }
//             if(count == 1){
//                 tmpList.add(wordList.get(i));
//             }
//         }
//         return tmpList;
//     }
//     public void findL(String curr, List<String> res){
//         if(curr == endWord){
//             results.add(res);
//         } else{
//             List<String> tmpList = findMatch(curr);
//             for(int i = 0;i < tmpList.size();i ++){
//                 res.add(tmpList.get(i));
//                 findL(tmpList.get(i), res);
//                 res.remove(tmpList.get(i));
//             }
//         }
//     }
// }

class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList){
        List<List<String>> res = new ArrayList<>();
        if(!wordList.contains(endWord)) return res;
        if(!wordList.contains(beginWord)) wordList.add(0, beginWord);
        // construct the graph
        int[][] graph = new int[wordList.size()][wordList.size()];
        for(int i = 0;i < wordList.size()-1;i ++){
            for(int j = i + 1;j < wordList.size();j ++){
                if(judgeMatch(wordList.get(i), wordList.get(j)));
                graph[i][j] = 1;
                graph[j][i] = 1;
            }
        }
        // find min length path

        // return result
        return res;
    }
    public boolean judgeMatch(String str1, String str2){
        int count = 0;
        if(str1.length() != str2.length()) return false;
        for(int i = 0; i < str1.length();i ++){
            if(str1.charAt(i) != str2.charAt(i)){
                count++;
            }
        }
        if(count == 1) return true;
        else return false;
    }
}