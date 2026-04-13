class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int nrOfPiles = piles.length;
        int maxNrOfB = 0;
        for(int i = 0; i<piles.length; i++) {
            maxNrOfB = maxNrOfB < piles[i] ? piles[i] : maxNrOfB;
        }

        int i=1;
        while(i<=maxNrOfB) {
            int mid = i+(maxNrOfB-i)/2;

            int hours = 0;
            for(int pile:piles) {
                hours += (pile+mid-1)/mid;
            }
            if(hours<=h) {
                maxNrOfB = mid-1;
            }else {
                i = mid+1;
            }
        }

        return i;
    }
}
