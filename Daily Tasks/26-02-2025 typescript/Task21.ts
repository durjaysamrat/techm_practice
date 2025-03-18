class Shape11 {
    color: string;

    constructor(color: string) {
        this.color = color;
    }

    draw() {
        console.log(`Drawing a shape of color ${this.color}.`);
    }
}

class Circle12 extends Shape11 {
    constructor(color: string) {
        super(color);
    }

    draw() {
        console.log(`Drawing a circle of color ${this.color}.`);
    }
}

const myCircle1 = new Circle12("Blue");
myCircle1.draw();
