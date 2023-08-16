let num = 456;
let ans = 0;

while( parseInt(num) !== 0){
    let rem = parseInt(num % 10);
    ans = ans* 10+ rem;
    num /= 10;
}


console.log(ans)