package main

import "fmt"

func main() {

	// days := []string{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}
	fmt.Println(days) // default one to print loops

	// printing slice using default for loop

	for i := 0; i < len(days); i++ {
		fmt.Println(days[i])
	}

	// one more way to use for loop is using range pre reserved keyword

	for i := range days {
		fmt.Println(i)       // it gives index numbers
		fmt.Println(days[i]) // it prints actual value
	}

	// another way to use for loop is

	for index, value := range days { // here index starts from "0" value iterates from at th index 0 like days[0] which is "Sunday"
		fmt.Printf("index is %v and value is %v \n", index, value)
	}

	// last one complete similar to while loop but while loop does not exist in go lang

	value := 0

	for value < 10 {
		fmt.Println(value) // it prints  0 to  9
		value++            // it increments
	}

	index := 0

	for index < len(days) {
		fmt.Println(days[index])
		index++
	}

	// break  keyword

	value := 0
	for value < 10 {
		if value == 5 { // when condition met it stops the loop
			break // it literally comes out of the loop
		}

		fmt.Println(value)
		value++
	}

	value := 0

	for value < 10 {

		if value == 5 {
			value++ // if we dont put value++ operator here it goes infinite it is  not like that how continue works in other p langs. it is far diff in go lang case.
			continue
		}
		fmt.Println(value)
		value++
	}

	value := 0

	for value < 10 {
		if value == 5 {
			goto msg // when condition met it goto msg and print it and stops the loop immediatley
		}
		fmt.Println(value)
		value++

	}

msg:
	fmt.Println("hey dear congratulations")
}
