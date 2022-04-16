#include <iostream>
using namespace std;
class thing1 {
    public:
    int *x;
    thing();
    thing(int value);
    void set(int value);
    int get();
    ~thing();
}