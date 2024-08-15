public class App {
  public static void main(String[] args) throws Exception {
    String texto = "      Este es un texto asignado a una variable String     ";
    System.out.println(texto);

    /* Longitud de string */
    int longitud = texto.length();
    System.out.println(longitud);

    /* Un caracter de string */
    char caracter = texto.charAt(0);
    System.out.println(caracter);

    /* Corta un pedazo de string */
    String subString = texto.substring(5, 16);

    System.out.println(subString);

    /* Todo minuscula */
    String textminuscula = texto.toLowerCase();
    System.out.println(textminuscula);

    /* Todo masyuscula */
    String textoMayuscula = texto.toUpperCase();
    System.out.println(textoMayuscula);

    /* Indice de algo */
    int indice = texto.indexOf("variable");
    System.out.println(indice);

    /* Remplazar */
    String remplazo = texto.replace("texto", "parrafo");
    System.out.println(remplazo);

    /* Contiene */
    boolean contiene = texto.contains("asignado");
    System.out.println("Tiene la palabra asignado ?" + contiene);

    /* Elimina espacios */
    String sinEspacios = texto.trim();
    System.out.println(sinEspacios);
  }
}