type Person = {
    name: string;
    age: number;
    city: string;
};

type Product = {
    id: number;
    name: string;
    price: number;
};

let user: Person = {
    name: "Ravi",
    age: 21,
    city: "Hyd"
};

let item: Product = {
    id: 101,
    name: "Laptop",
    price: 999.99
};

console.log("Person:", user);
console.log("Product:", item);
