package Project2;

/**
 * Esta clase contiene  atributos como: nombre, edad, DNI, sexo , peso y altura
 * ademas contiene varios constructores:
 * Un constructor por defecto.
 * Un constructor con el nombre, edad y sexo, el resto por defecto.
 * Un constructor con todos los atributos como parámetro.
 * Los métodos que tendra son:calcularIMC(),MayorDeEdad(),toString(),generaDNI(),comprobarSexo()
 *
 * @author Duvan Botero
 */

public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private String DNI;
    private char sexo;
    private double altura;
    private final static char sexo_Def = 'H';
    public static final int bajo_Peso = -1;
    public static final int peso_Ideal = 0;
    public static final int sobre_Peso = 1;

    /**
     * definicion de un constructor por defecto
     */
    public Persona() {
        this("", 0, sexo_Def, 0, 0);
    }

    /**
     * definicion de un constructor con los parametros
     * @param nombre
     * @param edad
     * @param sexo
     */
    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 60, 1.78);
    }

    /**
     * Un constructor con todos los atributos como parámetro
     * @param nombre
     * @param edad
     * @param sexo
     * @param peso
     * @param altura
     */

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        generarDni();
        comprobarSexo();
    }

    /**
     * indica  si la persona es mayor de edad, devuelve un booleano.
     * @return
     */
    public boolean MayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    /**
     * comprueba que el sexo introducido es correcto. Si no es correcto, sera sexo_Def.
     */
    private void comprobarSexo() {

        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexo_Def;
        }
    }

    /**
     *  genera un número aleatorio de 8 cifras, con Math.random
     *  genera a partir de este su número su letra correspondiente
     */
    private void generarDni() {
        final int divisor = 23;
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        char letraDNI = generaLetraDNI(res);

        DNI = Integer.toString(numDNI) + letraDNI;
    }

    /**
     * Metodo que me genera la letra del DNI
     * @param res
     * @return
     */
    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
    }

    /**
     *Metodos set para los atributos de la clase
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * Metodo que calculara si la persona está en su peso ideal
     * @return
     */
    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            return peso_Ideal;
        } else if (pesoActual < 20) {
            return bajo_Peso;
        } else {
            return sobre_Peso;
        }
    }

    /**
     * Metodo que devuelve toda la información del objeto.
     * @return
     */
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "muestraPeso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
}
