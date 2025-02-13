function cTof(c) {
    return (c*9/5)+32;
}

function ftoc(f){
    return (f-32)*5/9;
}
console.log("100C is "+cTof(100)+"F");
console.log("60F is " + ftoc(60)+"C");