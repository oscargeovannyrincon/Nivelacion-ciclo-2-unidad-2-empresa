package oscargeovannyrincon.empresa;

public class Empleado extends Persona {

    private Double salarioBruto;//atributo
    private Directivo jefe;

    public Empleado(String nombre, Integer edad, Double salarioBruto) {
        super(nombre, edad);
        this.salarioBruto = salarioBruto;
    }
    /*sobreescribir el metodo mostrar para impirmir el salario
    click derecho, accion de origen o source code, override*/
    @Override
    public String mostrar() {
        // TODO Auto-generated method stub
        return super.mostrar()+", sueldo= "+salarioBruto;
    }


    
    public void setJefe(Directivo jefe) {
        this.jefe = jefe;
    }
    


    
    
}
