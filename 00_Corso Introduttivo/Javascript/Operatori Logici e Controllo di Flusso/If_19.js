let name = 'Luca';
let surname = 'Di Leo';
let fullName = name + ' ' + surname;

if(Boolean(name) && Boolean(surname)){
    console.log(fullName);
}else{
    console.log('Fullname is invalid');
}