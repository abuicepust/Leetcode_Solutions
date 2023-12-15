import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public static void main(String[] args) {
        // Create an instance of DestinationCity
        //DestinationCity destinationCity = new DestinationCity();

        // Create a list of paths (replace this with your actual data)
        List<List<String>> paths = new ArrayList<>();
        List<String> path1 = List.of("CityA", "CityB");
        List<String> path2 = List.of("CityB", "CityC");
        List<String> path3 = List.of("CityD", "CityE");
        
        paths.add(path1);
        paths.add(path2);
        paths.add(path3);

        // Call the destCity method and print the result
        String destination = destCity(paths);
        System.out.println("Destination city: " + destination);
    }

    public static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> path : paths) {
            set.add(path.get(0));
        }
        for (List<String> path : paths) {
            if (!set.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return null;
    }
}
