package Coso;
public class Funciones {
      //Funcion para comprobar los usuarios de la página
    public String ingreso (int pos1){
        String[] usuario = {"Alonso Uicab", "Luis Salomon", "Joshua Rivera", "Christopher Segovia"};
        System.out.println("Bienvenido "+ usuario[pos1] + " a la página web");
        return usuario [pos1];
    }
    //Función para checar el catálogo de la página
    public String catalogo(int posicion){
        String [] obj = {"Laptops", "Tarjetas de videos", "Procesadores", "Computadoras completas", "Tarjetas Madre", "Memorias Ram", "Discos Duro", "Enfriamientos", "Gabinetes",
                            "Fuentes de poder"};
        System.out.println("Le mostramos la gran variedad de " + obj [posicion] + " que disponemos");
        return obj [posicion];
    }
  
}
