class Student2 {
    name: string;
    rollNumber?: number;

    constructor(name: string);
    constructor(name: string, rollNumber: number);
    constructor(name: string, rollNumber?: number) {
        this.name = name;
        if (rollNumber !== undefined) {
            this.rollNumber = rollNumber;
        }
    }
}

const student11 = new Student2("Ravi", 101);
const student2 = new Student2("Teja");
console.log(student11);
console.log(student2);
