//public class Demo{
//public static void main(String []args){
//Animal c= new Cat();
//c.sound();
//}
//}
//class Animal{
//void sound(){
//System.out.println("Animal Sound");
//}
//}
//class Cat extends Animal{
//@Override
//void sound(){
//System.out.println("meow!");
//}
//}

public class Demo {
public static void main(String[] args) {
Cat.sound();
}
}

class Animal {
static void sound() {
System.out.println("Animal Sound");
}
}

class Cat extends Animal {
static void sound() {
System.out.println("meow!");
}
}

