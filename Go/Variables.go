package main

import "fmt"

// how to get type of variable in go
// %T is ued to get type of variables im go.

func main() {

	var my_Name string = "waris shaik"
	var my_Number int = 7
	fmt.Println("The name is : ", my_Name)
	fmt.Println("The Number is : ", my_Number)
	fmt.Printf("The type of the variable is : %T \n", my_Name)   // %T is used to get to know which type it belongs to "STRING";
	fmt.Printf("The type of the variable is : %T \n", my_Number) // int
}
