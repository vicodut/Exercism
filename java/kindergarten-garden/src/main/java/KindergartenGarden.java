import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class KindergartenGarden {
    private String[] children = {
            "Alice",
            "Bob",
            "Charlie",
            "David",
            "Eve",
            "Fred",
            "Ginny",
            "Harriet",
            "Ileana",
            "Joseph",
            "Kincaid",
            "Larry"
    };
    private String[] garden;

    KindergartenGarden(String garden, String[] students) {
        this(garden);
        Arrays.sort(students);
        this.children = students;
    }

    KindergartenGarden(String garden) {
        this.garden = garden.split("\n");
    }

    List getPlantsOfStudent(String student) {
        int indexStudent = getIndexStudent(student);
        return getStudentPlants(indexStudent);
    }

    private int getIndexStudent(String student)
    {
        for (int i = 0; i < children.length; i++)
        {
            if (children[i].matches(student))
            {
                return i;
            }
        }
        return -1;
    }

    private List getStudentPlants(int index)
    {
        List<Plant> plants = new ArrayList<>();
        for(String row : garden)
        {
            plants.add(Plant.getPlant(row.charAt(index * 2)));
            plants.add(Plant.getPlant(row.charAt(index * 2 + 1)));
        }
        return plants;
    }
}