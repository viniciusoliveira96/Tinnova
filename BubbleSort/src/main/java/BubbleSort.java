public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};

        BubbleSort bubbleSorts = new BubbleSort();
        bubbleSorts.ordenar(vetor);
        for(int num : vetor){
            System.out.println(num + " ");
        }
    }

    //metodo de ordenamento
    public void ordenar(int[] v){
        for(int i = 0; i < v.length - 1; i++) {
            boolean ordenado = true;
            for(int j = 0; j < v.length - 1 - i; j++) {
                if(v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    ordenado = false;
                }
            }
            // se ja identificado a ordenação para as iterações
            if(ordenado){
                break;
            }
        }
    }
}
