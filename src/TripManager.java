import java.util.ArrayList;

/**
 * Created by neel on 28/10/15 at 12:24 AM.
 */
public class TripManager {

    private static ArrayList<LocationNode> locationList = new ArrayList<>();

    public static void addTask(LocationNode location) { //This will be called once the DB is read
        locationList.add(location);
    }

    public static LocationNode getLocation(int index) {
        return locationList.get(index);
    }

    public static int numberOfCities() {
        return locationList.size();
    }

}
