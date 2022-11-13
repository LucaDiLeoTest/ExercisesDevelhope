function counterZero(numbersArray) {
    let counter = 0;
    for(i = 0; i < numbersArray.length; i++){
    if(numbersArray[i] === 0){
        counter = counter + 1;
    }
    }
    return counter;
}  
console.log(counterZero([0, 0, 0, 2, 3, 4, 5, 0, 0, 10]));