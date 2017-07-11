import java.util.Random;
import java.util.Set;

/**
 * Created by ysiguman on 10/07/17.
 */
public class Robot {
    private static Set<String> namesList;
    private String robotName;

    Robot () {
        setName();
    }

    public String getName() {
        System.out.println(robotName);
        return this.robotName;
    }
    private void setName() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (65 + r.nextInt(90 - 65)));
        sb.append((char) (65 + r.nextInt(90 - 65)));
        sb.append((char) 100 + r.nextInt(999));
        robotName = sb.toString();
    }

    void reset () {
        setName();
    }


}
