package ParadigmaFuncional;

public class ExemploFatorial {

    //vamos criar uma função que calcule o fatorial de um numero:
    /*um numero fatorial é igual a ele multiplicado pelos seus antecessores positivos até 1,
     n * n-1 sucessivamente até chegar a 2 * 1;
     */
    public static int fatorial(int n){
    //no caso base caso n seja igual a 1 ele será mutiplicado com 1 e encerrará o programa;
        if (n <= 1){
            return 1;
        }
    //caso o contrario o numero será multiplicado por ele -1 recursivamente;
        return n * fatorial(n-1);//essa parte fatorial(n-1) assume o valor do fatorial -1;
    }

    public static void main(String[] args) {
        int num = fatorial(5);
        System.out.println(num);//120
    }
}
