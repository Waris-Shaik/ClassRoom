// Spread and Rest Operator
// open console and see output
// ctrl + shift + i to open console


//...spread

// in Arrays eg:

let num = 5;
let carsList = ["audi", "bmw", "urus"];
let newCarsList = [];


if(num === 5){
    console.log("correct bro");
    newCarsList = [...carsList];
    console.log(newCarsList);
}else{
    console.log("not correct bro");
}

// in Objects eg:

let data = {
    firstName : "waris",
    lastName : "shaik",
    age : 22,
    gender : "male",
    
}

let myData = {
    ...data
}

console.log(myData.firstName);
console.log(myData.lastName);



//...rest operator
// it is as same as variabe length arguments in java



function vlArguments(...v){
    console.log(v);
    console.log(...v);
}

vlArguments(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);