  
                                          //map function()   filter function()








/*map function logic
this is a programmer logic when some one tells to write logic of eg take an array and each element should be multiplied by 2 and those elements should be in newArray this is how exactly it works.*/

let array = [2,4,6,8,10];
let newArray = [];

for(let i=0; i<array.length; i++){

    let element = array[i]*2;
    newArray = newArray + element + " ";

    
}

console.log(newArray);



// in-built map function
/**
 * map() is a function which returns every element as you wanna like to do it goes upon each and every element that exist in an Array u can do multiple operations on that existing element u can do addition, multiplication.divison,etc...... here we added multiplication. with js normal function() in below of this method we did with arrow function....!
 */

let array1 = [2,4,6,8,10];
let newArray1 = array1.map(function(x){
        return x*2;
});

console.log(array1);
console.log(newArray1);


/**did u obderve how much code has been reduced here just with arrow function this is the beauty of Arrow function  " => " 
 */ 

let array2 = [2,4,6,5,10];
let newArray2 = array2.map(x=> x*2);
console.log(array2);
console.log(newArray2);


//filter function()
/*
as we konw filter function it is used to check if any condition is successfull then returns some thing in some thing if u see below example we gave one condition if an element in an existig array is capable of divisible by 2 then returns those elements in an new Array. below is the example.*/



let array3 = [2,3,4,5,6,7,8,9,10];
let newArray3 = array3.filter( x => x%2 == 0);
console.log(array3);
console.log(newArray3);



/**if u do check this condition with .map() u may not get output instead u will get output in  boolean values like trur or false */

/*this is the output of below code  */

/*
(6) [2, 4, 6, 8, 10, 11]
demo.js:68 (6) [true, true, true, true, true, false]
 */
                               /*  2     4     6     8      10   12*/
let array4 = [2,4,6,8,10,11];  // true, true, true, true, true, false
let newArray4 = array.map(x => x%2 == 0);
console.log(array);
console.log(newArray4);





let array5 = [2,3,4,5,6,7,8,9,10];
let newArray5 = array1.filter( x => x%2 == 0);
console.log(array1);
console.log(newArray5);



// as same as above code but it is briefable

let array6 = [2,4,6,11,8,10];
let newArray6 = array6.filter(function(x){


    if(x%2 == 0){
        return x;
    }
});
console.log(array6);
console.log(newArray6);


