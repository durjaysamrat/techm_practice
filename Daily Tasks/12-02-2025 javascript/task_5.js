var str="digiterati"
rotates(str);
function rotates(str){
    console.log(str);
   for(let i=0;i<str.length;i++)
   {
    var ch=str.slice(-1);
    str = ch + str.slice(0, -1);
    console.log(str);
   }
}