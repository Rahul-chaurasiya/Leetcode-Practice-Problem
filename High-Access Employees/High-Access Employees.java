class Solution {
    class comp implements Comparator<List<String>>{
        @Override
        public int compare(List<String> listA,List<String> listB){
            String a = listA.get(0), timeA = listA.get(1);
            String b = listB.get(0), timeB = listB.get(1);
            
            if(a.compareTo(b) < 0){
                return -1;
            }
            else if(a.compareTo(b) > 0){
                return 1;
            }
            else{
                return timeA.compareTo(timeB);
            }
        }
    }

    public List<String> findHighAccessEmployees(List<List<String>> list) {
        HashMap<String,List<String>>hs = new HashMap<>();
        Collections.sort(list,new comp());
        List<String>ans = new ArrayList<>();
        for(List<String> x : list){
            String name = x.get(0);
            String time = x.get(1);
            hs.putIfAbsent(name, new ArrayList<String>());
            hs.get(name).add(time);
        }

        String lastEmp  = "";
        for(Map.Entry<String,List<String>> entry : hs.entrySet()){
            String empName = entry.getKey();
            List<String> timeList = entry.getValue();
            Queue<String> queue = new ArrayDeque<>();

            for(int i=0;i<timeList.size();++i){
                while(!queue.isEmpty() && !areWithin1Hour(timeList.get(i),queue.peek()))            queue.poll();
                queue.offer(timeList.get(i));

                if(queue.size() >=3 && !lastEmp.equals(empName)){
                    ans.add(empName); 
                    lastEmp = empName;
                }                
            } 
        }
        return ans;
    }

    public boolean areWithin1Hour(String time1,String time2){       
        int hour1 = Integer.parseInt(time1.substring(0,2)), hour2 = Integer.parseInt(time2.substring(0,2));
        int minutes1 = Integer.parseInt(time1.substring(2)), minutes2 = Integer.parseInt(time2.substring(2));

        if(hour1 == hour2)              return true;
        else if(hour1 == hour2 + 1 && minutes1 <= minutes2 - 1)         return true;

        return false;
    }
}
