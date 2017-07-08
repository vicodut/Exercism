/**
 * Created by ysiguman on 08/07/17.
 */
public class PhoneNumber {
    private String number;

    PhoneNumber(String number) {
        number = number.replaceAll("[ ()-.]", "");

        if ( number.chars()
                    .filter(Character::isDigit)
                    .count() != number.chars()
                                        .count())
        {
            throw new IllegalArgumentException("Illegal character in phone number. Only digits, spaces, parentheses, hyphens or dots accepted.");
        }

        if (number.length() < 10 || number.length() > 11)
        {
            throw new IllegalArgumentException("Number must be 10 or 11 digits");
        }

        if (number.length() == 11)
        {
            if (number.charAt(0) != '1')
                throw new IllegalArgumentException("Can only have 11 digits if number starts with '1'");

            number = number.substring(1);
        }

        this.number = number;
    }
    public String getNumber() {
        return number;
    }
}
