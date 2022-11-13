let user = {
    'name' : "Cosimo",
    'age' : 30
}

/*let newUser = Object.assign({}, user)*/
for(let newUser in user){
    let newUser = user;
    console.log(newUser);
}

//let newUser = user;
//newUser.name = "Paolo";
  
//console.log(newUser);
//console.log(user);  