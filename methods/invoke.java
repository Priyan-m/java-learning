package methods;
import java.util.Scanner;

public class invoke
{
	public static void main(String[] args) {
		Student student1 = new Student("Priyan", 1, new int[] {20, 20, 20});
		Student student2 = new Student("Madhvesh", 2, new int[] {90, 90, 90});
		Student student3 = new Student("marukunja",7,new int[] {0,0,0});
		student3.setname("sanjkunju");
		System.out.println(student1.getname()+" " + student1.getrollno()+" " + student1.getTotalMarks());
		System.out.println(student2.getname()+"  "+student2.getrollno()+" "+ student2.getTotalMarks());
		System.out.println(student3.getname()+" "+student3.getrollno()+" "+student3.getTotalMarks());
	}
}

//Student.Java
class Student {
    private String name;
    private int rollNo;
    private int[] marks;
    Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public int getTotalMarks() {
        int total = 0;
        for(int mark: marks) {
            total += mark;
        }
        return total;
    }
    public void setname(String newname) {//setter function
    	this.name=newname;
    	
    }
    public int getrollno() { // getter function
    	return this.rollNo;
    }
    public String getname() {
    	return this.name;
    	}
    }



