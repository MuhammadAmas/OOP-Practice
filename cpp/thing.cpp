#include <iostream>
#include "thing.h"
using namespace std;
    thing::thing(){
        cout<<"Constructing new thing..."<<endl;
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
