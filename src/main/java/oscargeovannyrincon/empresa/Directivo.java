package oscargeovannyrincon.empresa;

import java.util.ArrayList;
import java.util.List;

public class Directivo extends Empleado {

    private String categoria;
    private Empleado[] subordinados;
    private Integer numSubordinados;
    //private List<Empleado> subordinados;
    //si lo hacemos como una lista y no tenemos un numero 
    //finito de adiciones


    /*
     * generacion de un contructor click derecho accion de origen o source code
     * opcion generar contructor
     */

    public Directivo(String nombre, Integer edad, Double salarioBruto, String categoria) {
        super(nombre, edad, salarioBruto);
        this.categoria = categoria;

        subordinados= new Empleado[10];
        numSubordinados=0;
        }

    @Override
    public String mostrar() {
        return super.mostrar() + ", categoria= " + categoria;
    }

    public void addSubordinado(Empleado empleado){
        subordinados[numSubordinados];
        empleado.setJefe(this);
        numSubordinados++;
    }

}
