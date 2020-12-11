public class Student implements Comparable <Student>{
    private String name;
    private int age;
    private String andress;

    public Student(String name, int age, String andress) {
        this.name = name;
        this.age = age;
        this.andress = andress;
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

    public String getAndress() {
        return andress;
    }

    public void setAndress(String andress) {
        this.andress = andress;
    }

    @Override
    public String toString() {
        return "Student:" +
                "name=" + name;
    }
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
