package project4;

/**
 * Esta interface tendra  los entregar(),devolver(),isEntregado(),compareTo(Object a)
 *
 * @author Duvan Botero
 */
public interface IEntregable {

    public void entregar();

    public void devolver();

    public boolean isEntregado();

    public int compareTo(Object a);

}
