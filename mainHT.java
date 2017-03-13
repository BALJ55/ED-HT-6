import java.util.*;


public class mainHT {

    public static void main(String[] args) {
        boolean error = true;
        Scanner scan = new Scanner(System.in);
        while(error){
            try{
                System.out.println("Por favor ingrese de lista que quiere usar ('HashSet', 'TreeSet', 'LinkedHashSet')");
                String type = scan.next();

                boolean addnew=true;

                factory ListFactory = new factory();

                Object web = ListFactory.getList(type);
                Object java = ListFactory.getList(type);
                Object cel = ListFactory.getList(type);
                int webc=0;
                int javac=0;
                int celc=0;

                while(addnew){
                    System.out.println("Desea agregar otro desarrollador? 'S/N'");
                    String dev = scan.next();
                    if(dev=="S"){
                        System.out.println("Ingrese el nombre del desarrollador");
                        dev = scan.next();
                        System.out.println("Ingrese el tipo de desarrollador:");
                        System.out.println("1) dessarrollador web");
                        System.out.println("2) dessarrollador java");
                        System.out.println("3) dessarrollador celulares");
                        String tipo = scan.next();
                        if(tipo.contains("1")){  web.add(dev);webc++;}
                        if(tipo.contains("2")){java.add(dev);javac++;}
                        if(tipo.contains("3")){cel.add(dev);celc++;}
                    }else{addnew=false;}
                }




            }catch (exception E){
                System.out.println("usted ingresó algo arroneo");
                error=true;
            }
        }



    }
}