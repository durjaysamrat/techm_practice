class Animal {
    name: string;
    species: string;

    constructor(name: string, species: string) {
        this.name = name;
        this.species = species;
    }
}

class Tiger extends Animal {
    roar() {
        console.log(`${this.name} the tiger is roaring!`);
    }
}

const myTiger = new Tiger("Sheru", "Bengal Tiger");
console.log(myTiger);

myTiger.roar();
