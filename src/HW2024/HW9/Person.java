package HW2024.HW9;

public class Person {
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        if (sex == 'M') {
            return "Mr. " + name;
        } else if (sex == 'F') {
            return "Mrs. " + name;
        } else {
            return name;
        }
    }


    public String getOnlyName(){
        return name;
    }


}
