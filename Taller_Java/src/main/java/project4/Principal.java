package project4;

public class Principal {
    public static void main(String[] args) {
        Serie series[] = new Serie[5];
        Videojuego juego[] = new Videojuego[5];
        series[0] = new Serie("la diosa", 12, "comedia", "robinson");
        series[1] = new Serie("dios", 12, "terror", "marlon");
        series[2] = new Serie("la selva", "maria");
        series[3] = new Serie("calamar", "japonini");
        series[4] = new Serie("pablo escobar", 85, "violencia", "caracol");
        juego[5] = new Videojuego("futbol", "konami", 10, "deporte");
        juego[6] = new Videojuego("the witcher", "red studio", 300, "RPG");
        juego[7] = new Videojuego("Fifa Street", 12);
        juego[8] = new Videojuego("call of duty", 700);
        juego[9] = new Videojuego("free fire", 600);


    }
}