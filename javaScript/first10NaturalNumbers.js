



function addAll(...numbers){
    let total = 0;
    for(num of numbers){
        total += num;
    }
    return total;
}

const ans = addAll(1,2,3,4,5);
console.log(ans)