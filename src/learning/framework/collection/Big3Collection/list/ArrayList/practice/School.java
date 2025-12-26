package learning.framework.collection.Big3Collection.list.ArrayList.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class School {
    private String name ;
    private ArrayList<Student> students = new ArrayList<>();


    public void registerStudent(Student student){
        students.add(student);
    }


    public void deleteStudent(Integer studentId){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if (student.getId() == studentId){
                iterator.remove();
            }
        }
    }


    public void sortByName(){
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        students.sort(comparator);
    }


    public Student findByName(String name){
        for (Student student : students){
            if (student.getName().equals(name)){
                return student ;
            }
        }
        return null ;
    }


    public void updateStudent(int studentId , Student newStudent){
        for (Student student : students){
            if (student.getId() == studentId){
                student.setId(studentId);
                student.setGender(newStudent.getGender());
                student.setName(newStudent.getName());
            }
        }
    }


    public void displayStudents(){
        for(Student student : students){
            System.out.println("ID : " + student.getId());
            System.out.println("Name : " + student.getName());
            System.out.println("Gender : " + student.getGender());
            System.out.println("----------------------------------");
        }
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Student> getStudents() {
        return students;
    }


    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
