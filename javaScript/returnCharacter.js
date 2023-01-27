


const Name = prompt("Enter your Name: ");
const ans = firstCharcater(Name);
alert("your name is: "+ Name +"\n" +"The 1st charcter of your name is: " + ans);

const ans1 = lastCharcter(Name);
alert("your name is: "+ Name +"\n" +"The last charcter of your name is: " + ans1)


function firstCharcater(charac){
    return charac[0];
}


function lastCharcter(charc){
    return charc[charc.length -1];
}