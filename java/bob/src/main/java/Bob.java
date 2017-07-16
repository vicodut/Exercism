/**
 * Created by ysiguman on 12/07/17.
 */
public class Bob {
    String hey (String question) {
        while(!question.isEmpty() && question.charAt(question.length() - 1) == ' ')
            question = question.substring(0, question.length() - 1);

        if (question.isEmpty())
            return "Fine. Be that way!";

        if (isYell(question))
            return "Whoa, chill out!";

        if (isQuestion(question))
            return "Sure.";

        return "Whatever.";
    }

    private boolean isYell(String question) {
        return question.equals(question.toUpperCase()) && !question.equals(question.toLowerCase());
    }

    private boolean isQuestion(String question) {
        return question.split("")[question.length() - 1].equals("?");
    }

    private boolean isAnything(String question) {
        return question.split("")[question.length() - 1].matches("[.!]");
    }
}
