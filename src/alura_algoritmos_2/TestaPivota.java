package alura_algoritmos_2;

public class TestaPivota {

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

        int posicaoDoPivo = particiona(notas, 0, notas.length);

        System.out.println("Pivô ficou na posição: " + posicaoDoPivo);

        for(Nota n : notas){
            System.out.println(n.getNome() + ", " + n.getValor());
        }


    }

    private static int particiona(Nota[] notas, int inicio, int termino) {

        int menoresAteAgora = 0;
        Nota pivo = notas[termino - 1];

        for(int analisando = inicio; analisando < termino - 1; analisando++){
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


}
