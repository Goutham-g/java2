package StudentData;
//method to add marks and calculate the average grade
public class Student {
    private double[] grades;
    private int gradeCount;


    public Student(int maxGrades) {
        grades = new double[maxGrades];
        gradeCount = 0;
    }

    //method to add marks to array
    public void addMarks(double grade) {
        if (gradeCount < grades.length) {
            grades[gradeCount] = grade;
            gradeCount++;

        } else {
            System.out.println("Array is full");
        }
    }
    public void gradeAvg(){
        double total=0;
        for (int i =0;i<gradeCount;i++){
            total+=grades[i];

        }
        if(gradeCount> 0){
            double avg=total/gradeCount;
            System.out.print("Average:"+avg);
        }
        else {
            System.out.println("0");
        }


    }
    public void displayMarks(){

    }




}
