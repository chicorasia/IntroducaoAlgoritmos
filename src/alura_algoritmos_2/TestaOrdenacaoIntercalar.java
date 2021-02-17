package alura_algoritmos_2;

public class TestaOrdenacaoIntercalar {

    public static void main(String[] args) {

       Nota[] esquerda = {new Nota("Aline", 4.5),
           new Nota("Bernardo", 5.5),
           new Nota("Carlos", 7.0),
           new Nota("Daniel", 8.0)};

       Nota[] direita = {new Nota("Ana", 5.2),
           new Nota("Bruno", 5.4),
           new Nota("Camila", 7.2),
           new Nota("Marlene", 8.3),
           new Nota("Zilka", 9.5)};

        Nota[] todas = {new Nota("Aline", 4.5),
                new Nota("Bernardo", 5.5),
                new Nota("Carlos", 7.0),
                new Nota("Daniel", 8.0),
                new Nota("Ana", 5.2),
                new Nota("Bruno", 5.4),
                new Nota("Camila", 7.2),
                new Nota("Marlene", 8.3),
                new Nota("Zilka", 9.5)};

//       Nota[] rank = intercala(direita, esquerda);

        Nota[] notasEmbaralhadas = {new Nota("Aline", 4.5),
                new Nota("Bernardo", 5.5),
                new Nota("Daniel", 8.0),
                new Nota("Carlos", 7.0),
                new Nota("Camila", 7.2),
                new Nota("Ana", 5.2),
                new Nota("Bruno", 5.4),
                new Nota("Zilka", 9.5),
                new Nota("Marlene", 8.3)};



//        intercala(todas, 3, 4, 5);
        ordenaAlfabeticametne(notasEmbaralhadas, 0, notasEmbaralhadas.length);

        for(Nota n : notasEmbaralhadas){
            System.out.println(n.getNome() + ", " + n.getValor());
        }


    }

    private static Nota[] intercala(Nota[] direita, Nota[] esquerda) {

        int total = direita.length + esquerda.length;
        Nota[] resultado = new Nota[total];

        int atualDireita = 0;
        int atualEsquerda = 0;
        int atual = 0;

        while(atualDireita < direita.length && atualEsquerda < esquerda.length){

            Nota nota1 = direita[atualDireita];
            Nota nota2 = esquerda[atualEsquerda];

            System.out.println("Estou comparando " + nota1.getNome() +
                    " com " + nota2.getNome());

            if(nota1.getValor() < nota2.getValor()){
                resultado[atual] = nota1;
                atualDireita++;
            } else {
                resultado[atual] = nota2;
                atualEsquerda++;
            }
            atual++;
        }

        while(atualEsquerda < esquerda.length){
            resultado[atual] = esquerda[atualEsquerda];
            atual++;
            atualEsquerda++;
        }
        while(atualDireita < direita.length){
            resultado[atual] = direita[atualDireita];
            atual++;
            atualDireita++;
        }

        return resultado;

    }

    private static void intercala(Nota[] A, int inicio, int miolo, int termino){

        Nota[] R = new Nota[termino - inicio];
        int atual = 0;
        int atual1 = inicio;
        int atual2 = miolo;

        if(termino == inicio){
            return;
        } else {

            while(atual1 < miolo && atual2 < termino){
                Nota nota1 = A[atual1];
                Nota nota2 = A[atual2];

                if(nota1.getValor() < nota2.getValor()){
                    R[atual] = nota1;
                    atual1++;
                } else{
                    R[atual] = nota2;
                    atual2++;
                }
                atual++;
            }

            while(atual1 < miolo){
                R[atual] = A[atual1];
                atual1++;
                atual++;
            }

            while(atual2 < termino){
                R[atual] = A[atual2];
                atual2++;
                atual++;
            }

            for(int contador = 0; contador < atual; contador++){
                A[inicio + contador] = R[contador];
            }

        }


    }

    private static void intercalaAlfabeticamente(Nota[] A, int inicio, int miolo, int termino){

        Nota[] R = new Nota[termino - inicio];
        int atual = 0;
        int atual1 = inicio;
        int atual2 = miolo;

        while(atual1 < miolo && atual2 < termino){
            Nota nota1 = A[atual1];
            Nota nota2 = A[atual2];

            if(nota1.getNome().compareTo(nota2.getNome()) < 0){
                R[atual] = nota1;
                atual1++;
            } else{
                R[atual] = nota2;
                atual2++;
            }
            atual++;
        }

        while(atual1 < miolo){
            R[atual] = A[atual1];
            atual1++;
            atual++;
        }

        while(atual2 < termino){
            R[atual] = A[atual2];
            atual2++;
            atual++;
        }

        for(int contador = 0; contador < atual; contador++){
            A[inicio + contador] = R[contador];
        }

    }

    static void ordena(Nota[] A, int inicio, int termino){
        int quantidade = termino - inicio;
        if(quantidade > 1){
            int miolo = (inicio + termino) / 2;
            ordena(A, inicio, miolo);
            ordena(A, miolo, termino);
            intercala(A, inicio, miolo, termino);
        }
    }

    static void ordenaAlfabeticametne(Nota[] A, int inicio, int termino){
        int quantidade = termino - inicio;
        if(quantidade > 1){
            int miolo = (inicio + termino) / 2;
            ordenaAlfabeticametne(A, inicio, miolo);
            ordenaAlfabeticametne(A, miolo, termino);
            intercalaAlfabeticamente(A, inicio, miolo, termino);
        }
    }


}
