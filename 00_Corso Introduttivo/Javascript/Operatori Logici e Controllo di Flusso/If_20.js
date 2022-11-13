let primitive = 'carlo';

if(primitive === Number(primitive)){
    console.log(primitive, typeof(primitive), '--The variable is a number!');
}else if(primitive === String(primitive)){
    console.log(primitive, typeof(primitive), '--The variable is a string!');
}else if(primitive === Boolean(primitive)){
    console.log(primitive, typeof(primitive), '--The variable is a boolean!');
}else{
    console.log('Not a primitive type or undefined!');
}

//correzione
// if(typeof(primitive) === 'number'/'string'/'boolean')