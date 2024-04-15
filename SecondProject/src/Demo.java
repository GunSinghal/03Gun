import java.util.Arrays;
import java.util.Scanner;
class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println(name + " " + age);
	}
	
}
class Dog {
	String name;
	String breed;
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	public void display() {
		System.out.println(name + " " + breed);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
public class Demo {

	public static void main(String[] args) {
		Person p1 = new Person("Gun", 19);
		Person p2 = new Person("Ria", 18);
		p1.display();
		p2.display();
		
		Dog d1 = new Dog("Bruno", "pug");
		Dog d2 = new Dog("Oscar", "poodle");
		
		d1.display();
		d2.display();
		
		d1.setName("Blue");
		d1.setBreed("Husky");
		d2.setName("Tommy");
		d2.setBreed("lebra");
		
		System.out.println("Modified values are : ");
		d1.display();
		d2.display();
		
		Scanner sc = new Scanner(System.in);
		
		int [][]arr = new int[3][];
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[5];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
		for(int i=0; i<3; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
