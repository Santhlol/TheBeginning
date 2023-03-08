function suma (arr) {
    for (let i = 0; i < arr.length; i++){
        for (let j = i +1; j < arr.length; j++){
            if (arr[i] + arr[j] == 10){
                return(`${arr[i]} ${arr[j]}`)
            }
        }
    }
    return("No se encontraron números que sumados den 10")
}

console.log(suma([2,4,8,5,6]));
