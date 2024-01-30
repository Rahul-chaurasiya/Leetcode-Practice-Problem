class Solution {
    public int evalRPN(String[] arr) {
        Stack<Integer>s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].length() == 1 && arr[i].charAt(0) < 48){
                s.push(solve(s.pop(),s.pop(), arr[i].charAt(0)));
            }else{
                s.push(Integer.parseInt(arr[i]));
            }
        }
        return s.pop();
    }

    private int solve(int b,int a, char op){
        if(op == '+')return a+b;
        if(op == '-') return a-b;
        if(op == '*') return a*b;
        else return a/b;
    }
}
