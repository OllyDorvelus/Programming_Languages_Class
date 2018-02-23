//Olivier Dorvelus
package main

import (
	"bufio"
	"fmt"
    "os"
	"strings"
)

func main() {

	
	reader := bufio.NewReader(os.Stdin)
	fmt.Print("Enter a variable name, we will let you know if it's valid! ")
	variablename, _ := reader.ReadString('\n')
	variablename = strings.TrimRight(variablename, "\r\n")
	var isValid = false
	var isFirstLetterValid = false
	var valid_ascii = [63]byte{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
		95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122,
		48, 49, 50, 51, 52, 53, 54, 55, 56, 57}


	for index := range variablename {

		for ascii_index := range valid_ascii {

			if variablename[index] == valid_ascii[ascii_index] {
				//fmt.Println("valid")
				isValid = true
				break
			} else {
				isValid = false
			}
		}
		if !isValid {
			break
		}

	}

	for i := 0; i < 53; i++ {
		if variablename[0] == valid_ascii[i] {
			isFirstLetterValid = true
			break
		}
	}
	if (isFirstLetterValid && isValid) {
		fmt.Println(variablename + " is a valid variable name")
	} else {
		fmt.Println(variablename + " is not a valid variable name")
	}
}


