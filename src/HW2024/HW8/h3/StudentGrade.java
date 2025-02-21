package HW2024.HW8.h3;

public class StudentGrade {
    String name;
    Integer[] grades;

    public void enterGrade(int sessionNumber, int grade){
        grades[sessionNumber-1] = grade;
    }

    public Integer getGrade(int sessionNumber){
       return grades[sessionNumber -1];
    }
}
