public class Student {
    String name;
    int age;
    int marks;

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
    }
    public static void main(String[] args){
        Student s1 = new Student();

        s1.name = "Divya";
        s1.age = 19;
        s1.marks = 95;

        s1.display();
    }
}