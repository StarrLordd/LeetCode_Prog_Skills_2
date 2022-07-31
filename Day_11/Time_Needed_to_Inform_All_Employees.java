class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < manager.length; i++) {
            graph.computeIfAbsent(manager[i], x -> new ArrayList<>()).add(i);
        }
        
        int time = 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {headID, 0});
        while(!q.isEmpty()) {
            int curr = q.peek()[0];
            int t = q.poll()[1];
            time = Math.max(time, t);
            if(graph.get(curr) == null) continue;
            
            for(int nxt: graph.get(curr)) {
                int nxtTime = t + informTime[curr];
                q.add(new int[] {nxt, nxtTime});
            }
        }
        
        return time;
    }
}