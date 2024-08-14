
import java.util.Scanner;
public class CgpaCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of subjects: ");
        int userInput = sc.nextInt();
        int sum = 0;
        int gp = 0;
        double result = 0;

        int [] marks = new int [userInput];
        int [] gradePoints = new int[userInput];

        for(int i=0; i<userInput; i++){
            System.out.print("Enter for Subject "+i+" :");
            int inputMarks = sc.nextInt();
            marks[i] = inputMarks;
            if(inputMarks>91 && inputMarks<=100){
                gp = 10;
                gradePoints[i] = gp;
            }
            else if(inputMarks>81 && inputMarks<=90){
                gp = 9;
                gradePoints[i] = gp;
            }
            else if(inputMarks>71 && inputMarks<=80){
                gp = 8;
                gradePoints[i] = gp;
            }
            else if(inputMarks>61 && inputMarks<=70){
                gp = 7;
                gradePoints[i] = gp;
            }
            else if(inputMarks>51 && inputMarks<=60){
                gp = 6;
                gradePoints[i] = gp;
            }
            else if(inputMarks>41 && inputMarks<=50){
                gp = 5;
                gradePoints[i] = gp;
            }
            else if(inputMarks>31 && inputMarks<=40){
                gp = 4;
                gradePoints[i] = gp;
            }
        }
        sc.close();
        
            for(int x:gradePoints){
                sum+=x;
            }
            result = sum / userInput;
            System.out.println("CGPA: "+result);

        }
        
    }
    
