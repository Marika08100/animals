import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = FileReaderHandler.fileReader("res/dog.txt");
        List<Dog> dogs = new ArrayList<>();
        List<String> list1 = FileReaderHandler.fileReader("res/chicken.txt");
        List<Chicken> chickens = new ArrayList<>();
        for (String line : list) {
            dogs.add(makeDogFromLine(line, ","));
        }
        for (var actual : dogs) {
            System.out.println(actual);
        }
        for (String line : list1) {
            chickens.add(makeChickenFromLine(line, ","));
        }
        for (var actual : chickens) {
            System.out.println(actual);
        }

    }

    public static Dog makeDogFromLine(String file, String regex) {
        String[] parts = file.split(regex);
        return new Dog(parts[0], Integer.parseInt(parts[1]), parts[2]);
    }

    public static Chicken makeChickenFromLine(String file, String regex) {
        String[] parts = file.split(regex);
        return new Chicken(Integer.parseInt(parts[0]),Double.parseDouble(parts[1]));
    }
}
