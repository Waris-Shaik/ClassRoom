/*
Number
parseInt()
parseFloat()
isFinite()
isInteger()
toFixed()
toPrecision
*/

/*
let num = 63;


document.write(num + "<br>");
document.write(typeof num + "<hr>");



let num1 = "63"; //string
//let make it number as it is Number
//with the help of Number method we will do it lets see
let make_It = Number(num1); // converting string into Number;



document.write(num1 +"<br>");
document.write(typeof num1 + "<hr>");// string
document.write(make_It + "<br>");
document.write(typeof make_It + "<hr>");// number


*/

//parseInt()
/*it will return an Integer Number only even if it takes float values lets see */

let num = 63.45;
//first print it. it may print 63.45 
document.write(num +"<br>"); // 63.45 success op
document.write(typeof num); // number
/**above example may print as you give numbers  */
//but whatever i am going to give it wont print float values. lets see

document.write("<hr>");
let num1 = 63.45;
let cvt_It = parseInt(num1);
document.write(cvt_It); //expected op 63.45; but real output is 63
// .45 is ignored with the help of parseInt() method


//parseFloat 
// it works as same as parseInt() but parseFloat() prints decimal point values where as parseInt() won't. lets see

document.write("<hr>");
let num2 = "63.45 years";
let make_It = parseFloat(num2);

document.write(make_It + "<hr>"); // 63.45 


//isFinite()
//to check whether the given number from user is capable of to count or not lets see

// Infinity is always gives us false

let Num = 56; // Num = Infinity then op will be false;
let check_It = Number.isFinite(Num);
document.write(check_It + "<hr>"); // 45 can be counted Number

//isInteger
/**to check that given user number is an Integer or not */

let num3 = 63; // if "63"(String) then op will be false
let check_IT  =  Number.isInteger(num3);
document.write(check_IT); //true

let a = 63.45; //false coz it is not an Integer it's a float Number
let b = Number.isInteger(a);
document.write("<hr>" + b + "<hr>"); //false


//toFixed(param)
/*
is used to fixed the points of digits after .
eg: 63.45689;
i need 63.45; only 2digits after point then toFixed() method comes into picture.
it gives us rounded number

*/
let num4 = 15.56785;
let make = num4.toFixed(4);
document.write(make + "<hr>") 

let num5 = 63.35698;
let ok = num5.toPrecision(3);
document.write(ok);