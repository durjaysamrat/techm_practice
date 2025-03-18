var Engine = /** @class */ (function () {
    function Engine(horsepower, fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }
    return Engine;
}());
var Car1 = /** @class */ (function () {
    function Car1(make, model, year, engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }
    Car1.prototype.start = function () {
        console.log("The ".concat(this.make, " ").concat(this.model, " is starting."));
    };
    Car1.prototype.printCarDetails = function () {
        console.log("Car1: ".concat(this.make, " ").concat(this.model, ", Year: ").concat(this.year, ", Engine: ").concat(this.engine.horsepower, " HP, Fuel: ").concat(this.engine.fuelType));
    };
    return Car1;
}());
var myEngine = new Engine(300, "Petrol");
var myCar = new Car1("Toyota", "Camry", 2023, myEngine);
myCar.start();
myCar.printCarDetails();
