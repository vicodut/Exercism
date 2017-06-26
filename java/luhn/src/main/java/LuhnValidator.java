import java.util.ArrayList;

class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll(" ", "");
        ArrayList<Integer> candidateTab = new ArrayList<>();
        int sum = 0;

        if (candidate.length() < 2)
        {
            return false;
        }
        for (int i = 0; i < candidate.length(); i++)
        {
            candidateTab.add(Character.getNumericValue(candidate.charAt(i)));
        }

        for (int i = candidateTab.size() - 2; i >= 0; i -= 2)
        {
            int newValue = candidateTab.get(i) * 2;
            newValue = newValue >= 9 ? newValue - 9 : newValue;
            System.out.println(newValue);
            candidateTab.set(i, newValue);
        }

        for (Integer aCandidateTab : candidateTab) {
            sum += aCandidateTab;
        }
        return sum % 10 == 0;
    }

}
