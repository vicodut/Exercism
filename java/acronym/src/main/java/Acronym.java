class Acronym {
    private String phrase;
    private String achronym;

    Acronym(String phrase) {
        this.phrase = phrase;
        StringBuilder sb = new StringBuilder();
        String[] phrase_table = phrase.split("[\\s-]");
        int i;

        for (i = 0; i < phrase_table.length; i++)
        {
            sb.append(phrase_table[i].charAt(0));
        }

        achronym = sb.toString().toUpperCase();
    }

    String get() {
        return achronym;
    }

}
