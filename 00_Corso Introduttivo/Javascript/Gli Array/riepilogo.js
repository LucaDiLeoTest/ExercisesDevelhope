let arr = [1, '2', true];   //negli array i valori sono ordinati,mentre negli oggetti si dovrebbe usare la 
                            //funzione Object.keys(obj)
/*negli oggetti bastava accedere ai valori attraverso le chiavi con forme del tipo:
                    obj['key']=value  oppure  obj.key=value

Negli array invece basta usare i numeri visto che sono sempre in ordine,ad esempio:
                    arr[0]   con questo si indicherebbe il primo valore*/
    //0 indexing => means that all lists' indecis start with 0 not with 1

arr.length //=> ci indica il numero di elementi presenti nel nostro array

console.log(arr[0]);
console.log(arr.length);

arr[0] = 10;    // modo simile agli oggetti per assegnare nuovi valori all'indice corrispondente

//methods detti "last in, last out" => .push()  e   .pop()
arr.push();     //.push() metodo che ci consente di aggiungere nell' ultima posizione un valore in un array
arr.pop();      //.pop() metodo che ci consente di togliere l'ultimo valore da un array

arr.shift();    //.shift() metodo che consente di togliere un elemento dall'inizio dell'array
arr.unshift();  //.unshift() metodo che consente di aggiungere un valore all'inizio del nostro array

arr.join(' , ');  //consente di scrivere l'array come una frase

/*arr.forEach((element) => console.log(element));    
metodo che mi consente di eseguire un'azione specifica per ogni elemento dell'array*/

// https://my.visme.co/view/ojgwx0k4-ok32rz0moy8z5w8d   =>  link per vedere i metodi