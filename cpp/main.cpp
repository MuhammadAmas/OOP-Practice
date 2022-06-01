#include <iostream>
#include "thing.h"
using namespace std;


    void do2(int value){
        cout<<"Enter do2 with level="<<level<<endl;
        thing TT(level);
    }

    void do1(int value){
        cout<<"Enter do1 with level="<<level<<endl;
        thing TTT(level);
        do2(level+1);
    }

int main(){
    thing T(1);
    cout<<endl;

    do2(2);
    cout<<endl;

    do1(3);
    cout<<endl;

    do2(5);
    cout<<endl;

    return 0;
};