import java.util.Scanner;

public class StudentGrades {
    // Attributes
    public int approvedStudents;
    public int finalTest;
    public int failedStudents;

    // Create the vector (it's considered a class) and store it in the memory
    double grade[] = new double[20];

    // Method that store the inputs
    public void inputStorage() {
        // Create a new object in the Scanner class (instantiate)
        Scanner dataInput = new Scanner(System.in);

        /*
         * Creates a loop that runs through the vector, starting in the position 0 (i=
         * 0). As long as the position value is below 20, it adds +1 to it. In
         * that way, when i = 20, the loop stops.
         */
        for (int i = 0; i < grade.length; i++) {
            /*
             * Print a phrase where the user can input the grade value
             * (i + 1) --> as long as the for runs through the vector, it adds 1 to the
             * position (i), informing the student index.
             */
            System.out.printf("Insert the grade of student " + (i + 1) + ": ");

            /*
             * Calls the method nextDouble throught the Scanner object dataInput that will
             * read the inputs and store them in the attribute grade, in the position i
             */
            grade[i] = dataInput.nextDouble();
        }

        // Closes the Scanner
        dataInput.close();
    }

    /*
     * Method that calculate the number of students that were approved, failed or
     * have to do the final test
     */
    public void calculateStudentsResults() {
        /*
         * Creates and initiates the aux variable i that represents the index of the
         * vector and determinates how many times the while will run
         */
        int i = 0;

        /*
         * Creates the loop that will run throught the vector, starting in the index i
         * = 0 and keep going as long as less then or equal to the vector length.
         */
        while (i < grade.length) {

            /*
             * Compares the value of the grade that is stored in the position i of the
             * vector with the grade that is needed classify if the student have been
             * approved, failed or gone to the final test
             */
            if (grade[i] >= 7) {
                approvedStudents++;
            } else if (grade[i] >= 4) {
                finalTest++;
            } else {
                failedStudents++;
            }

            /*
             * Adds 1 to the index i, so it can continue running on the while, until it's
             * less then or equal to the vector lenght
             */
            i++;

        }

        // Prints the results
        System.out.println("Total of students that have been approved: " + approvedStudents++);
        System.out.println("Total of students that will have to do the final test: " + finalTest++);
        System.out.println("Total of students that have failed the year " + failedStudents++);

    }

}
