#include<iostream>
using namespace std;

int findUniqueElm(int arr[], int size){
    int ans = 0;
    for(int i=0; i<size; i++){
        ans = ans ^ arr[i];
    }
    return ans;
}

int main(){

    int arr[8] = {2,5,6,5,2,6,3};
    int uniqueElementIs = findUniqueElm(arr, 8);
    cout << uniqueElementIs << endl;
    
}