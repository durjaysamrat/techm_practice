var Student2 = /** @class */ (function () {
    function Student2(name, rollNumber) {
        this.name = name;
        if (rollNumber !== undefined) {
            this.rollNumber = rollNumber;
        }
    }
    return Student2;
}());
var student11 = new Student2("Ravi", 101);
var student2 = new Student2("Teja");
console.log(student11);
console.log(student2);
