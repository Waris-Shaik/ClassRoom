#include<iostream>
#include<math.h>

using namespace std;

int main(){
    cout << "Enter a number :";
    int n;
    cin >> n;

    int ans = 0;
    int i = 0;

    while( n != 0){
        int bit = n & 1;
        ans = (bit * pow(10,i)) + ans;
        n = n >> 1;
        i++;
    }

    cout << "The ans is : "<< ans << endl;

    return 0;
}