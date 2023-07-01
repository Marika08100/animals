import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = FileReaderHandler.fileReader("res/dog.txt");
        List<Dog> dogs = new ArrayList<>();
        for(String line : list){
            String[] parts = line.split(",");
            dogs.add(new Dog(parts[0],Integer.parseInt(parts[1]),parts[2]));
        }


    }
}
