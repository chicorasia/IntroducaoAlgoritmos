package alura_algoritmos_2;

public class TestaEncontraMenores {

    public static void main(String[] args) {

        Nota camila = new Nota("Camila", 7.2);

        Nota[] notas = {new Nota("Aline", 4.5),
                new Nota("Bernardo", 5.5),
                new Nota("Daniel", 8.0),
                new Nota("Carlos", 7.0),
                camila,
                new Nota("Ana", 5.2),
                new Nota("Bruno", 5.4),
                new Nota("Zilka", 9.5),
                new Nota("Marlene", 8.3)};

        int contagemMenores = encontraMenores(camila, notas);

        System.out.println(contagemMenores);

    }

    private static int encontraMenores(Nota busca, Nota[] notas){

        int contagem = 0;

        for(Nota n : notas){
            if(!n.equals(busca) && n.getValor() < busca.getValor()){
                    contagem++;
            }
        }

        return contagem;

    }

}
