
//Luke Bradaric
import java.util.Scanner;
public class Grades
{
    Scanner sc = new Scanner(System.in);

    float total = 0;
    int totalGrds;
    int f;
    public Grades()
    {

    }

    public void newGrades(){
        System.out.println("Input Grades, when done type o");
        char grade = sc.next().charAt(0);
        addGrade(grade);
    }

    private void addGrade(char grade){
        if(grade == 'a'){
            total+=4;
            totalGrds++;
            newGrades();
        }else if(grade == 'b'){
            total+=3;
            totalGrds++;
            newGrades();
        }else if(grade == 'c'){
            total+=2;
            totalGrds++;
            newGrades();
        }else if(grade == 'd'){
            total+=1;
            totalGrds++;
            newGrades();
        }
        else if(grade == 'f'){
            totalGrds++;
            f++;
            newGrades();
        }
        else if(grade == 'o'){
            printOut();
        }
        else
            System.out.println("Invalid Grade");
            
    }
    
    private void printOut(){
        float gpa = total / totalGrds;
        if(totalGrds < 4){
            System.out.println("Ineligible, taking less than 4 classes");
        }else if(gpa < 2.0){
            System.out.println("Ineligible, gpa below 2.0");
        }else if(gpa >= 2.0 && f > 0){
            System.out.println("Ineligible, gpa above 2.0, but has F grade");
        }else if(gpa < 2.0 && f > 0){
            System.out.println("Ineligible, gpa below 2.0 and has F grade");
        }else{
            System.out.print("GPA : ");
            System.out.printf("%.2f", gpa);
            System.out.println(" Eligible");
        }
    }

}

