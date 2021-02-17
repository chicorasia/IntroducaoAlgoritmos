package alura_algoritmos_2;

public class TestaOrdenacaoRapida {

    public static void main(String[] args) {

        Nota[] notas = {new Nota("Aline", 4.5),
                new Nota("Bernardo", 5.5),
                new Nota("Daniel", 8.0),
                new Nota("Marlene", 8.3),
                new Nota("Ana", 5.2),
                new Nota("Bruno", 5.4),
                new Nota("Zilka", 9.5),
                new Nota("Camila", 7.2),
                new Nota("Carlos", 7.0)
        };

        ordena(notas, 0, notas.length);

        int busca = buscaBinaria(notas,7.2);



        for(Nota n : notas){
            System.out.println(n.getNome() + ", " + n.getValor());
        }

        System.out.println("\nEncontrei a nota na posicao: " + busca);

    }

    private static int busca(Nota[] notas, int de, int ate, double buscando) {

        for(int atual = de; atual < ate; atual++){
            if(notas[atual].getValor() == buscando) return atual;
        }

        return -1;

    }

    private static void ordena(Nota[] notas, int de, int ate) {

        int elementos = ate - de;

        if(elementos > 1){
            int posicaoDoPivo = particiona(notas, de, ate);
            ordena(notas, de, posicaoDoPivo);
            ordena(notas, posicaoDoPivo + 1, ate);
        }

    }

    private static int particiona(Nota[] notas, int inicio, int termino) {

        int menoresAteAgora = 0;
        Nota pivo = notas[termino - 1];

        for(int analisando = 0; analisando < termino - 1; analisando++){
            if(notas[analisando].getValor() <= pivo.getValor()){
                trocaPosicoes(notas, analisando, menoresAteAgora);
                menoresAteAgora++;
            }
        }

        trocaPosicoes(notas, termino - 1, menoresAteAgora);
        return menoresAteAgora;

    }

    private static void trocaPosicoes(Nota[] notas, int posicao1, int posicao2) {
        Nota tmp = notas[posicao2];
        notas[posicao2] = notas[posicao1];
        notas[posicao1] = tmp;
    }

    private static int buscaBinaria(Nota[] notas, int de, int ate, double buscando){

        int meio = (ate + de) / 2;
        if(de > ate){
            return -1;
        }
        if(notas[meio].getValor() == buscando){
            return meio;
        }
        if(buscando <= notas[meio].getValor()){
            return buscaBinaria(notas, de, meio - 1, buscando);
        }
        return buscaBinaria(notas, meio + 1, ate, buscando);

    }

    private static int buscaBinaria(Nota[] notas, double buscando){

        return buscaBinaria(notas, 0, notas.length, buscando);

    }

}
