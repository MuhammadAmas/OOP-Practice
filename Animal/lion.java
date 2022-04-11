class lion extends animal{
    String name;
    int age;

    lion(){ //Null Construtor
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

    void display(){ //display function
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }

public static void main(String[] args) {
    lion amas = new lion();
    amas.display();
    
}
}