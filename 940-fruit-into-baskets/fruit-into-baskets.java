  import java.util.HashMap;
class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit to the window
            freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);

            // If more than 2 fruit types, shrink the window
            while (freq.size() > 2) {

                int leftFruit = fruits[left];

                freq.put(leftFruit, freq.get(leftFruit) - 1);

                if (freq.get(leftFruit) == 0) {
                    freq.remove(leftFruit);
                }

                left++;
            }

            // Update maximum window size
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
        
