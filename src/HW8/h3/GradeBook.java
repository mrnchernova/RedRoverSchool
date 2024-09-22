package HW8.h3;

public class GradeBook {
    StudentGrade[] studentGrades;

    /* 1 var
      public void enterGrade(String studentName, int sessionNumber, int grade){
          for (StudentGrade studentGrade : studentGrades){
              if (studentGrade.name.equals(studentName)){
  //                studentGrade.grades[sessionNumber -1] = grade;
                  studentGrade.enterGrade(sessionNumber,grade);
                  return;
              }
          }
          System.out.println("Can't find student with name: " + studentName);
      }

     */
    /* 2 var */
    public void enterGrade(String studentName, int sessionNumber, int grade) {
        StudentGrade studentGrade = findStudentByName(studentName);
        if (studentGrade == null) {
            System.out.println("Can't find student with name: " + studentName);
            return;
        }
        studentGrade.enterGrade(sessionNumber, grade);
    }


    /**
     * dfddff
     */
    StudentGrade findStudentByName(String studentName) {
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.name.equals(studentName)) {
                return studentGrade;
            }
        }
        return null;
    }


    public void printGrades(int sessionNumber) {
        for (StudentGrade studentGrade : studentGrades) {
            Integer grade = studentGrade.getGrade(sessionNumber);
            if (grade != null) {
                System.out.println(studentGrade.name + ": " + grade);
            }
        }
    }

    public void printAllGrades() {
        for (StudentGrade studentGrade : studentGrades) {
            System.out.println(studentGrade.name + ": ");
            for (Integer grade : studentGrade.grades) {
                if (grade == null) {
                    System.out.println("  ");
                } else {
                    System.out.println(" " + grade);
                }
            }
            System.out.println();
        }

    }

    public double avgGrades(String studentName) {
        StudentGrade studentGrade = findStudentByName(studentName);
        if (studentGrade == null) {
            System.out.println("Can't find student with name: " + studentName);
            return -1;
        }

        int numberOfGrades = 0;
        double gradeSum = 0;
        for (Integer grade : studentGrade.grades) {
            if (grade != null) {
                numberOfGrades++;
                gradeSum += grade;
            }
        }
        return gradeSum / numberOfGrades;
    }
}




