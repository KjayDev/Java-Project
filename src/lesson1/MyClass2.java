package lesson1;

public class MyClass2 {

	public static void main(String[] args) {
		Student mark = new Student(); // mark here is called object or instance
		mark.setId(1); 
		mark.setName("Mark");
		mark.setAge(15); 
		
		
		Student tom = new Student(); // Tom here is called object or instance
		tom.setId(2);
		tom.setName("Tom");
		tom.setAge(14);
		System.out.println(mark.getName() + " is " + mark.getAge()+ " years old");
		System.out.println(tom.getName() + " is " + tom.getAge() + " years old");
		

	}

}
