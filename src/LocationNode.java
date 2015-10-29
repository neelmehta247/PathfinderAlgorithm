/**
 * Created by neel on 27/10/15 at 11:37 PM.
 */
public class LocationNode {

    //Separate class created for location since the Task object would be obtained directly from the database
    //and so this class could be used to perform all the functions on the Task object without affecting it
    private Task task;

    public LocationNode(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public double timeFrom(LocationNode location) {
        //The time taken should be calculated using Android APIs to get transit time between 2 places
        //For now, a time based on distance only is being sent assuming
        double latDistance = Math.toRadians(task.latitude - location.getTask().latitude);
        double lonDistance = Math.toRadians(task.longitude - location.getTask().longitude);
        double a = (Math.sin(latDistance / 2) * Math.sin(latDistance / 2)) + (Math.cos(Math.toRadians(task.latitude)) *
                Math.cos(Math.toRadians(location.getTask().latitude)) * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2));
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = c * 6371; //km

        //Returns time in seconds. The time taken to finish the task should also be in seconds.
        return distance / (20 / (60 * 60)); //Assuming 20 kmph. This will be different.
    }

    public double timeTillFinishedFrom(LocationNode location) {
        return timeFrom(location) + task.time_required;
    }

    @Override
    public String toString() {
        return task.task;
    }
}
