let today = new Date();
let christmas = new Date(today.getFullYear(), 11, 25);
if (today > christmas) {
  christmas.setFullYear(today.getFullYear() + 1);
}
let daysLeft = Math.ceil((christmas - today) / (1000 * 60 * 60 * 24));
console.log(daysLeft+" Days left for christmas");