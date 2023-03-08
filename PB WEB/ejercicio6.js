function repetidos (arr) {
    let vecesRepetido = 0;
    let numRepetido = 0;
    let contador = 0
    for (let i = 0; i < arr.length; i++){
        if (arr[i] == arr[i+1]){
           contador += 1;
           if(contador > vecesRepetido){
            vecesRepetido = contador
            numRepetido = arr[i]
           }
        }
    }
    return(`Longest: ${vecesRepetido}
    Number: ${numRepetido}`)
}

const array = [1,2,2,5,4,6,7,8,8,8]
console.log(repetidos(array))