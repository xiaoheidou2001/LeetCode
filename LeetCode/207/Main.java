import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        System.out.println(new Solution().canFinish(5, new int[][]{{1,0},{2,0},{3,1},{3,4},{4,2},{3,4}}));
    }
}

class Solution {

    List<List<Integer>> edges;
    int[] visited;
    List<Integer> res = new ArrayList<>();//

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // initialize the graph
        edges = new ArrayList<List<Integer>>();
        visited = new int[numCourses];
        for(int i = 0;i < numCourses;i ++){
            edges.add(new ArrayList<Integer>());
        }
        for(int[] info : prerequisites){
            edges.get(info[1]).add(info[0]);
        }
        DFS(1);
        System.out.println(res);
        return true;
    }

    public void DFS(int v){
        visited[v] = 1;
        res.add(v);
        for(int u : edges.get(v)){
            if(visited[u] == 0){
                DFS(u);
            }
        }
    }
}


// class Solution {
//     List<List<Integer>> edges;
//     int[] visited;
//     boolean valid = true;

//     public boolean canFinish(int numCourses, int[][] prerequisites) {
//         edges = new ArrayList<List<Integer>>();
//         for (int i = 0; i < numCourses; ++i) {
//             edges.add(new ArrayList<Integer>());
//         }
//         visited = new int[numCourses];
//         for (int[] info : prerequisites) {
//             edges.get(info[1]).add(info[0]);
//         }
//         for (int i = 0; i < numCourses && valid; ++i) {
//             if (visited[i] == 0) {
//                 dfs(i);
//             }
//         }
//         return valid;
//     }

//     public void dfs(int u) {
//         visited[u] = 1;
//         for (int v: edges.get(u)) {
//             if (visited[v] == 0) {
//                 dfs(v);
//                 if (!valid) {
//                     return;
//                 }
//             } else if (visited[v] == 1) {
//                 valid = false;
//                 return;
//             }
//         }
//         visited[u] = 2;
//     }
// }