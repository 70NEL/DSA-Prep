class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 > n2) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < n1; i++) {
            count1[s1.charAt(i) - 'a']++;
        }

        int st = 0;
        for (int dr = 0; dr < n2; dr++) {
            count2[s2.charAt(dr) - 'a']++;

            if (dr - st + 1 == n1) {
                if (Arrays.equals(count1, count2)) return true;

                count2[s2.charAt(st) - 'a']--;
                st++;
            }
        }

        return false;
    }
}