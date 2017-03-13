import java.util.ArrayList;
import java.util.Iterator;

public class main{

    public static void main(String arg[]){
        ArrayList<String> lista = new ArrayList();

        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");
        lista.add("6");
        lista.add("7");
        lista.add("8");
        lista.add("9");

        System.out.println("lista original: ");
        Iterator itr= lista.iterator();

        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element);
        }

    }
}