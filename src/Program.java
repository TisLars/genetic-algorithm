/**
 * Created by larsh on 15-6-2016.
 */
public class Program {

    public static void main(String[] args) {
//        double result = 0;
//        int highest = 0;
//
//        for (int i = 0; i < 31; i++) {
//            double calc = calculateFormula(i);
//            System.out.println(calc + "\t\t" + i);
//            if (calc > result) {
//                result = calc;
//                highest = i;
//            }
//        }

//        System.out.println(result + "\t\t" + highest);

        // Set a candidate solution
//        FitnessCalc.setSolution("00011");

        // Create an initial population
        Population myPop = new Population(3, true);

        // Evolve our population until we reach an optimum solution
        int generationCount = 0;
        while (myPop.getFittest().getFitness() < FitnessCalc.getMaxFitness()) {
            generationCount++;
            System.out.println("Generation: " + generationCount + " Fittest: " + myPop.getFittest().getFitness());
            myPop = Algorithm.evolvePopulation(myPop);
        }
        System.out.println("Solution found!");
        System.out.println("Generation: " + generationCount);
        System.out.println("Genes:");
        System.out.println(myPop.getFittest());
    }
}
