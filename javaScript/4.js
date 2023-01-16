// refeernces types


//eg: 


let myData =  {

    name : "waris shaik"
}


//here we are not copying just directing the point towards main object

let target = myData;
target.name = "shaik.ig"; //by pointing towards main we are able to cahnge main one.
                         //  like more than one referenece variable can change the main object so that will be availabale to all .


console.log(myData);
console.log(target);




// copying.....

let myData1 = {
    name : "Waris shaik" // object has baeen created
}

// let copy it

/*after copying it we are goung to change values which is available in copy elements not in original one  */


let cp = {
    ...myData1
}


cp.name = "shaik.ig";
console.log(myData1);
console.log(cp);