class Solution {
    public int minProcessingTime(List<Integer> pt, List<Integer> task) {
        int[] arr = new int[pt.size()];
        Collections.sort(pt, Collections.reverseOrder());
        Collections.sort(task);
        Arrays.fill(arr,Integer.MAX_VALUE);
        int j = 0;
        int k = 0;

        for (int i=0;i<pt.size();i++) {
            int x = pt.get(i);
            arr[k++] = x+task.get(i*4+3);
        }

        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
