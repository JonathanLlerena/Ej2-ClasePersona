/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

public class Ciudadano extends Personas{
    int CI;
    private String Nombre;
    private String Apellido;
    private String Profesion;
    private String Direccion;
    private String Telefono;

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
}
