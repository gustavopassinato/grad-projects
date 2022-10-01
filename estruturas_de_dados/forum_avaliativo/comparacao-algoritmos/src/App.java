import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {
        final AlgorithmSort BOUBLE_SORT = new BoubleSort();
        final AlgorithmSort INSERTATION_SORT = new InsertationSort();
        final AlgorithmSort QUICK_SORT = new QuickSort();

        final int[] ARRAY_1000_ALEATORIO = ArrayGenerator.getRandomArray(100);
        final int[] ARRAY_1000_ASCENDENTE = ArrayGenerator.getAscOrderArray(1000);
        final int[] ARRAY_1000_DESCENDENTE = ArrayGenerator.getDescOrderArray(1000);

        /**
         * Seção para Array aleatório
         */
        final long TEMPO_BOUBLE_SORT_1000_ALEATORIO = executeAlgorithm(BOUBLE_SORT, ARRAY_1000_ALEATORIO);
        final long TEMPO_INSERTATION_SORT_1000_ALEATORIO = executeAlgorithm(INSERTATION_SORT, ARRAY_1000_ALEATORIO);
        final long TEMPO_QUICK_SORT_1000_ALEATORIO = executeAlgorithm(QUICK_SORT, ARRAY_1000_ALEATORIO);

        /**
         * Seção para Array ordenado de maneira ascendente
         */
        final long TEMPO_BOUBLE_SORT_1000_ASC = executeAlgorithm(BOUBLE_SORT, ARRAY_1000_ASCENDENTE);
        final long TEMPO_INSERTATION_SORT_1000_ASC = executeAlgorithm(INSERTATION_SORT, ARRAY_1000_ASCENDENTE);
        final long TEMPO_QUICK_SORT_1000_ASC = executeAlgorithm(QUICK_SORT, ARRAY_1000_ASCENDENTE);

        /**
         * Seção para Array ordenado de maneira descendente
         */
        final long TEMPO_BOUBLE_SORT_1000_DESC = executeAlgorithm(BOUBLE_SORT, ARRAY_1000_DESCENDENTE);
        final long TEMPO_INSERTATION_SORT_1000_DESC = executeAlgorithm(INSERTATION_SORT, ARRAY_1000_DESCENDENTE);
        final long TEMPO_QUICK_SORT_1000_DESC = executeAlgorithm(QUICK_SORT, ARRAY_1000_DESCENDENTE);

        String cabecalho = "ALGORITMO         | ARRAY ALEATORIO | ARRAY ASCENDENTE | ARRAY DESCENDENTE";
        String boubleSort = String.format("BOUBLE SORT       |     %d      |      %d     |      %d   ", 
            TEMPO_BOUBLE_SORT_1000_ALEATORIO,
            TEMPO_BOUBLE_SORT_1000_ASC,
            TEMPO_BOUBLE_SORT_1000_DESC);
        String insertationSort = String.format("INSERTATION SORT  |      %d       |       %d      |       %d    ", 
            TEMPO_INSERTATION_SORT_1000_ALEATORIO,
            TEMPO_INSERTATION_SORT_1000_ASC,
            TEMPO_INSERTATION_SORT_1000_DESC);
        String quickSort = String.format("QUICK SORT        |     %d      |      %d     |      %d   ", 
            TEMPO_QUICK_SORT_1000_ALEATORIO,
            TEMPO_QUICK_SORT_1000_ASC,
            TEMPO_QUICK_SORT_1000_DESC);

        System.out.println(cabecalho);
        System.out.println(insertationSort);
        System.out.println(quickSort);
        System.out.println(boubleSort);
    }

    public static long executeAlgorithm(AlgorithmSort algorithm, int[] array){
        long inicialTime = System.nanoTime();

        int[] sortedArray = algorithm.sort(array, 0, array.length -1);

        long finalTime = System.nanoTime();

        if (verifySortError(sortedArray)){
            for(int i : sortedArray){
                System.out.print(" "+ i);
            }
            throw new IllegalArgumentException("Erro na ordenação do vetor!!");
        }

        return finalTime - inicialTime;

    }

    private static boolean verifySortError(int[] sortedArray) {

        for(int i = 0; i< sortedArray.length -1 ; i++){
            if(sortedArray[i]>sortedArray[i+1]){
                return true;
            }
        }
        return false;
    }
}
