package com.sofka.project1.project4;

public class Videojuego implements IEntregable {
    String titulo;
    boolean entregado = false;
    String compania;
    int horasEstimadas;
    String genero;
    public static final int horasEstimadas_Def = 10;

    public Videojuego() {
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, String compania, int horasEstimadas, String genero) {
        this.titulo = titulo;
        this.compania = compania;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public void isEntregado() {
        System.out.println(entregado);

    }

    @Override
    public void compareTo(Object a) {

    }

    public int calcularHoras(Videojuego juego[]) {
        int horas = 0;
        int posicion = 0;
        for (int i = 0; i < juego.length; i++)
            if (juego[i].horasEstimadas > horas) {
                posicion = i;
                horas = juego[i].horasEstimadas;
            }
        System.out.println("El Videojuego con más horas estimadas es: ");
        System.out.println(juego[posicion].titulo + " con: " + juego[posicion].horasEstimadas + " horas estimadas");

        return horas;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", entregado=" + entregado +
                ", compania='" + compania + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", genero='" + genero + '\'' +
                '}';
    }
}
