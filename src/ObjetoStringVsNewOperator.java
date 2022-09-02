public class ObjetoStringVsNewOperator {
    public static void main(String[] args) {

        //Declarando objetos del tipo de la clase String
        String curso="Programación en Java";
        String curso2 = new String("Programación en Java");

        //Comparando por referencia
        boolean esIgual = curso==curso2;
        System.out.println("curso==curso2 = " + esIgual);

        //Comparando por el valor de las variables con el método equals
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);
        
        //Comparando por el valor con el metodo .equalsIgnoreCase que ignora diferencias de mayusculas y minusculas
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        //Como ya se creo arriba un objeto de forma literal con ese valor java asigna la referencia para optimizar TRUE
        String curso3 = "Programación en Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}
