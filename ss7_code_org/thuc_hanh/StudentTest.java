package ss7;

public class StudentTest implements Comparable{
    private String name;
    private int age;
    private String address;

    public StudentTest(){
    }

    public StudentTest(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + '}';
    }
    public int compareTo(StudentTest studentTest){
        return this.getName().compareTo(studentTest.getName());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
