type Person11 = {
    name: string;
    age: number;
    city: string;
};

let individual: Person11 = {
    name: "Alice Johnson",
    age: 27,
    city: "New York"
};

console.log("Person Details:", individual);

let numbersArray: number[] = [2, 4, 6, 8, 10];
numbersArray.push(12);
numbersArray.pop();
numbersArray.forEach(num => console.log("Array Value:", num));

enum VehicleType {
    Car,
    Truck,
    Motorcycle,
    Bicycle
}

let chosenVehicle: VehicleType = VehicleType.Car;
console.log("Chosen Vehicle:", chosenVehicle);

let noValue: null = null;
let undefinedValue22: undefined = undefined;
console.log("Null Value:", noValue);
console.log("Undefined Value:", undefinedValue22);
