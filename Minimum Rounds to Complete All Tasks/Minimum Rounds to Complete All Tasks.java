class Solution {
    public int minimumRounds(int[] tasks) {
        int res=0,count=0;
        Arrays.sort(tasks);
        if(tasks.length == 1) return -1;

        if(tasks.length == 2){
            if(tasks[0] == tasks[1]) return 1;
            else return -1;
        }
        if(tasks[0] != tasks[1]) return -1;

        for(int i=0;i<tasks.length;i++){
            count++;
            if (i == tasks.length - 1 || tasks[i] != tasks[i + 1]) {
                if (count == 1) {
                    return -1;
                }
                res += count / 3;
                if(count % 3 != 0) res++;
                count = 0;
            }

        }
        return res;
    }
}
