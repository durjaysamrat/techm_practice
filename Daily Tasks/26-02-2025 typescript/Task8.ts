type PersonDetails = {
    fullName: string;
    yearsOld: number;
    location: string;
};

type ProductInfo = {
    productId: number;
    productName: string;
    cost: number;
};

let customer: PersonDetails = {
    fullName: "John Doe",
    yearsOld: 35,
    location: "Los Angeles"
};

let productItem: ProductInfo = {
    productId: 202,
    productName: "Smartphone",
    cost: 799.99
};

console.log("Customer:", customer);
console.log("Product Item:", productItem);

let values: number[] = [10, 20, 30, 40, 50];
values.push(60);
values.shift();
values.forEach(value => console.log("Array Value:", value));
