/**
 * Created by neel on 29/10/15 at 11:10 AM.
 */
public class Population {

    TripIndividual[] trips;

    public Population(int populationSize, boolean initialise) {
        trips = new TripIndividual[populationSize];

        if (initialise) {
            for (int i = 0; i < populationSize(); i++) {
                TripIndividual individual = new TripIndividual();
                saveTrip(i, individual);
            }
        }
    }

    public int populationSize() {
        return trips.length;
    }

    public void saveTrip(int index, TripIndividual individual) {
        trips[index] = individual;
    }

    public TripIndividual getTrip(int index) {
        return trips[index];
    }

    public TripIndividual getFittest() {
        TripIndividual fittest = trips[0];

        for (int i = 0; i < populationSize(); i++) {
            if (fittest.getFitness() <= getTrip(i).getFitness()) {
                fittest = getTrip(i);
            }
        }

        return fittest;
    }
}
