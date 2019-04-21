package mx.edu.ittepic.tpdm_u3_practica1_delarosaguerrerogabriela;

public class Alumnos {
    String nc, nombre, apellidos, carrera;

    public Alumnos(String nc, String nombre, String apellidos, String carrera){
        this.nc = nc;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
    }

    public Alumnos(){

    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
