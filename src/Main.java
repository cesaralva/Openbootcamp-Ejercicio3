public class Main {
    public static void main(String[] args) {



        int resultado = 0;
        resultado = suma(3, 4, 5);
        //void solo muestra el resultado
        //int llama ala funcion en la variable
        System.out.println(resultado);

        coche micoche = new coche();
        micoche.poner_puerta();
        System.out.println(micoche.n_puertas);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;

    }


}

class coche {
    public int n_puertas = 4;

    public void poner_puerta() {
        this.n_puertas++;
    }
}