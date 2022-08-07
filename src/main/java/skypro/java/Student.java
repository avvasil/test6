package skypro.java;

//Напишите методы Equals and HashCode для класса Student, который состоит из полей String name и int age.

public class Student {

    private String name;
    private int age;

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

    @Override
    public int hashCode() {
        return age * name.hashCode();
    }

    @Override
    public boolean equals(Object s) {
        if (this == s) return true;
        if (s == null || getClass() != s.getClass()) return false;
        Student student = (Student) s;
        return age == student.age && name.equals(student.name);

    }
}
