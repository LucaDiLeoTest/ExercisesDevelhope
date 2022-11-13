let smartphone = {
    'brand' : 'Iphone' ,
    'model' : '13 Pro Max',
    'price' : '1500'
}
smartphone.price = 1600;
Object.freeze(smartphone);
smartphone.price = 2000;
console.log(smartphone);