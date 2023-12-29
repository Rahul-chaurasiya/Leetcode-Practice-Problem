class Solution {
    public int kthSmallest(int[][] mat, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(pq.size()>k) pq.poll();
                pq.add(mat[i][j]);
            }
        }
        if(pq.size()>k) pq.poll();
        return pq.peek();
    }
}
