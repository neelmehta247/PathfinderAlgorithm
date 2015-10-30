/**
 * Created by neel on 23/10/15 at 9:20 AM.
 */
public class Run {

    public static void main(String[] args) {
        Task task1 = new Task();
        task1.time_required = 3600;
        task1.latitude = 19.084;
        task1.longitude = 72.910;
        task1.task = "task1";
        TripManager.addTask(new LocationNode(task1));
        Task task2 = new Task();
        task2.time_required = 1800;
        task2.latitude = 19.174;
        task2.longitude = 73.005;
        task2.task = "task2";
        TripManager.addTask(new LocationNode(task2));
        Task task3 = new Task();
        task3.time_required = 2000;
        task3.latitude = 19.023;
        task3.longitude = 72.505;
        task3.task = "task3";
        TripManager.addTask(new LocationNode(task3));
        Task task4 = new Task();
        task4.time_required = 6217;
        task4.latitude = 19.054;
        task4.longitude = 72.925;
        task4.task = "task4";
        TripManager.addTask(new LocationNode(task4));
        Task task5 = new Task();
        task5.time_required = 3721;
        task5.latitude = 19.073;
        task5.longitude = 72.907;
        task5.task = "task5";
        TripManager.addTask(new LocationNode(task5));
        Task task6 = new Task();
        task6.time_required = 1101;
        task6.latitude = 19.174;
        task6.longitude = 72.900;
        task6.task = "task6";
        TripManager.addTask(new LocationNode(task6));
        Task task7 = new Task();
        task7.time_required = 2486;
        task7.latitude = 19.064;
        task7.longitude = 72.405;
        task7.task = "task7";
        TripManager.addTask(new LocationNode(task7));
        Task task8 = new Task();
        task8.time_required = 1723;
        task8.latitude = 19.053;
        task8.longitude = 72.895;
        task8.task = "task8";
        TripManager.addTask(new LocationNode(task8));
        Task task9 = new Task();
        task9.time_required = 2964;
        task9.latitude = 19.060;
        task9.longitude = 72.920;
        task9.task = "task9";
        TripManager.addTask(new LocationNode(task9));
        Task task10 = new Task();
        task10.time_required = 2451;
        task10.latitude = 19.174;
        task10.longitude = 72.865;
        task10.task = "task10";
        TripManager.addTask(new LocationNode(task10));
        Task task11 = new Task();
        task11.time_required = 2832;
        task11.latitude = 19.099;
        task11.longitude = 72.999;
        task11.task = "task11";
        TripManager.addTask(new LocationNode(task11));
        Task task12 = new Task();
        task12.time_required = 1298;
        task12.latitude = 19.274;
        task12.longitude = 72.901;
        task12.task = "task12";
        TripManager.addTask(new LocationNode(task12));
        Task task13 = new Task();
        task13.time_required = 1242;
        task13.latitude = 19.073;
        task13.longitude = 72.920;
        task13.task = "task13";
        TripManager.addTask(new LocationNode(task13));
        Task task14 = new Task();
        task14.time_required = 2985;
        task14.latitude = 19.500;
        task14.longitude = 72.705;
        task14.task = "task14";
        TripManager.addTask(new LocationNode(task14));
        Task task15 = new Task();
        task15.time_required = 3981;
        task15.latitude = 19.044;
        task15.longitude = 72.105;
        task15.task = "task15";
        TripManager.addTask(new LocationNode(task15));

        Population population = new Population(30, true); //After testing I found 30 is the optimum population size for result vs time taken
        System.out.println("Initial time taken: " + population.getFittest().getTime());

        population = GeneticAlgorithm.evolvePopulation(population);
        for (int i = 0; i < 55; i++) { //After testing I found 55 generations gave the best result vs time
            population = GeneticAlgorithm.evolvePopulation(population);
        }

        System.out.println("Finished");
        System.out.println("Final time: " + population.getFittest().getTime());
        System.out.println("Solution:");
        System.out.println(population.getFittest());
    }
}
