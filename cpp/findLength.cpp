#include <iostream>
using namespace std;
int main(){
    int num = 456789;
    int count = 0;
    while(num > 0){
        num /= 10;
        count++;
    }
    cout << "The Length of number is: " << count;
    return 0;
}