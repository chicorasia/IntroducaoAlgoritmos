package alura_algoritmos_2;

public class TestaParticionaAlfabeticamente {

    public static void main(String[] args) {

        String[] nomes = {
                "Maria",
                "Camila",
                "Jonas",
                "Andressa",
                "Paloma",
                "Alberto",
                "Junior",
                "Enzo",
                "Paulo",
                "Fernando"
        };

        int posicaoDoPivo = particionaAlfabeticamente(nomes, 0, nomes.length);

        ordenaAlfabeticamente(nomes, 0, nomes.length);
        int buscaNome = buscaBinaria(nomes, 0, nomes.length - 1, "Paloma");

        System.out.println("Posicao do pivô: " + posicaoDoPivo);

        for(String n : nomes){
            System.out.println(n);
        }

        System.out.println("Encontrei o nome na posição: " + buscaNome);



    }

    private static int buscaBinaria(String[] nomes, int de, int ate, String buscando) {

        if(de > ate){
            return -1;
        }

        int meio = (de + ate) / 2;
        String nome = nomes[meio];

        if(nome.equals(buscando)){
            return meio;
        }

        if(buscando.compareTo(nome) < 0){
            return buscaBinaria(nomes, de, meio -1, buscando);
        }
        return buscaBinaria(nomes, meio + 1, ate, buscando);


    }

    private static void ordenaAlfabeticamente(String[] nomes, int de, int ate) {

        int elementos = ate - de;

        if(elementos > 1){
            int posicaoDoPivo = particionaAlfabeticamente(nomes, de, ate);
            ordenaAlfabeticamente(nomes, de, posicaoDoPivo);
            ordenaAlfabeticamente(nomes, posicaoDoPivo + 1, ate);
        }

    }

    private static int particionaAlfabeticamente(String[] nomes, int inicio, int termino) {

        int menoresAteAgora = 0;
        String pivo = nomes[termino - 1];

        for(int analisando = 0; analisando < termino - 1; analisando++){
//            System.out.println("Comparando: " + nomes[analisando] + ", " + pivo);
            if(nomes[analisando].compareTo(pivo) < 0){

                trocaPosicao(nomes, analisando, menoresAteAgora);
                menoresAteAgora++;
            }
        }

        trocaPosicao(nomes, termino - 1, menoresAteAgora);
        return menoresAteAgora;
    }

    private static void trocaPosicao(String[] nomes, int posicao1, int posicao2) {

        String tmp = nomes[posicao2];
        nomes[posicao2] = nomes[posicao1];
        nomes[posicao1] = tmp;

    }




}
