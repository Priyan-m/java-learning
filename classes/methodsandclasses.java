package classes;

public class methodsandclasses {
	public class Main
	{
		public static void main(String[] args) {
			Person person1 = new Person("Priyan", 70); //Pass default values during object creation
			Person person2 = new Person("Madhvesh", 21);
			
			System.out.println(person1.nameOfPerson);
			
			person1.changeName("Mutta punda"); //Access class member function using object
			
			System.out.println(person1.nameOfPerson);
		}
	}
	public class Person {
	    
	    String nameOfPerson; //Class variable
	    int ageOfPerson;
	    
	    Person(String name, int age) { //Constructor
	        this.nameOfPerson = name; // using 'this' to assign class variables inside constructor
	        this.ageOfPerson = age;
	    }
	    
	    public void changeName(String newName) { //Member function
	        this.nameOfPerson = newName;
	    }
	}


}
