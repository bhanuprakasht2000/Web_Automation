package POJO_pkg;

public class Pojo_Example {
public static void main(String[] args) {
	Pojo p=new Pojo("A",1,20);
	System.out.println("Age is "+p.getAge());
	p.setAge(30);
	System.out.println("Modified age is "+p.getAge());
}
}
