var customer = {
    fullName: "John Doe",
    yearsOld: 35,
    location: "Los Angeles"
};
var productItem = {
    productId: 202,
    productName: "Smartphone",
    cost: 799.99
};
console.log("Customer:", customer);
console.log("Product Item:", productItem);
var values = [10, 20, 30, 40, 50];
values.push(60);
values.shift();
values.forEach(function (value) { return console.log("Array Value:", value); });
