class Student {
    name: string;
    studentClass: string;

    constructor(name: string, studentClass: string) {
        this.name = name;
        this.studentClass = studentClass;
    }
}

const student1 = new Student("Ravi", "B.Tech");
console.log(`Student Name: ${student1.name}, Class: ${student1.studentClass}`);
