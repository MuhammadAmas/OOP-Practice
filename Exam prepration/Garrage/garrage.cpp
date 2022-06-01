#include <string.h>
class car{
    private:
    char color[10];
    public:
    car(char* color_in);
    char* get_color();
};
car::car(char* color_in){
    strncpy(color,color_in,9);
    color[9]='\0';
}
char* car::get_color(){
    return color;
}
int main(){
    car* garage = NULL;

    int menu_choice = 0;
    char temp_color[10];

    while (menu_choice!=3){
        cout<<"Enter 1 to put car in garrage, 2 to remove it and 3 to quit";
        cin>>menu_choice;

        if(menu_choice==)
    }
}