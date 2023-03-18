

// how to get type of variable in go.
// %T is ued to get type of variables im go.
// there are many other data types exist which are unit, uit8, uint16, uint32, unit64.
// float32 is upto 5numbers only after decimal point eg: 255.44154678964513 o/p: 255.44154.
// float64 is upto given range no limits.
// walrus Opertaor ":=" i used to create variables withOut using "var" keyword.
// u dont want to use "data type" before any variable when using walrus operator .
// important note about "walrus Operator" is u can'y use it before func main() method.
// with var keyword u can use it before func main()
// in java if u make variable r method "PUBLIC" u need to write "Public keyword" before it .
// in go it comes in to picture different u should start variable name of "first Letter with CAPTIAL LETTER".
// eg var my_Name it is not public variable.
// it should be var My_name here first letter is Caps Lock  it means it is "PUBLIC"
// what is the use of public ?
// a variable or method which is public can be used inside func main() function or outside func main() function.
// imp note : walrus is not allowed before func main() function starts.



package main

import "fmt"

const My_name = "waris shaik"; // public

func main() {

	var my_Name string = "waris shaik"
	var my_Number int = 7
	fmt.Println("The name is : ", my_Name)
	fmt.Println("The Number is : ", my_Number)
	fmt.Printf("The type of the variable is : %T \n", my_Name)   // %T is used to get to know which type it belongs to "STRING";
	fmt.Printf("The type of the variable is : %T \n", my_Number) // int
	fmt.Println(My_name); 
}
