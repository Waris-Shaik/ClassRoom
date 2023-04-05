package main

import "fmt"

func main() {

	// how many times a number occured?

	var Number int = 4565 // 5 occured 2
	var changeIt string = string(rune(Number))
	var count int = 0

	for i := 0; i < len(changeIt); i++ {

		var rem int = Number % 10
		Number = Number / 10
		if rem == 5 {
			count++
		}

	}

	fmt.Println(count)

}
