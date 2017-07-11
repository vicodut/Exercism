import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ysiguman on 11/07/17.
 */
public class Allergies {
    private int score;
    private List<Allergen> allergens = new ArrayList<>();

    Allergies(int score) {
        while (score > 256)
        {
            score -= 256;
        }
        this.score = score;
        setAllegen();
    }

    private void setAllegen() {
        int count = 128;

        do {
            if (score >= count)
            {
                allergens.add(getAllergen(count));
                score -= count;
            }
            count = count / 2;
        } while(count >= 1);

        Collections.reverse(allergens);
    }

    boolean isAllergicTo(Allergen allergen) {
        return allergens.contains(allergen);
    }

    List<Allergen> getList() {
        return allergens;
    }

    private Allergen getAllergen(int score) {
        for (Allergen allergen : Allergen.values())
        {
            if (allergen.getScore() == score)
                return allergen;
        }
        return null;
    }
}
