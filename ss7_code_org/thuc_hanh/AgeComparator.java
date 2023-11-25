package ss7;

import java.util.*;

public class AgeComparator implements Comparator<StudentTest> {
    @Override
    public int compare(StudentTest o1, StudentTest o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
        StudentTest student = new StudentTest("Kien", 30, "HT");
        StudentTest student01 = new StudentTest("Nam", 26, "HN");
        StudentTest student02 = new StudentTest("Anh", 38, "HT");
        StudentTest student03 = new StudentTest("Tung", 38, "HT");

        List<StudentTest> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student01);
        lists.add(student02);
        lists.add(student03);
        Collections.sort(lists);
        for(StudentTest st : lists){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println(" So sánh theo tuổi: ");
        for (StudentTest st : lists){
            System.out.println(st.toString());
        }
    }
}
