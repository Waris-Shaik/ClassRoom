


const obj = {
    name : 'waris shaik',
    age : 22
};

const obj1 = {
    name : 'habib syed',
    age : 23
};
const obj2 = {
    name : 'areef shaik',
    age : 22
}

const extraInfo = new Map();
extraInfo.set(obj, {gender : 'male', city : 'nandyal'});
extraInfo.set(obj1,{gender : 'male', city : 'nandyal'});
extraInfo.set(obj2, {gender : 'male', city : 'nandyal'})
console.log(extraInfo);

for(let key of extraInfo.keys()){
    console.log(key);
}


for(let value of extraInfo.values()){
    console.log(value);
}

console.log(extraInfo.get(obj).gender);
console.log(extraInfo.get(obj2).gender)