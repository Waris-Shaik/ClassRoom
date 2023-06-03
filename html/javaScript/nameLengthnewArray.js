const arr = ['waris', 'areef','habib', 'sameer', 'habeeb', 'samiulla', 'upendra', 'yugendra', 'vamshi', 'ashok', 'jayanth', 'ramakrishna'];

const newArray = arr.filter(check);
console.log(newArray);

function check(nameLength){
    return nameLength.length === 5;
//  return nameLength.length === 5 || nameLength.length === 7;

}