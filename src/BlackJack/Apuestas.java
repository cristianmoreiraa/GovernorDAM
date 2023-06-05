package BlackJack;



public class Apuestas {
    /*
     * La clase Apuestas representa un sistema de apuestas donde se pueden realizar diferentes acciones
     * como ganar, perder o empatar.
     */
        /**
         * Constructor por defecto de la clase Apuestas.
         */
        public Apuestas (){

        }

        /**
         * Método para indicar que se ha ganado la apuesta.
         *
         * @return La cadena de texto "\nHas ganado\n" indicando que se ha ganado la apuesta.
         */
        public String ganar() {
            return ("\nHas ganado\n");
        }

        /**
         * Método para indicar que se ha perdido la apuesta.
         *
         * @return La cadena de texto "\nHas perdido\n" indicando que se ha perdido la apuesta.
         */
        public String perder(){
            return ("\nHas perdido\n");
        }

        /**
         * Método para indicar que la apuesta ha resultado en un empate.
         *
         * @return La cadena de texto "\nHabéis empatado\n" indicando que se ha producido un empate.
         */
        public String empatar(){
            return ("\nHabéis empatado\n");
        }
    }

