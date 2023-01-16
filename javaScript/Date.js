//Date()
//now.toDateString()
//now.getDate()
//now.getDay()
//now.getMonth()
//now.getFullYear()
//now.toLocaleDateString()




//.toDateString()
/*
this method is clear method to see date 
where Date() shows the some unnecessary things 
.toDateString() gives crystal clear like
day mon date year .
to see date we need to import Date() package
*/


let now = new Date();



document.write(now); //Thu Dec 29 2022 00:18:20 GMT+0530 (India Standard Time)

document.write(now.toDateString()); // Thu Dec 29 2022

//.getDate()
/**
 it returns todays date 
 */

 document.write("<h2>" + now.getDate() + "<hr>"); // 29

 ///getDay()

 /*
it returns todays day if it is
monday then 1 if tues 2, wed 3 thurs 4.. */

document.write("<h2>"+now.getDay() + "<hr>"); // 4 as thursday
