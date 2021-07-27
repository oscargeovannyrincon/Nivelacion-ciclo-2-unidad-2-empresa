package oscargeovannyrincon.empresa;

public abstract class Persona {

    // declaracion de atributos de la clase
    private String nombre;// atributos
    private Integer edad;

    /*
     * para poder inicializar los objetos utilizo un contructor IMPORTANTE!!! ES UN
     * METODO CON EL MISMO NOMBRE DE LA CLASE PERO NO DEVUELVE NINGUN VALOR
     */
    public Persona(String nombre, Integer edad ) {// CONSTRUCTOR
        this.nombre = nombre;
        this.edad = edad;

    }

    // declaracion metodos de la clase
    public String mostrar() {// METODO
        return String.format("nombre= %s, edad= %d", nombre, edad);
    }

}
