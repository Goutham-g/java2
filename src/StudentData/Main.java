package StudentData;

public class Main {
    public static void main(String[] args) {


        Student std=new Student(5);
        std.addMarks(35.6);
        std.addMarks(32.9);
        std.addMarks(35.7);
        std.addMarks(33.5);
        std.gradeAvg();
    }
}
