public class Person{
private String name;
private int age;
public Person(String name,int age){
this.name=name;
this.age=age;
}
public Person(Person p){
this.name=name;
this.age=age;
}
public void Display(){
System.out.println("Person name:"+name);
System.out.println("Person age:"+age);
}
public static void main(String []args){
Person p1=new Person("Arun",22);
Person p2=new Person(p1);
p1.Display();
p2.Display();
}
}
