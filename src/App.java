public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         int[] numeros = {10, 0, -5, 5, 15,2};
         runBuubleSort();
    }
        public static void runBuubleSort(){
            System.out.println("Metodo Burbuja");
            int[] numeros = {-5, 10, 2, 0, 7};
            //intanci de la clase
            BubbleSort bubbleSort = new BubbleSort();
            // bubbleSort.printArreglo(numeros);
            // bubbleSort.sortAscendente(numeros);
            // bubbleSort.printArreglo(numeros);
            // bubbleSort.sortDescendet(numeros);
            // bubbleSort.printArreglo(numeros);

            bubbleSort.printArreglo(numeros);
            bubbleSort.sort(numeros, asc: true);
            bubbleSort.printArreglo(numeros);
            bubbleSort.sort(numeros, asc:false);
            bubbleSort.printArreglo.(numeros);
        }

    } 

