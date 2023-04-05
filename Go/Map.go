package main

import "fmt"

func main() {

	// Maps look like key value pairs

	languages := make(map[string]string)
	languages["js"] = "JavaScript"
	languages["ts"] = "TypeScript"
	languages["rb"] = "Ruby"
	languages["py"] = "Python"
	languages["cpp"] = "C++"

	fmt.Println("List of all Languages : ", languages)
	fmt.Println("js shorts for : ", languages["js"])
	fmt.Println("ts shorts for : ", languages["ts"])

	// whenever want to delete any map a spl keywrod "delete" can be used

	delete(languages, "rb") // ruby will be deleted
	fmt.Println(languages)  // successfully deleted

	// len method is used to know the length of the Map

	getLength := len(languages)
	fmt.Println(getLength) // 4

	// using for loop  to print the values

	for key, value := range languages {
		fmt.Printf("For Key %v, value is %v\n", key, value)
	}

}
