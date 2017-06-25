class Scrabble {
    String[] regex = {"[aeioulnrstAEIOULNRST]",
            "[dgDG]",
            "[bcmpBCMP]",
            "[fhvwyFHVWY]",
            "[kK]",
            "[jxJX]",
            "[qzQZ]"};
    int[] score = {1, 2, 3, 4, 5, 8, 10};

    private String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int score = 0;
        String[] word_tab = this.word.split("");
        for (String letter : word_tab) {
            for (int j = 0; j < regex.length; j++) {
                if (letter.matches(regex[j])) {
                    score += this.score[j];
                }
            }
        }
        return score;
    }
}
