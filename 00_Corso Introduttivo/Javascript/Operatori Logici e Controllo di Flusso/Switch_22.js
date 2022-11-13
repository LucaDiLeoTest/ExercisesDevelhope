let primitive = 'Marco';

//if(typeof (primitive) === 'number'){
//    console.log('it is a number');
//}else if(typeof (primitive) === 'string'){
//    console.log('it is a string');
//}else if(typeof (primitive) === 'boolean'){
//    console.log('it is a boolean');
//}

switch(typeof(primitive)){
    case 'number':
        console.log('it is a number');
        break;
    case 'string':
        console.log('it is a string');
        break;
    case 'boolean':
        console.log('it is a boolean');
        break;
    default:
        console.log('default');
        break;
}