package dio.com.br;

public class CalculosArea {
    static void area(int lado){
        int resultado = lado * lado;

        System.out.println("O valor da área de um quadrado é " + resultado);
    }

    static void area(int base, int altura){
        int resultado = base * altura;

        System.out.println("O valor da área de um retângulo é " + resultado);
    }

    static void area(int baseMaior, int baseMenor, int altura){
        int resultado = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("O valor da área de um trápezio é " + resultado);
    }

    static void area(float diagonal1, float diagonal2){
        float resultado = (diagonal1 * diagonal2) / 2;

        System.out.println("O valor da área de um losango é " + resultado);

    }
}
