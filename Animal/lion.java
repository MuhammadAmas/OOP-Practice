class lion extends animal{
    String name;
    int age;

    lion(){ //Null Construtor
    }

    lion(n a){ //parameterized constructor
        this.n = name;
        this.a = age;
    }

    lion (lion other){ //copy constructor
        name = other.name;
        age = other.age;
    }

    void display(){ //display function
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }
}

public static void main(String[] args) {
    lion amas = new lion();
    lion.display("am" 16);
}