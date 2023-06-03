


const users = [
    {userID : 1, userName : 'waris'},
    {userID : 2, userName : 'habib'},
    {userID : 3, userName : 'areef'},
    {userID : 4, userName : 'sameer'},
    {userID : 5, userName : 'smiulla'},
    {userID : 6, userName : 'habib'},
];



const ans = users.find((id)=> id.userID === 3);
console.log(ans);


function getIt (check){
    return check.userID === 3;
}

const checking = users.find(getIt);
console.log(checking)

const ahh = users.find((ck) => {

    return ck.userID === 3;
});

console.log(ahh)