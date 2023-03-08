public class Histograma {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 2, 3, 4, 1, 3};
        int[] frequency = new int[6]; // 6 porque los números están del 1 al 5, y se necesita una posición más para la frecuencia de los números no presentes
        
        for (int i = 0; i < myArray.length; i++) {
            frequency[myArray[i]]++;
        }
        
        for (int i = 1; i < frequency.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}