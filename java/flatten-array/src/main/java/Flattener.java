import java.util.ArrayList;
import java.util.List;

class Flattener {
    private static List flatList;

    Flattener() {
        flatList = new ArrayList();
    }

    List flatten(List list) {
        flatt(list);
        return flatList;
    }

    private void flatt(List list) {
        for (Object aList : list) {
            if (aList instanceof List) {
                flatt((List) aList);
            } else if (aList != null){
                flatList.add(aList);
            }
        }
    }

}
