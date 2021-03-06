class lion extends animal{
    String name;
    int age;

    lion(){ //Null Construtor
        name = "lion";
        age = 14;
    }

    lion(String name, int age){ //parameterized constructor
        super (name); //Accessing the base class attributes
        // this.name = name;
        this.age = age;
    }

    lion (lion other){ //copy constructor
        super(other);
        // name = other.name;
        age = other.age;
    }

    void getname(){ //Show Function
        System.out.println(name);
    }
    
    void display(){ //overriden display function
        System.out.println("Name :" + super.name); //for printig super/Base class value
        System.out.println("Name :" + name);  //for printig Child class value
        System.out.println("Age :" + age);
    }

public static void main(String[] args) {
    lion amas = new lion();
    amas.display();

    animal me = new animal();
    me.display();
    
}
}