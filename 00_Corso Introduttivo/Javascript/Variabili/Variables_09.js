const name = "Mario";
const lastname = "Rossi";
const age = 27;
const isGraduated = false;
const average = 27;
const examsCompleted = 10;
const firstYearCompleted = true;
const yearsCompleted = 1;

console.log(name == lastname);                          //false-y
console.log(age <= average);                            //truth-y
console.log(firstYearCompleted == lastname);            //false-y
console.log(yearsCompleted == firstYearCompleted);      //truth-y
console.log(firstYearCompleted === yearsCompleted);     //false-y
console.log(examsCompleted < age);                      //truth-y
console.log(isGraduated > yearsCompleted);              //truth-y