class Student4 {
    name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age > 0 ? age : 0;
    }
}

const student18 = new Student4("Ravi", 20);
const student25 = new Student4("Teja", -5);
console.log(student18);
console.log(student25);
