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

    public static LocationNode removeLocation() {
        LocationNode last = getLocation(0);
        for (int i = 0; i < numberOfCities(); i++) {
            if (getLocation(i).getTask().deadline > last.getTask().deadline) {
                last = getLocation(i);
            }
        }
        locationList.remove(last);
        return last;
    }
}
