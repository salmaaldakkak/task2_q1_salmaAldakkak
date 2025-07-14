import java.util.Scanner;


public class q1 {

    // method 3shan n calculate el avg for each student
   public static double calculateStudentAverage (double n1,double n2, double n3){
       return ((n1+n2+n3)/3);
   }

   // method 3shan n calculate el grade for each student

    public static char determineStudentGrade(double avg){
       char gradeSymbol = 0;
       if (avg>=85){
           gradeSymbol='A';
       } else if (avg>=70 && avg<=84) {
           gradeSymbol='B';
       }else if (avg>=50 && avg<=69){
           gradeSymbol='C';
       }else if (avg <50){
           gradeSymbol='F';
       }
       return gradeSymbol;
    }


    public static void main(String[]args){
      int studentNum, i;
      double score1,score2,score3,avg;
      String studentName;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of students: ");
      studentNum = in.nextInt();

      for (i = 1; i <= studentNum; i++){
          Scanner nameIn = new Scanner(System.in);
          System.out.printf("Enter student number %d name: ",i);
          studentName = nameIn.nextLine();
          System.out.print("Enter Exam 1 score: ");
          score1= in.nextDouble();
          System.out.print("Enter Exam 2 score: ");
          score2= in.nextDouble();
          System.out.print("Enter exam 3 score: ");
          score3= in.nextDouble();
          avg = calculateStudentAverage(score1,score2,score3);
          System.out.println("Student is "+ studentName);
          System.out.println(studentName+"'s score average is "+ avg);

          System.out.println(studentName+"'s final grade is "+ determineStudentGrade(avg));
      }
    }
}