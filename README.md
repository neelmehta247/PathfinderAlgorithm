# PathfinderAlgorithm
This algorithm determines the best route between a set number of places that can be taken within a given time. Each place has a task to be completed with a set deadline. The algorithm considers the time taken to go from place to place, the deadline for a particular task to be finished, and how long the task will take.

It is a genetic algorithm where the solution consists of the set of places that will be travelled to. Since this is similar to the travelling salesman problem, it uses a similar approach where fitness (whether the path is possible in the given timeframe) is determined by the time taken. Time taken is calculated by the time to go from one place to another and the time required at that point for the task. Using tournament selection, crossovers are done and a new generation is formed. The population size is 30.

After a 75 generations (optimal value for results vs time after testing) if the fittest (shortest) solution is still not as good required, a task is removed based on the deadline for the events and the time taken for that particular task. The task that has the most overdue deadline is removed and the algorithm is repeated with the remaining places. If 2 locations have the same deadline, the place with the longest task is removed. If the time taken for both tasks is the same, the place with the lowest average distance from other places is kept and the other place is discarded.

If the target still is not met, more tasks are discarded based on the process detailed above.

When the solution's fitness is better than the target fitness, the process is stopped and the path is outputted.
