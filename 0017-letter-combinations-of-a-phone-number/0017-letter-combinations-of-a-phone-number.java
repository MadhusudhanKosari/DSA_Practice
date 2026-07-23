class Solution {
    public void helper(String digits,String wrds[],List<String> ans,String curr,int idx){
        if(idx == digits.length()){
            ans.add(curr);
            return;
        }
        String s = wrds[digits.charAt(idx)-'0'];
        for(int i = 0;i<s.length();i++){
            helper(digits,wrds,ans,curr+s.charAt(i),idx+1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String wrds[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        helper(digits,wrds,ans,"",0);
        return ans;
    }
}