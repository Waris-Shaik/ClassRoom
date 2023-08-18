#include<iostream>
#include<climits>
using namespace std;
int getMax(int arr[], int size){
    int maxi = INT_MIN;
    for(int i=0; i<size; i++){
        maxi = max(maxi, arr[i]);
    }
    // returning maxi
    return maxi;
}
int getMin(int arr[], int size){
    int mini = INT_MAX;
    for(int i=0; i<size; i++){
        mini = min(mini, arr[i]);
    }
    // returning mini
    return mini;
}
int sum(int arr[], int size){
    int sum = 0;
    for(int i=0; i<size; i++){
        sum += arr[i];
    }
    // returning sum
    return sum;
}
int power(int value, int byPower){
    int power = 1;
    for(int i=0; i<byPower; i++){
        power = power * value;
    }
    return power;
}
int linearSearch(int arr[], int size, int target){
    for(int i=0; i<size; i++){
        if(arr[i] == target){
            return i; // return index only condtion is met else return -1
        }
    }
    return -1;
}

void reverseArray(int arr[], int size){
    // arr[] = {2,3,4,5,9,10}; 
    for(int i=0; i<size/2; i++){
        // swapping
        int temp = arr[i];
        arr[i] = arr[size - i - 1];
        arr[size - i - 1] = temp;
    }
    // printing
    for(int i=0; i<size; i++){  
        cout << arr[i] << " ";    
    }
}
void alterNativeReverse(int arr[], int size){
    // arr[] = {2,3,4,5,9,10}; 
   
   for(int i=0; i<size; i+=2){
    // swapping
       int temp = arr[i];
       arr[i] = arr[i+1];
       arr[i+1] = temp;
   } 
   
   // printing
    for(int i=0; i<size; i++){  
        cout << arr[i] << " ";    
    }
}
int main(){
    
    
    // int size;
    // cout << "Enter size of array : " ;
    // cout << endl;
    // cin >> size;
    // int arr[100];
    // for(int i=0; i<size; i++){
    //     cin >> arr[i];
    // }
    // cout << "MAX value is : " << getMax(arr, size) << endl;
    // cout << "MIN value is : " << getMin(arr, size) << endl; 
    // cout << "SUM is : " << sum(arr, size) << endl;
    // cout << "POWER value is : "<< power(2,3) << endl;
    // int array[10] = {15,7,-2,10,22,-2,0,5,22,1};
    // cout << linearSearch(array, 10, 5);
    // int arr[12] = {2,3,4,5,9,10}; 
    // reverseArray(arr,6);
    int arr[12] = {2,3,4,5,9,10,12,7}; 
    alterNativeReverse(arr,8);
    
    
    
    return 0;
}