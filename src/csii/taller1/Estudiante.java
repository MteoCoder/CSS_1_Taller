/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csii.taller1;

/**
 *
 * @author Asus PC
 */
public class Estudiante {
    private int codigo;
    private String nombre;
    private int edad;
    private int semestre;
    private double promedio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Estudiante(int codigo, String nombre, int edad, int semestre, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public int calcularSemestresFaltantes() {
        int semestresF = 10 - semestre;
        return semestresF;
    }

    public double calcularedadgraduacion() {

        double edadGraduacion = edad;
        int semestresF = 10 - semestre;

        for (int K = 0; K < semestresF; K++) {
            edadGraduacion = edadGraduacion + 0.5;
        }
        return edadGraduacion;
    }

    public static Estudiante mejorPromedio(Estudiante[] ListaE) {

        Estudiante mayor = ListaE[0];

        for(int I = 0; I < ListaE.length; I++) {
            if (ListaE[I].getPromedio() > mayor.getPromedio()) {
                mayor = ListaE[I];
            }
        }
        return mayor;
    }

    @Override
    public String toString() {
        String salida = "Codigo: " + Integer.toString(codigo) + ", "
                + "Nombre: " + nombre + ", " + "Edad: " + Integer.toString(edad)
                + ", " + "Semestre: " + Integer.toString(semestre) + ", "
                + "promedio: " + Double.toString(promedio) + "\n";

        return salida;
    }
}
