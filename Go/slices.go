package main

import (
	"fmt"
	"sort"
)

func main() { // this is main function where execution starts

	// Arrays

	// 2 types are there to be used in goLang

	var fruitsList [3]string
	/* string size is 3 as we have declared the length of fruitsList len is 3 we can only store 3 values in fruitsList array
	if we store values more than we assign the memory size it throws an error out of bound
	it starts with index "0" */

	fruitsList[0] = "Apple"
	fruitsList[1] = "Banana"
	fruitsList[2] = "Cherry"

	fmt.Println(fruitsList)

	// this is another type we can use

	var vegList = []string{"Beans", "Cucumber", "Potato", "Tomato"}
	fmt.Println(vegList)

	// append method is used to add values
	// whatever we store values with append method it stores values at the end of the array

	vegList = append(vegList, "Carrot")
	fmt.Println(vegList)

	// slices are more powerful in goLang
	var cars = []string{"Audi", "Bmw", "Chervolet", "Suzuki"}
	fmt.Println(cars)
	cars = append(cars[:3]) // it stores 0 to 2 which means it doesn't include exclusive range it stores -1 [:3means 0 to -3(2)]
	fmt.Println(cars)

	// another method we can use. this one stores ans saves memory
	// this is used with make() method

	superCars := make([]string, 5)
	superCars[0] = "Buggati"
	superCars[1] = "Ferrari"
	superCars[2] = "Urus"
	superCars[3] = "Lamborghini"
	superCars[4] = "Porsche"
	// superCars[5] = "McLaren" // we can't store this as its length is only capable of storing 5 values
	// but to over come this we can use .append() method and can store more values
	superCars = append(superCars, "McLaren", "Rolls-Royce", "Range Rover", "Defender", "May-Bach", "Benz")
	fmt.Println(superCars)

	sort.Strings(superCars) // default method which is used to make values in ascending order
	fmt.Println(superCars)

	fmt.Println(sort.StringsAreSorted(superCars))

}
