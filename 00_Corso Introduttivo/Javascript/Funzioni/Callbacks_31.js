function sayHelloName(callback){
    console.log('Hello');
    callback();
}

/*function printName(name){
    console.log(name)
}
sayHelloName(printName('Luca'));*/

function printName(){
    console.log('Luca');
}
sayHelloName(printName);