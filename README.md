# PathfinderAlgorithm
This is the algorithm that determines the shortest route that can be taken within a given time considering the time taken to go from place to place, the deadline for a particular task to be finished and how long the task will take.

It is essentially a genetic algorithm and the solution consists of the set of places that will be travelled to. Since this is similar to the travelling salesman problem, it uses a similar approach and the fitness is determined by the time taken. Time taken is calculated by the time to go from one place to another and the time required at that point for the task. Using tournament selection, crossovers are done and a new generation is formed. The population size I am using is 30.

After a 75 generations (optimal value for results vs time after testing) if the fittest solution is still not as good as what is required, then based on the deadline for the events and the time taken for that particular task, the one that has the furthest deadline is taken out and the process is repeated with the rest of the locations. If there are 2 locations with the same deadline, then the amount of time taken for that task is taken and the one that takes longer is taken out. In case of the same time taken for both tasks, then their distances from the rest is calculated, and whichever has the lower average distance (or lower smallest distance from one location) is kept and the other discarded. 

If the target isn't met, more tasks are discarded based on the process decided above.

This way, when the solution's fitness is better than the target fitness, the process is stopped and the path is outputted.
