public class MyClass {
    public static String repetidos(int[] arr){
        int vecesRepetido = 0;
        int numRepetido = 0;
        int contador = 0;
        for (int i = 0; i < (arr.length - 1 ); i++){
            if (arr[i] == arr[i+1]){
                contador += 1;
                if(contador > vecesRepetido){
                    vecesRepetido = contador;
                    numRepetido = arr[i];
                }
            }
        }
        return "Longest: " + vecesRepetido + " " + "Number: " + numRepetido;
    }
    
    public static void main(String args[]) {
        int[] array = {1,2,2,4,5,6,7,8,8,8};
        String res = MyClass.repetidos(array);
        System.out.println(res);
    }
}
