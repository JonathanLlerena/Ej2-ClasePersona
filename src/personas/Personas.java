/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

public class Personas {
    private String Nombre;
    private String Apellido;
    int Edad;
    boolean Estatura;

    public Personas() {
    }

    public Personas(String Nombre, String Apellido, int Edad, boolean Estatura) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Estatura = Estatura;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public boolean isEstatura() {
        return Estatura;
    }

    public void setEstatura(boolean Estatura) {
        this.Estatura = Estatura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public static void main(String[] args) {
        
    }
}
