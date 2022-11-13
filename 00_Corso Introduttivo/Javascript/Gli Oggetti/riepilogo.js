let obj = {                         //come si dichiara un oggetto
    'key' : 2 ,
    'key2' : 'ciao' ,
    'key3' : true ,
    'func' : (arg) => arg + 2
}

obj.key = 4;                      //obj.key oppure obj['key'] si usano entrambi indifferentemente
obj['key2'] = 'hello';            //per ridichiarare il valore di key

console.log(obj['key']);          //oppure nel console.log per stamparne il valore
console.log(obj['key2']);
console.log(obj.func(10));        // nel caso di key===a funzioni si può inserire al posto del 10 l'arg
console.log(Object.keys(obj));    //la funzione Object.keys('nome dell'oggetto') serve per conoscere le
                                  //keys presenti all'interno dell'oggetto preso in esame


//--------Lezione In Operator and For In--------

if('key' in obj){}else{}          //in operator => operatore che controlla se la 'key' è presente nell'oggetto

for(const variable in obj){     //loop for(in) serve a controllare le varie keys dell'oggetto preso in esame
    console.log(variable);              //cosi posso controllare quali keys contiene l'oggetto
    console.log(typeof(variable));      //cosi controllo la tipologia delle keys
    console.log(typeof(obj.variable));  //in questa maniera con * obj.variable * riesco a controllare i values               
}                                             //oppure * obj['variable']*

//--------Values vs References--------

/*function changeValue(obj, key, val){
    obj[key] = val;
}*/

//--------Object Function--------
function changeValue(obj, key, val){
    let copy=Object.assign({}, obj);    //Object.assign() è una funzione con argomenti un oggetto vuoto {} e
    copy[key] = val;                    //l'oggetto che si vuole copiare
    return copy;
}

Object.freeze()     //questa funzione si usa per trattare un oggetto come se fosse una costante in quanto in
                    //fase dichiarativa const su un oggetto non funziona
Object.is(arg1, arg2)   //is metodo di uguaglianza tra gli argomenti opera come '==='

//--------Constructor Functions--------
function Person(name, age, nationality){
    this.name = name; //{name : name}           
    this.age = age;   //obj['age'] = age;       //utilizzando this. stiamo istanziando l'oggetto,ossia
    this.nationality = nationality;             //gli stiamo dando dei valori precisi 
}

let greg = new Person('Greg', 28, 'USA'); //per richiamare queste funzioni si deve usare questa forma
                                          //dato che le COnstructor Functions non hanno un return value.
console.log(Person('Greg', 28, 'USA'));