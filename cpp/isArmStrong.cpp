#include <iostream>
using namespace std;

bool isArmStrong(int num){
    int originalNum = num;
    int sum = 0;
    while(num > 0){
        int rem = num % 10;
        int cube = rem * rem * rem;
        sum = sum + cube;
        num = num / 10;
    }
    
    if(originalNum == sum){
        return true;
    }
    
    return false;
}


int main(){
    
    for(int i=100; i<999; i++){
        if(isArmStrong(i)){
            cout << i << " ";
        }
    }
    
    
    return 0;
}