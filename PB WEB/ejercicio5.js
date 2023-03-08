const myArray = [1, 2, 2, 3, 4, 4, 4, 5, 5, 5];
const frequency = new Array(6).fill(0); 


for (let i = 0; i < myArray.length; i++) {
  const num = myArray[i];
  frequency[num]++;
}


console.log("Histograma:");
for (let i = 1; i <= 5; i++) {
  let output = i + " | ";
  for (let j = 0; j < frequency[i]; j++) {
    output += "*";
  }
  output += " (" + frequency[i] + ")";
  console.log(output);
}