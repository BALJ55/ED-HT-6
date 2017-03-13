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

                AbstractSet web = ListFactory.getList(type);
                AbstractSet java = ListFactory.getList(type);
                AbstractSet cel = ListFactory.getList(type);
                int webc=0;
                int javac=0;
                int celc=0;

                while(addnew){
                    System.out.println("Desea agregar otro desarrollador? '1/0'");
                    int ynn = scan.nextInt();
                    if(ynn==1){
                        System.out.println("Ingrese el nombre del desarrollador");
                        String dev = scan.next();
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


                System.out.println("cantidad de desarrolladores web: "+webc);
                System.out.println("cantidad de desarrolladores java: "+javac);
                System.out.println("cantidad de desarrolladores celular: "+celc);
                System.out.println("Desarrolladores web: "+web);
                System.out.println("Desarrolladores java: "+java);
                System.out.println("Desarrolladores celular: "+cel);


                System.out.println("Saliendo...");
                error=false;




            }catch (Exception E){
                System.out.println("usted ingresó algo arroneo");
                error=true;
            }
        }



    }
}