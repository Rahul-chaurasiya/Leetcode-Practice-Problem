class Solution {
    public String reformatNumber(String number) {
        String num = "";
        for(char ch : number.toCharArray()){
            if(ch == '-' || ch == ' ')continue;
            else num += ch;
        }

        int length = num.length();
        if(length % 3 == 0) return format_0(num);
        else if(length % 3 == 1) return format_1(num);
        else return format_2(num);
    }

    private String format_0(String num){
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<num.length();i=i+3){
            ans.append(num.substring(i,i+3));
            ans.append("-");
        }
        return ans.substring(0,ans.length()-1).toString();
    }

    private String format_1(String num){
        StringBuilder ans = new StringBuilder("");
        StringBuilder s1 = new StringBuilder("");
        s1.append(num.substring(0, num.length()-4));
        for(int i=0; i<s1.length(); i+=3){
            ans.append(s1.substring(i, i+3));
            ans.append("-");
        }
        ans.append(num.substring(num.length()-4, num.length()-2));
        ans.append("-");
        ans.append(num.substring(num.length()-2));
        return ans.toString();
    }

    private String format_2(String num){
        StringBuilder ans = new StringBuilder("");
        StringBuilder s1 = new StringBuilder("");
        s1.append(num.substring(0, num.length()-2));
        for(int i=0; i<s1.length(); i+=3){
            ans.append(s1.substring(i, i+3));
            ans.append("-");
        }
        ans.append(num.substring(num.length()-2));
        return ans.toString();
    }
}
