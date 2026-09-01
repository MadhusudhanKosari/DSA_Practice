class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int n = g.length;
        int m = s.length;

        int l = 0; // cookie pointer
        int r = 0; // child pointer

        while (l < m && r < n) {

            if (s[l] >= g[r]) {
                r++;  // cookie assigned
            }

            l++;      // move to next child
        }

        return r;
    }
}