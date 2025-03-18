let valNumber: number = 25;
let valString: string = "Hello World";
let valBoolean: boolean = false;
let valUndefined: undefined = undefined;

console.log("Number:", valNumber * 2);
console.log("String:", valString.toUpperCase());
console.log("Boolean:", valBoolean);
console.log("Undefined:", valUndefined);

let dynamicValue = "500";
let convertedToNumber: number = parseInt(dynamicValue);
console.log("Converted to Number:", convertedToNumber);

let floatString = "45.67";
let convertedToFloat: number = parseFloat(floatString);
console.log("Converted to Float:", convertedToFloat);

let numValuenew = 789;
let convertedToString: string = numValuenew.toString();
console.log("Converted to String:", convertedToString);

let unknownValue: any = "900";
let assertedNumber: number = unknownValue as number;
console.log("Asserted Number:", assertedNumber);
