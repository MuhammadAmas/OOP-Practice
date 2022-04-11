class lion extends animal{
    String name;
    int age;

    lion(){ //Null Construtor
    }

    lion(String name, String n, int a){ //parameterized constructor
        super (name, n , a);
        this.n = name;
        this.a = age;
    }

    lion (lion other){ //copy constructor
        super(other);
        name = other.name;
        age = other.age;
    }

    void display(){ //display function
        super.display();
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }

    
}

public static void main(String[] args) {
    lion amas = new lion();
    
}