//Math Functions
//.ceil()
//.floor()
//.round()
//.trunc()
//.max()
//.min()
//.sqrt()
//.cbrt()
//.pow()
//.random()
//.abs()
//.PI





//.ceil()
/*it always gives upward value
when it is positive integer value
for eg if it is 5.6 result will be 6
if it is -5.6 it will be -5 */

let num = Math.ceil(5.6);
document.write(num);


//.floor()
/*
it always gives us downward value 
for eg if it is 5.6 the reult will be 5 decreasing 
if it is -5.6 the it will be -6
 */

let num1 = Math.floor(-5.6);
document.write(num1);


//.round()
/*
here is something different in Math .round function
whenever after . <= 49 it gives downward number
 if it is >=50 it gives upward number following is the example*/
 
let num2 = Math.round(5.60);
document.write(num2);



//.trunc()
/* it returns only an 1st Integer Value
if competley ignores after decimal point
it is as same as parseInt() function
that also does same. following is the eg:
 */

let num3 = Math.trunc(12.45);
document.write(num3);


//.max()
/*
as name suggests it returns maximun number
*/

let num4 = Math.max(4,85,96,7,2,96,77,12);
document.write(num4); //96


//.min()
/*
it is also same as max() but it gives min() number 
*/

let num5 = Math.min(4,8,9,66,4,52,38,1); // if -1 is in..
document.write(num5); // 1 // -1


//.sqrt()
/*
it returns sqrt number */

let num6 = Math.sqrt(49); // 7*7 = 49;
document.write(num6); // 7 


//.cbrt()
/*
it is as same as .sqrt() 
125 sqrt is 11.1...
125 cbrt is 5 coz 5*5*5 = 125 */

let num7 = Math.cbrt(125); // 5*5*5 = 125
document.write(num7); // 5

//.pow()
/* */

let num8 = Math.pow(5,2);
document.write(num8); // 25

//.random()

let num9 = Math.floor((Math.random() * 10) + 1);
document.write(num9);

//.abs()
/*
abs stands for absolute value 
it gives positive integer even if it is 
negative integer */


let num10 = Math.abs(-45);
document.write(num10);  // 45


//.PI;
//constant value 3.1415....

let num11 = Math.PI;
document.write(num11); // 3.141592653589793