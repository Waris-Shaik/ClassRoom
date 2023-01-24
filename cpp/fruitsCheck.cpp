#include<iostream>
#include<string>

using namespace std;
int main(){
    
   
    
    while(true){
    string fruit;
    
    cout <<"Enter your Favourite Fruit: ";
    cin >> fruit;
    
    
    if(fruit == "apple"){
        cout << "Healthy fruit";
    }else if(fruit == "banana"){
        cout << "tasty fruit";
    }else if(fruit == "cherry"){
        cout << "Sweet fruit";
    }else if(fruit == "promogranate"){
        cout << "helathy and most lovable fruit";
    }else if(fruit == "kiwi"){
        cout << "protien fruit";
    }else {
        cout << "InValid Fruit";
    }
    
    cout << endl;
    char ct;
    cout << "Wanna Exit (y/n)?: ";
    cin >> ct;
    cout << endl;
    if(ct == 'y'){
        break;
    }
    
    }
   
    return 0;
}