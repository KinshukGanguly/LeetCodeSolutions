class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[]visited,ArrayList<Integer>result,int s){
       visited[s] = true;
       result.add(s);
       
       for(int i:adj.get(s)){
           if(!visited[i]){
               dfs(adj,visited,result,i);
           }
       }
    }
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> result = new ArrayList<>();
        dfs(adj,visited,result,0);
        return result;
    }
}
