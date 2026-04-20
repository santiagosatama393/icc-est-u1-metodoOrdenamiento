public class BubbleSort {
    public BubbleSort (){
        //constructor
        System.out.println("se creo la clase en el constructor");


    }
    public void sortAscendente (int numeros[]) {
        for(int i =0; i < numeros.length; i++){
            for(int j= i+1; j< numeros.length; j++){
                //comparacion
                if (numeros [i] > numeros[j]){
                    //si cumple
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }

            }
        }

    }
 public void sortDescendet(int[]numeros){

 }

    public void printArreglo(int[] numeros) {
        for (int i : numeros){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

