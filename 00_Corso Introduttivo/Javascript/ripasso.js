console.log('----------Variables----------');

let variable;           //dichiarazione
variable = 'value';     //assegnazione           //usually on the same line   let variable = 'value';

console.log('----------Naming Variables----------');
/*  camelCase for naming variables
    can use only letters,digit and '_' or '$' 
    can't start with digit*/

console.log('----------Data Types----------');
/*  number,string,boolean,null,undefined  =>  l'operatore   typeof(variable)    restituisce in stringa 
il tipo del dato*/

console.log('----------Casting or Types Conversions----------');
/*si usano forme di conversione presenti in Javascript:    
        -Number(variable)   => questa consente di convertire a numero la variabile
        -String(variable)   => questa consente di convertire a stringa la variabile
        -Boolean(variable)  => questa consente di convertire a booleano la variabile

durante le conversioni bisogna sempre fare occhio a casi particolari come   'null'  o    'undefined'

alcuni operatori tendono a convertire i propri operandi nel tipo loro necessario:
- , * , / : operatori binari    =>tenderanno sempre a convertire i loro operandi in numeri

+ e - : operatori unari =>tendono a convertire i loro operandi in numeri e solo nel caso del - unario,
                          tenderà a convertirne il segno

+ : operatore binario  =>in JS oltre a effettuare l'addizione lo si usa per concatenare le stringhe,pertanto
                         se in presenza di stringa,tendera a convertire i restanti operandi in stringhe
*/

console.log('----------Variables Comparisons----------');
/*Gli operatori di confronto servono a verificare delle condizioni inerenti due variabili messe a confronto:
- == :  con il seguente operatore (uguaglianza) ci assicuriamo che le due variabili,indipendentemente dal loro 
        tipo,abbiano lo stesso valore
- < , > :   i seguenti operatori al verificarsi della condizione ci restituiranno un valore booleano
- === : il seguente operatore serve a verificare se due variabili coincidono(uguali sia nel valore che 
        nel tipo) */

console.log('----------Logical Operators----------');
/*Operatori che competono l'algebra di Bool:
    - AND => boolean1 && boolean2 :  da valore true solo se entrambi gli operandi sono true
    - OR => boolean1 || boolean2 :  da valore true solo se almeno uno dei due operandi è true
    - NOT => !boolean1 :            invertitore se true da false o viceversa
    - XOR => boolean1 ^ boolean2 :  da valore true solo se gli operando sono discordi e lo da sotto forma 
                                    di 0 oppure 1 */

console.log('----------Ternary/Conditional Operators----------');
/*let variable = (condizione) ? 'se vera' : 'se falsa' */

console.log('----------If/else----------');
/*if(condizione){blocco di codice da eseguire se verificata
}else{blocco da eseguire se non verificata}

if(condizione 1){blocco di codice da eseguire se verificata la condizione 1
}else if(condizione 2){blocco di codice da eseguire se verificata la condione 2
}else{blocco da eseguire se non verificata}*/

console.log('----------Switch----------');
/*switch(valore da verificare in base alle condizioni){
    case 'prima condizione === corrispondente alla variabile' :
        istruzione da eseguire(esempio console.log());
        break;
    case 'seconda condizione === corrispondente alla variabile' :
        istruzione da eseguire; 
        break;
    default :
        istruzione da eseguire;
        break;
}*/

console.log('----------Loops----------');
/*Ciclo For:
            for(indice; condizione ;incremento){
                blocco di codice da ripetere
            }

Ciclo While/Do:
                while(condizione){
                    l'indice deve essere dichiarato prima del ciclo
                    blocco da reiterare,di solito contiene anche l'incremento
                }           

                do{blocco di codice da reiterare
                }while(condizione)
*/

console.log('----------Functions----------');
/*Funzione con output:
                        function nomeFunzione(arg1,arg2){       // arg1, arg2 argomenti della funzione
                            let sum = arg1 + arg2;              //logica funzione
                            return sum;                   //valore di ritorno nel caso di funzione con output
}
  Funzione senza output:
                        function nomeFunzione(arg){     //esempi di funzioni senza output sono quelle 
                            console.log(arg);           //che stampano e non danno valori di ritorno
                            }

nomeFunzione();     //si usa per richiamare una funzione,se questa non è stata dichiarata tramite variabile
                    //allora la si può richiamara in qualsiasi riga
*/

console.log('----------Scope----------');
/* Global scope => esiste da per tutto e ne si può usufruire ovunque nel codice
   Function scope => solo all'inteno della funzione in cui si è dichiarata
   Block scope => solo all'interno di un blocco di codice*/

console.log('----------Object----------');
/* let obj ={
    key : 'value' ,
    key2 : 'value2'
}*/
