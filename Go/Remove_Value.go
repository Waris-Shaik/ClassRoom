package main

import "fmt"

func main() {

	var courses = []string{"Swift", "Html", "Css", "JavaScript", "ReactJs", "VennilaJs", "FireBase"}
	fmt.Println(courses)
	var index int = 0 // swift will b removed
	courses = append(courses[:index], courses[index+1:]...)
	fmt.Println(courses)

	/*	var courses = []string{"Swift", "Html", "Css", "JavaScript", "ReactJs", "VennilaJs", "FireBase"}
		fmt.Println(courses)
		var index int = 2 // Css will be removed
		courses = append(courses[:index], courses[index+1:]...)
		fmt.Println(courses)
	*/

}
