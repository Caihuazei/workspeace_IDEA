package Practice0720;

public class Person {
    String name;
    int age;
    public void Person(int a, String b){
        age = a;
        name = b;
    }
    void display (){
        System.out.println(age+ name);
    }
}
