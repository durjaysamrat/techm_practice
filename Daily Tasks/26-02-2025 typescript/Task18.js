var Student4 = /** @class */ (function () {
    function Student4(name, age) {
        this.name = name;
        this.age = age > 0 ? age : 0;
    }
    return Student4;
}());
var student18 = new Student4("Ravi", 20);
var student25 = new Student4("Teja", -5);
console.log(student18);
console.log(student25);
