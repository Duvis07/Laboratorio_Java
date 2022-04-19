package project4;

/**
 * Esta es una super clase que permite
 *
 * @author Duvan Botero, duvanarleybotero@gmail.com
 * @version 1.0.0
 */
public class Serie implements IEntregable {
    String titulo;
    int numeroTemporadas;
    boolean entregado = false;
    String genero;
    String creador;
    public static final int Temporadas_def = 3;

    /**
     * definicion  de un constructor por defecto
     */
    public Serie() {

    }

    /**
     * Este es un metodo constructor que recibe 2 atributos como parametro
     *
     * @param titulo
     * @param creador
     */
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    /**
     * Este es un metodo constructor que recibe 4 atributos como parametro
     *
     * @param titulo
     * @param numeroTemporadas
     * @param genero
     * @param creador
     */
    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.genero = creador;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
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
}
