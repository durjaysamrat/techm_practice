var individual = {
    name: "Alice Johnson",
    age: 27,
    city: "New York"
};
console.log("Person Details:", individual);
var numbersArray = [2, 4, 6, 8, 10];
numbersArray.push(12);
numbersArray.pop();
numbersArray.forEach(function (num) { return console.log("Array Value:", num); });
var VehicleType;
(function (VehicleType) {
    VehicleType[VehicleType["Car"] = 0] = "Car";
    VehicleType[VehicleType["Truck"] = 1] = "Truck";
    VehicleType[VehicleType["Motorcycle"] = 2] = "Motorcycle";
    VehicleType[VehicleType["Bicycle"] = 3] = "Bicycle";
})(VehicleType || (VehicleType = {}));
var chosenVehicle = VehicleType.Car;
console.log("Chosen Vehicle:", chosenVehicle);
var noValue = null;
var undefinedValue22 = undefined;
console.log("Null Value:", noValue);
console.log("Undefined Value:", undefinedValue22);
