import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setCollection {
    public static void main(String[] args) {
        //crear
        Set<String> vocales = new HashSet<>();
        //agregar elementos
        vocales.add("a");
        vocales.add("e");
        vocales.add("i");
        vocales.add("o");
        vocales.add("u");

        //agregar repetidos

        vocales.add("a");

        //recortar
        for (Iterator<String> vocal = vocales.iterator(); vocal.hasNext();){
            String v =vocal.next();
            System.out.println(v);
        }
    }
}
