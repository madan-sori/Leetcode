// class Solution {
//     public boolean checkInclusion(String s1, String s2) {

//         if (s1.length() > s2.length()) {
//             return false;
//         }

//         int[] freq = new int[26];


//         for (int i = 0; i < s1.length(); i++) {
//             freq[s1.charAt(i) - 'a']++;
//         }

//         int left = 0;

//         for (int right = 0; right < s2.length(); right++) {

            
//             freq[s2.charAt(right) - 'a']--;

            
//             if (right - left + 1 > s1.length()) {
//                 freq[s2.charAt(left) - 'a']++;
//                 left++;
//             }

           
//             boolean match = true;

//             for (int i = 0; i < 26; i++) {
//                 if (freq[i] != 0) {
//                     match = false;
//                     break;
//                 }
//             }

//             if (match) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }

//-----------------------------------------------------------------------------------------------------

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }

        int left = 0;
        int need = s1.length();

        for (int right = 0; right < s2.length(); right++) {

            int index = s2.charAt(right) - 'a';

            if (count[index] > 0) {
                need--;
            }

            count[index]--;

            if (right - left + 1 > s1.length()) {

                int leftIndex = s2.charAt(left) - 'a';

                if (count[leftIndex] >= 0) {
                    need++;
                }

                count[leftIndex]++;
                left++;
            }

            if (need == 0) {
                return true;
            }
        }

        return false;
    }
}