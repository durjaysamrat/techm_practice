var userAccount = {
    userName: "Jane Smith",
    userAge: 29,
    userCity: "San Francisco"
};
var storeItem = {
    itemId: 303,
    itemName: "Tablet",
    itemPrice: 499.99
};
console.log("User Account:", userAccount);
console.log("Store Item:", storeItem);
var numberList = [5, 15, 25, 35, 45];
numberList.push(55);
numberList.shift();
numberList.forEach(function (num) { return console.log("List Value:", num); });
var Shade;
(function (Shade) {
    Shade[Shade["Crimson"] = 0] = "Crimson";
    Shade[Shade["Emerald"] = 1] = "Emerald";
    Shade[Shade["Snow"] = 2] = "Snow";
    Shade[Shade["Ocean"] = 3] = "Ocean";
})(Shade || (Shade = {}));
var preferredShade = Shade.Emerald;
console.log("Preferred Shade:", preferredShade);
