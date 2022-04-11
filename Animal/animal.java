public class animal {
    String name;

    animal(){
    }

    animal(String name){ //parameterized
        this.name = name;
    }

    animal(animal other){ //copy
        name = other.name;
    }
     
    public void show (){
        System.out.println("name" + name);
    }
}
