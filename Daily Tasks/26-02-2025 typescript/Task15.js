var Student = /** @class */ (function () {
    function Student(name, studentClass) {
        this.name = name;
        this.studentClass = studentClass;
    }
    return Student;
}());
var student1 = new Student("Ravi", "B.Tech");
console.log("Student Name: ".concat(student1.name, ", Class: ").concat(student1.studentClass));
