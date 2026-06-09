class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<num.length();i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && st.peek() > ch && k > 0){
                k--;
                st.pop();
            }
            st.push(ch);
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        StringBuilder res = new StringBuilder();
        boolean first = true;
        for(int i = 0;i<sb.length();i++){
            char c = sb.charAt(i);
            if(first && c == '0'){
                continue;
            }
            else{
                first = false;
                res.append(c);
            }
        }
        if(res.length() == 0) return "0";
        return res.toString();
    }
}