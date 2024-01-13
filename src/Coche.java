public class Coche {


    private boolean esDescapotable;


    private String color;


    private String marca;


    private String modelo;


    private String matricula;


    public int numeroPuertas;


    public Coche(boolean esDescapotable, String marca, String modelo, String color,
                 int numeroPuertas, String matricula) {
        this.esDescapotable = esDescapotable;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.matricula = matricula;

    }
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public  void  imprimirDetalles (){
        System.out.println("Es descapotable?" + esDescapotable);
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Color:" + color);
        System.out.println("Puertas:" + numeroPuertas);
        System.out.println("Matricula:" + matricula);
        System.out.println();
    }

}
