/*function canPlay() {
    let sport = " Football";
  
    if (true) {
      let personName = "Cosimo";
    }
  
    console.log(personName + sport);  //errore in quanto la variabile personName esiste solo all'interno di if.
}
  
canPlay();*/

function canPlay(){
    let sport = 'Football';
    if(true){
        let personName = 'Cosimo';
        console.log(personName + ' ' + sport);
    }
}
canPlay();