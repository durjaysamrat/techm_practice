type UserProfile = {
    userName: string;
    userAge: number;
    userCity: string;
};

type ItemDetails = {
    itemId: number;
    itemName: string;
    itemPrice: number;
};

let userAccount: UserProfile = {
    userName: "Jane Smith",
    userAge: 29,
    userCity: "San Francisco"
};

let storeItem: ItemDetails = {
    itemId: 303,
    itemName: "Tablet",
    itemPrice: 499.99
};

console.log("User Account:", userAccount);
console.log("Store Item:", storeItem);

let numberList: number[] = [5, 15, 25, 35, 45];
numberList.push(55);
numberList.shift();
numberList.forEach(num => console.log("List Value:", num));

enum Shade {
    Crimson,
    Emerald,
    Snow,
    Ocean
}

let preferredShade: Shade = Shade.Emerald;
console.log("Preferred Shade:", preferredShade);
