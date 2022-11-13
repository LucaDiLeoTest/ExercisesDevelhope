function Smartphone(brand, name, price){
    this.brand = brand;
    this.name = name;
    this.price = price;
}
let samsung = new Smartphone('Samsung', 'S22', 1100);
let iphone = new Smartphone('Iphone', '13 pro', 1500);

console.log(samsung);
console.log(iphone);