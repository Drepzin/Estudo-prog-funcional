package ParadigmaFuncional;

public class ExemploFuncoesComoParametro {

    public static int retornaNum(int n){
        return n;
    }

    public static int dobro(int n, int x){
        return n * x;
    }

    public static void main(String[] args) {
        //uma função recebendo outra função como parametro
        System.out.println(dobro(retornaNum(10), 5));
    }
}
