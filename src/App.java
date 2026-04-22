public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         int[] numeros = {10, 0, -5, 5, 15,2};
        //  runBuubleSort();
         runBubbleSortAvz();
    }
        public static void runBuubleSort(){

            // System.out.println("Metodo Burbuja");
            // int[] numeros = {-5, 10, 2, 0, 7};
            // //intanci de la clase
            // BubbleSort bubbleSort = new BubbleSort();
            // bubbleSort.printArreglo(numeros);
            // bubbleSort.sortAscendente(numeros);
            // bubbleSort.printArreglo(numeros);
            // bubbleSort.sortDescendet(numeros);
            // bubbleSort.printArreglo(numeros);

        //    bubbleSort.printArreglo(numeros);
        //     bubbleSort.sort(numeros, asc: true);
        //     bubbleSort.printArreglo(numeros);
        //     bubbleSort.sort(numeros, asc:false);
        //     bubbleSort.printArreglo.(numeros); <>
        }
         public static void runBubbleSortAvz(){
            int[] array= new int[]{9,2,3,0,8,4,5,50,100};
            //instanciar la clase
            BubbleSortAvz bubbleSortAvz = new BubbleSortAvz(array);
            bubbleSortAvz.printArray(array);
            bubbleSortAvz.sort(true);
            bubbleSortAvz.printArray(array);
         }
    } 

