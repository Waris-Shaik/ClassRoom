// Strings indexing 

// w a r i s
// 0 1 2 3 4

let firstName = "waris";
console.log(firstName[0]); // w
console.log(firstName[3]); // i

// to find out the length of the firstName 
// we use .length function 

console.log(firstName.length);
// with help of for loop

for(let i=0; i<firstName.length; i++){
    console.log(firstName[i]);
}

// to find out the last index of firstName we use

console.log(firstName[firstName.length -1]);
console.log(firstName[firstName.length -2]);


// all about .trim() method it helps to remove white spaces below is eg:

let Name = "waris shaik";
console.log(Name);  // waris shaik 
// even Name length is 10 it includes white spaces 
console.log(Name.length); // 11 
// this is where trim comes into picture
// as all knows it removes white spaces 

let Naame = "     waris shaik";
console.log(Naame);
console.log(Naame.length); // 16 including spaces

console.log(Naame.trim());
let getLen = Naame.trim();
// it removes white spaces and gives output which is 11.
console.log(getLen.length); // 11 

// toUpperCase()
console.log(firstName.toUpperCase());
// toLowerCase()
let Naam = "WARIS SHAIK";
console.log(Naam); // WARIS SHAIK

let changeIt = Naam.toLowerCase();
console.log(changeIt); // waris shaik


// .slice()
// it cuts as we wanna to and returns it as a new String 
// (0,4) starting index to end index-1; 
// for eg: 0-4 it cuts 0-3 only n-1 ((0-4), (4-1 = 3)0, 3);
let myName  = "waris shaik";
let getIt = myName.slice(0,4); // wari
console.log(getIt);
console.log(myName.slice(0,5)); // waris

// if u given only one parameter in slice method it starts cutting from that number only.
// it returns from that only lets see eg

let mName = "waris shaik";
console.log(mName.slice(0,5)); // this returns waris as i did cut from 0-5
console.log(mName.slice(1)); // this returns aris shaik as parameter is passed from 1 0th index skips and starts from 1th index to nth index.