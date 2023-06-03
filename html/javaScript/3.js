// Array Destructuring


let CarsArray = ["audi", "bmw", "ferrari", "urus"];

// if we need an audi which is an element in an CarsArray in fact we do console.log(ArrayNameofElementIndexNo) eg: CarsArray[0]// audi
//this is where an Array Destructuring comes into the picture

let CarsArray1 = ["audi","bmw","urus","ferrari"];
let [car1, car2, car3, car4] = CarsArray1;

console.log(car1);


// Object destructuring


const myData = {
    firstName : "waris",
    lastName : "shaik",
    age : 22,
    gender : "male",
    emailID : "waris.shaik07@gmail.com",
    occupation : "student",
    destination : "SDE-1 @G_L",
    state : "andhra pradesh",
    country : "INIDA"

}

// old way to print elements of OBject
console.log(myData.firstName);
console.log(myData.lastName);
console.log(myData.age);
console.log(myData.gender);


//new way to print the elements of OBject 
// this is called an OBject Detsructing.

let {firstName, lastName, age, gender, emailID, occupation, destination, state, country} = myData;

console.log(firstName);
console.log(lastName);
console.log(age);
console.log(gender);
console.log(emailID);
console.log(occupation);
console.log(destination);
console.log(state);
console.log(country);