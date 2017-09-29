import java.util.*;

/**
 * Created by ysiguman on 28/09/17.
 * victord675 [at] gmail.com
 * <p>
 * Description :
 */
class RomanNumeral {
    private LinkedHashMap<Integer, String> tab;
    private int number;

    RomanNumeral(int number) {
        tab = new LinkedHashMap<>();
        tab.put(1000, "M");
        tab.put(900, "CM");
        tab.put(500, "D");
        tab.put(400, "CD");
        tab.put(100, "C");
        tab.put(90, "XC");
        tab.put(50, "L");
        tab.put(40, "XL");
        tab.put(10, "X");
        tab.put(9, "IX");
        tab.put(5, "V");
        tab.put(4, "IV");
        tab.put(1, "I");

        this.number = number;
    }

    String getRomanNumeral() {
        Iterator<Map.Entry<Integer, String>> romanNumber = tab.entrySet().iterator();
        StringBuilder sb = new StringBuilder();
        int decimal = number;

        while (romanNumber.hasNext()) {
            Map.Entry<Integer, String> element = romanNumber.next();
            sb.append( times(element.getValue(), decimal / element.getKey()) );
            decimal -= (decimal / element.getKey()) * element.getKey();
        }
        return sb.toString();
    }

    private String times(String romanNumber, int time) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < time; i++) {
            sb.append(romanNumber);
        }

        return sb.toString();
    }
}