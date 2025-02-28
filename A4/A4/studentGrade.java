import java.util.Scanner;

public class studentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create scanner
		Scanner scanner = new Scanner(System.in);

		 // User enters the total number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create an array to store the user input scores
        int[] scores = new int[numberOfStudents];

        //User enters scores for each student
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = scanner.nextInt();
        }

        // call high score method
        int bestScore = findHighScore(scores);

        // Assign grades and display them
        for (int i = 0; i < numberOfStudents; i++) {
            char grade = assignFinalGrade(scores[i], bestScore);
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }

        scanner.close();
    }

    // Method to find the highest score from user input
   static int findHighScore(int[] scores) {
        int highScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }
        return highScore;
    }

    // Method to assign grades based on the scheme
   static char assignFinalGrade(int score, int best) {
        if (score >= best - 10) {
            return 'A';
        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    
   		}
	}


