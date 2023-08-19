#include <iostream>
using namespace std;

void reverseArray(int arr[], int start, int end){
    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

void rotateArray(int arr[], int d, int n){
    reverseArray(arr,0, d-1);
    reverseArray(arr, d, n-1);
    reverseArray(arr, 0, n-1);
}

int main(){

int arr[5] = {1,2,3,4,5};
int d = 2;
int n = 5;
    rotateArray(arr,d,n);
    for(int i=0; i<n; i++){
        cout << arr[i] << " ";
    }

}