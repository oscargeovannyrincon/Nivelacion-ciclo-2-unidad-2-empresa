package oscargeovannyrincon.empresa;

public class Cliente extends Persona  {

    private String telefonoContacto;
    

    public Cliente(String nombre, Integer edad, String telefonoContacto) {
        super(nombre, edad);
        this.telefonoContacto = telefonoContacto;
    }


    @Override
    public String mostrar() {
        // TODO Auto-generated method stub
        return super.mostrar()+", numero de contacto= "+telefonoContacto;
    }
    
    
    
}
