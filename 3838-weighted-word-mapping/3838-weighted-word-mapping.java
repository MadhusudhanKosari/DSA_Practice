class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            int sum = 0;
            for(int i = 0;i<word.length();i++){
                int num = (word.charAt(i) - 'a');
                sum += weights[num];
            }
            sum = sum % 26;
            sb.append((char)('z' - sum ));
        }
        return sb.toString();
    }
}