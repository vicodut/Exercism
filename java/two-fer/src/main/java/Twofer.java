public class Twofer {
    private String sentence = "One for %s, one for me.";
    public String twofer(String name) {
        if (name == null)
        {
            return String.format(sentence, "you");
        } else
        {
            switch (name)
            {
                case "":
                    return String.format(sentence, "you");
                default:
                    return String.format(sentence, name);
            }
        }
    }
}