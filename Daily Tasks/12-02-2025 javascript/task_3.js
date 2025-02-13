var date=new Date();
var m=String(date.getMonth()+ 1).padStart(2,'0');
var d=String(date.getDate()).padStart(2,'0');
var y=String(date.getFullYear());
console.log(m+'-'+d+'-'+y);
console.log(m+'/'+d+'/'+y);
console.log(d+'-'+m+'-'+y);
console.log(d+'/'+m+'/'+y);