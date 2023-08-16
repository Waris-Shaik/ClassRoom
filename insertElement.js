const arr = [40,33,50,27,4];
var insertElement = function (arr){
    const arr1 = [...arr];
    const newElement = 7;
    const atPosition = 2;
    console.log('Original Array is', arr);
    for(let i=arr1.length-1;  i>=0;  i--){
        if( i >= atPosition ){
            arr1[i+1] = arr1[i];
            if( i === atPosition ){
                arr1[i] = newElement;
            }
        }
    }
    return arr1;
}

const output = insertElement(arr);
console.log(output)

