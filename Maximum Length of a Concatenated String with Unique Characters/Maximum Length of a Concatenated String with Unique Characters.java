class Solution {
    public int maxLength(List<String> arr) {
        List<String>ans = new ArrayList<>();
        return solve(0,ans,arr);
    }

    private int solve(int index,List<String> ans,List<String>arr){
        if(index>=arr.size()) return 0;
        ans.add(arr.get(index));
        Map<Character,Integer>m = new HashMap<>();
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).length();j++){
                m.put(ans.get(i).charAt(j),m.getOrDefault(ans.get(i).charAt(j),0)+1);
            }
        }

        boolean flag = true;
        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            if (entry.getValue() > 1) {
                flag = false;
                break;
            }
        }

        int opt1 = 0, opt2 = 0;
        if (flag) opt1 = arr.get(index).length() + solve(index + 1, ans, arr);
        ans.remove(ans.size() - 1);
        opt2 = solve(index + 1, ans, arr);

        return Math.max(opt1, opt2);
    }
}
