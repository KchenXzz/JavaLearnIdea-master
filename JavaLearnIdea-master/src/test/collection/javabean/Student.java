package test.collection.javabean;

import java.util.Objects;

/**
 * @projectName: JavaLearnIdea
 * @package: test.collection.javabean
 * @className: Student
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-10 上午 11:22
 * @version: 1.0
 */
public class Student implements Comparable<Student> {

    private String name;

    private int age;

    private int chScore;


    private int mathScore;

    private int engScore;


    private boolean gender;

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getSum() {
        return chScore + mathScore + engScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChScore() {
        return chScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && chScore == student.chScore && mathScore == student.mathScore && engScore == student.engScore && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, chScore, mathScore, engScore);
    }

    @Override
    public String toString() {
        return this.getName()
                + " " + this.getAge()
                + " " + this.getChScore()
                + " " + this.getMathScore()
                + " " + this.getEngScore()
                + " " + this.getSum()
                ;
    }


    public void setChScore(int chScore) {
        this.chScore = chScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public Student(String name, int age, int chScore, int mathScore, int engScore,boolean gender) {
        this.name = name;
        this.age = age;
        this.chScore = chScore;
        this.mathScore = mathScore;
        this.engScore = engScore;
        this.gender=gender;
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
