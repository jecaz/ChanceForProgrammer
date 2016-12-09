package sort_students;

/*
* (Sort students) Write a program that prompts the user to enter the number of  
* students, the students names, and their scores, and prints student names in  
* decreasing order of their scores.                                             
*/
import java.util.Scanner;

public class StudentScore {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of students
		System.out.print("Enter the number of students: ");
		String[] students = new String[input.nextInt()];
		int[] scores = new int[students.length];

		// Prompt the user to enter each students' names and their scores
		System.out.println("Enter the name and a score for each student:");
		for (int i = 0; i < students.length; i++) {
			System.out.print("Student " + (i + 1) + ": ");
			students[i] = input.next();
			System.out.print("Score: ");
			scores[i] = input.nextInt();
		}

		// Sort student names in decreasing order of their scores
		sortDecreasing(students, scores);

		// Display student name in decreasing order of their scores
		for (String student: students) {
			System.out.println(student);
		}
	}

	// sorts a string and integer array in decreasing order
	public static void sortDecreasing(String[] student, int[] score) {
		for (int i = 0; i < score.length; i++) {
			int max = score[i];
			int maxIndex = i;
			String temp;

			// Find the maximum in the list
			for (int j = i + 1; j < score.length; j++) {
				if (score[j] > max) {
					max = score[j];
					maxIndex = j;
				}
			}
			
			if (maxIndex != i) {
				// Swap string array
				temp = student[i];
				student[i] = student[maxIndex];
				student[maxIndex] = temp;

				// Swap int array
				score[maxIndex] = score[i];
				score[i] = max;
			}
		}
	}
}
