package ParadigmaFuncional;

public class Exemplo1 {

    //vamos falar sobre recursao agora!
    public static int recursaoTesteUm(int n){
        /*toda função recursiva deve ter um caso base
        uma condição que quando atingida encerre o programa(para evitar stackOverFlow)
         */
        if(n > 3){ //caso base
            return n;
        }
        //caso o caso base não seja executado a função se chamará recursivamente até atingilo
        return recursaoTesteUm(n + 1);//caso recursivo
    }

    public static void main(String[] args) {

        /*no caso da nossa função(metodo) ela somara 1 a n até que n seja maior que 3
        caso n já seja maior que 3 ela devolve n.
         */
        int resultadoDaRecurcao = recursaoTesteUm(1);
        System.out.println(resultadoDaRecurcao);
    }
}
