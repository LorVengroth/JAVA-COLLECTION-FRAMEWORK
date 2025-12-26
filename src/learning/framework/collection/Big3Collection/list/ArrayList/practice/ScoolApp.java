package learning.framework.collection.Big3Collection.list.ArrayList.practice;

public class ScoolApp {
    public static void main(String[] args) {
        School school = new School() ;
        school.setName("ISTAD");

        // Object creation
        Student stu1 = new Student(1 , "Lor Vengroth" , Gender.M);
        Student stu2 = new Student(2 , "Chen yonglun" , Gender.M);
        Student stu3 = new Student(3 , "So Yichen" , Gender.F);


        // Registeration
        school.registerStudent(stu1);
        school.registerStudent(stu2);
        school.registerStudent(stu3);

        // student display before removal
        school.displayStudents();

        System.out.println("================================");

        // sort students by name
        System.out.println("Sort By name");
        school.sortByName();
        school.displayStudents();

        System.out.println("================================");

        // Search student by name
        System.out.println("Search student found !");
        System.out.println(school.findByName("Lor Vengroth"));
        System.out.println("----------------------------------");


        System.out.println("================================");


        // update student by id
        System.out.println("Update student successfully !");
        Student newStu = new Student( "New Student" , Gender.F);
        school.updateStudent(1 , newStu);
        school.displayStudents();


        System.out.println("================================");


        // student display after removal
        System.out.println("Student after removal");
        school.deleteStudent(1);
        school.displayStudents();

    }
}
