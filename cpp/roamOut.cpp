#include <iostream>
using namespace std;
int main(){
    
    int pocketMoney = 3000;
    
    for(int day = 1; day <= 30; day++){
        if(day%2 == 0){
            continue;
        }else{
            if(pocketMoney == 0){
                break;
            }
            cout << day << " Go to out okie" << endl;
            pocketMoney = pocketMoney - 300;
        }
    }
    
    cout << pocketMoney;
    
    
    return 0;
}