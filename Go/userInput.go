package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {

	reader := bufio.NewReader(os.Stdin)
	fmt.Print("Enter your Name : ")
	ans, _ := reader.ReadString('\n')
	fmt.Print("The name is : ", ans)
	fmt.Printf("The type of variable is : %T \n", ans)
}
