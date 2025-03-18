var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Vehicle = /** @class */ (function () {
    function Vehicle(make, model) {
        this.make = make;
        this.model = model;
    }
    return Vehicle;
}());
var Car45 = /** @class */ (function (_super) {
    __extends(Car45, _super);
    function Car45(make, model) {
        return _super.call(this, make, model) || this;
    }
    return Car45;
}(Vehicle));
var SportsCar = /** @class */ (function (_super) {
    __extends(SportsCar, _super);
    function SportsCar(make, model) {
        return _super.call(this, make, model) || this;
    }
    return SportsCar;
}(Car45));
var mySportsCar = new SportsCar("Ferrari", "488 Spider");
console.log(mySportsCar);
