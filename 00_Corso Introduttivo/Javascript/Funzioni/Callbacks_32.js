function sayHelloName(callback){
    setTimeout(function(){
        console.log('Hello');
        callback();} ,1000)
}
function printName(){
    console.log('Luca');
}
sayHelloName(printName); //perchè la funzione printName deve essere senza ()