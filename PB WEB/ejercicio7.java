public class MyClass {
    public static String suma(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == 10){
                    return arr[i]+ " " + arr[j];
                }
            }
        }
        return "No se encontraron dos numeros que sumados den 10";
    }
    
    public static void main(String args[]) {
        int[] array = {2,4,5,7,8};
        String res = MyClass.suma(array);
        System.out.println(res);
        }
}