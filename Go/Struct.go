package main

import "fmt"

func main() {

	waris_data := User{"waris shaik", "waris.shaik07@gmail.com", "single", 22, "andhra pradesh"}
	fmt.Println(waris_data)

	// if u need data to be printed in key value pairs like objects in javaScript we can use %+v

	fmt.Printf("Details are : %+v ", waris_data) // these are the eg of key value pairs %+v is used to get key value
	fmt.Printf("details are : %v", waris_data)   // %v can be used just to print values not keys
	// for suppose u want to print specific values we can use (%v variable Name.value) like objects in js.
	fmt.Println()
	fmt.Printf("Name is %v, Email is %v", waris_data.Name, waris_data.Email)
	// we can also use .
	fmt.Println()
	fmt.Println(waris_data.State)
	fmt.Println(waris_data.Email)

}

type User struct {
	Name           string
	Email          string
	Married_Status string
	Age            int
	State          string
}
