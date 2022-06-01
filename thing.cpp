#include <iostream>
#include <string>
using namespace std;

class thing{
    private:
    int *x;

    public:
    thing();
    thing(int val);
    void set(int val);
    int get();
    ~thing();
};


thing::thing(){
    cout<<"Constructing new thing using default constructor"<<endl;
    this->x = new int(0);
    // *x=0;
}

void thing::set(int val){
    *x=val;
}
int thing::get(){
    return *x;
}
thing ::thing(int val){
    cout<<"Constructing new thing with value ="<<val<< endl;
    this->x = new int();
    *x=val;
}
thing::~thing(){
    cout<<"Destructing thing"<<endl;
    delete x;
}


void Do2(int level){
    cout<<"Enter Do2 with level= "<<level<<endl;
    thing TT(level);
}
void Do1(int level){
    cout<<"Enter Do1 with level= "<<level<<endl;
    thing TTT(level);
    Do2(level+1);

}

int main(){
    thing T(1); cout<<endl;
    Do2(2); cout<<endl;
    Do1(3); cout<<endl;
    Do2(5); cout<<endl;
}



