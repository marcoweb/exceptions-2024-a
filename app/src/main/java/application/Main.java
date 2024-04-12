package application;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        int[] vetor = {20, 30, 40, 50};

        try {
            for(int cont = 0; cont < 4;cont++) {
                System.out.println(vetor[cont]);
            }
            //throw new Exception("Forçando a Barra");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Índice do do vetor incorreto");
        } catch (Exception ex) {
            System.out.println("Falhou");
        } finally {
            System.out.println("Encerramento");
        }
    }
}

