#include <iostream>
class thing {
    thing::thing(){
        cout<<"Constructing new thing..."<<endl;>>
    }

    thing :: thing(int value){
        cout<<"Constructing new thing with value "<<value<<endl;
    }

    void thing :: set(int value){
        x = value;
    }


    int thing :: get(){
        return x;
    }

    thing :: ~thing(){
        cout<<"Destructing thing..."<<*x<<endl;
    }

    void do2(int value){
        cout<<"Enter do2 with level="<<level<<endl;
    }

    void do1(int value){
        cout<<"Enter do1 with level="<<level<<endl;
        thing TTT(level);
        do2(level+1);
    }
}
