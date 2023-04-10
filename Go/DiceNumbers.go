package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {

	rand.Seed(time.Now().UnixNano())
	diceNumber := rand.Intn(6) + 1
	fmt.Println("value of dice is :", diceNumber)

	switch diceNumber {
	case 1:
		fmt.Println("you can open up and play game")
	case 2:
		fmt.Println("you can move to spot 2")
	case 3:
		fmt.Println("you can move to spot 3")
		fallthrough
	case 4:
		fmt.Println("you can move to spot 4")
		fallthrough
	case 5:
		fmt.Println("you can move to spot 5")
		fallthrough
	case 6:
		fmt.Println("you can move to spot 6")
	default:
		fmt.Println("InValid Number")
	}

}
