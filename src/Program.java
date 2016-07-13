/**
 * Created by larsh on 15-6-2016.
 */
public class Program {

    private static final int TOTAL_ITERATIONS = 500;
    private static final int POPULATION_SIZE = 40;

    public static void main(String[] args) {
        Population myPop = new Population(POPULATION_SIZE, true);

        FitnessCalc.setSolution("00011");
        int bestFitness = Integer.MIN_VALUE;
        Individual bestIndividual = null;

        int noImprovementCount = 0;

        for (int generationCount = 0; generationCount < TOTAL_ITERATIONS; generationCount++) {
            System.out.println("Generation: " + generationCount + "\nFittest: " + myPop.getFittest().getFitness());
            myPop = Algorithm.evolvePopulation(myPop);

            if (bestFitness < myPop.getFittest().getFitness()) {
                bestIndividual = myPop.getFittest();
                noImprovementCount = 0;
            } else if (++noImprovementCount == 5) {
                break;
            }
        }
        System.out.println("Value of x: " + Integer.parseInt(bestIndividual.toString(), 2));
    }
}
