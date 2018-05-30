//
class Dog{

	int age;
	String name;
	
	void eat(){
		System.out.println("Dog Eating........."  +name+ " " +age);
	}
}
class TestDog{

	public static void main(String args[]){
		
		Dog d1;//Referance of class
		d1 = new Dog();//Object of Dog
		d1.age = 10;
		d1.name = "Tommy";
		d1.eat();
		
		Dog d2= new Dog();
		d2.age = 5;
		d2.name = "Tonny";
		d2.eat();
		
		
		Dog d3=d2;//ref assign
		d3.eat();
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		
	
}

}