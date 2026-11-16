class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0;

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            max = Math.max(max, words.length);
        }

        return max;
    }

    // int maxWords = 0;

    // for(int i = 0; i < sentences.lenght)
} 