import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = FileReaderHandler.fileReader("res/vegyes.txt");
        List<Animal> animals = new ArrayList<>();
        for (String line : list) {
            String[] parts = line.split(",");
            switch (parts[0]) {
                case "csirke" -> {
                    animals.add(makeChickenFromLine(line, ","));
                }
                case "kutya" -> {
                    animals.add(makeDogFromLine(line, ","));
                }
            }
            for (var actual : animals) {
                System.out.println(actual);
            }


        }
    }

    public static Dog makeDogFromLine(String file, String regex) {
        String[] parts = file.split(regex);
        return new Dog(parts[1], Integer.parseInt(parts[2]), parts[3]);
    }

    public static Chicken makeChickenFromLine(String file, String regex) {
        String[] parts = file.split(regex);
        return new Chicken(Integer.parseInt(parts[1]), Double.parseDouble(parts[2]));
    }
}
