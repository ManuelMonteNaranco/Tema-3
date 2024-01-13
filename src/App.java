public class App {
    public static void main(String[] args) {
// es para decir que vas a crear un objeto del tipo del Coche y va drecto a la clase Coche  asu constructor que es como un public coche
        //va a cambiar aqui el nombre Coche del obejto en coche para una variable.
        Coche ibiza =
                new Coche(false, "Seat","Ibiza","Blanco", 3, 1234 + "JYT");
        Coche Ford =
                new Coche(false, "Ford","Fiesta","Rojo", 3, 1256 + "JkT");
        Coche Alpine =
                new Coche(true, "Renault","Alpine","Azul", 2, 3333 + "FAD");
        Coche Opel =
                new Coche("Opel" ,"Corsa");
        Opel.numeroPuertas = 7 ;{
        }

        Opel.imprimirDetalles();
        ibiza.imprimirDetalles();
        Ford.imprimirDetalles();
        Alpine.imprimirDetalles();


    }

}
