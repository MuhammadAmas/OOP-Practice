public class animal {
    int age;
    String name;

    animal(){
    }

    animal(int age,String name){ //parameterized
        this.age = age;
        this.name = name;
    }

    animal(animal other){ //copy
        age = other.age;
        name = other.name;
    }
     
    public void show (){
        System.out.println("age :"+age+"\n"+"name :"+name);
    }
}
