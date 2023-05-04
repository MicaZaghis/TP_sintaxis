package javaapplication1;
import javaapplication1.Vertice;
import javax.swing.JOptionPane; 
import java.util.Scanner;

/**
 *
 * @author Micaela
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code application logic here
        Vertice vert1= new Vertice();
        vert1.;//(puse privado el atributo)
        vert1.setNombreVertice("Mas");
        //System.out.println(vert1.getNombreVertice());
        vert1.setNumeroVertice(3);
        //System.out.println(vert1.getNumeroVertice());
        
        Vertice vert2=new Vertice();
        vert2.setNombreVertice("hola");
        //System.out.println(vert2.getNombreVertice());
        vert2.setNumeroVertice(10);
        //System.out.println(vert2.getNumeroVertice());
        
        Vertice vert3=new Vertice();
        vert3.setNombreVertice("chau");
        //System.out.println(vert3.getNombreVertice());
        vert3.setNumeroVertice(27);
        //System.out.println(vert3.getNumeroVertice());
        
        Vertice vert4=new Vertice();
        vert4.setNombreVertice("jodete");
        //System.out.println(vert4.getNombreVertice());
        vert4.setNumeroVertice(45);
        //System.out.println(vert4.getNumeroVertice());
        
        Vertice vert5=new Vertice();
        vert5.setNombreVertice("venga");
        //System.out.println(vert5.getNombreVertice());
        vert5.setNumeroVertice(99);
        //System.out.println(vert5.getNumeroVertice());
        
        array_ver[0]=vert1;
        array_ver[1]=vert2;
        array_ver[2]=vert3;
        array_ver[3]=vert4;
        array_ver[4]=vert5;*/
        
        Vertice array_ver[]=new Vertice[5];
     /*   for(int a=0;a<5;a++){
            System.out.println(array_ver[a].getNombreVertice()); 
            System.out.println(array_ver[a].getNumeroVertice());
            //array_ver[a] = null;
        }
    */
/*   check_vertice(array_ver,"YA EXISTE!");
     IsEmpty_Vertices(array_ver);
     Insert_Vertice(array_ver,"SE CREO UN NUEVO VERTICE.");
     Update_Vertice(array_ver,"SE MODIFICO EL VERTICE", 3);
     Delete_Vertice(array_ver, "VERTICE ELIMINADO."); */
     
    Scanner entra = new Scanner(System.in);
    
    System.out.println("Seleccione una opcion:\n");
    System.out.println("1- VERIFICAR EXISTENCIA DE VERTICE\n");
    System.out.println("2- VERIFICAR VERTICES VACIOS\n");
    System.out.println("3- DAR DE ALTA UN VERTICE\n");
    System.out.println("4- MODIFICAR VERTICE\n");
    System.out.println("5- ELIMINAR VERTICE\n");
    
    int seleccion = entra.nextInt();
    
    switch (seleccion){
        case 1:
            check_vertice(array_ver,"ESTE VERTICE YA EXISTE!");
            break;
                
        case 2:
            IsEmpty_Vertices(array_ver);
            break;
        
        case 3: 
            Insert_Vertice(array_ver,"SE CREO UN NUEVO VERTICE.");
            break;   
        case 4: 
            Update_Vertice(array_ver,"SE MODIFICO EL VERTICE", 3);
            break; 
        case 5: 
            Delete_Vertice(array_ver, "VERTICE ELIMINADO");
            break; 
        default:
            System.out.println("OPCION INCORRECTA");
            break; 
    } 
    }
    
    public static boolean check_vertice(Vertice veri_ver[] ,String verificar_vertice){
        for (Vertice veri_ver1 : veri_ver) {
            if (veri_ver1 == null) {
                continue;  
            }
            if (veri_ver1.getNombreVertice().equals(verificar_vertice)) {
                System.out.println("ESTE VERTICE YA EXISTE!");
                return true;
            }
        }
        return false;
    }
    private static boolean IsEmpty_Vertices(Vertice ver_vacio[]){
        for (Vertice ver_vacio1 : ver_vacio) {
            if (ver_vacio1 == null) {
                System.out.println("ESTE VERTICE ESTA VACIO.");
                return true;
            }
        }
     return false;
    }
    private static boolean Insert_Vertice (Vertice nuevo[], String ver_nuevo ){
        for (Vertice nuevo1 : nuevo) {
            if (nuevo1 == null) {
                Vertice nue_ver=new Vertice();
                nue_ver.setNombreVertice(ver_nuevo);
                System.out.println("SE CREO UN NUEVO VERTICE.");
                return true;
            }     
        } 
     return false;
    } 
    
    private static boolean Update_Vertice (Vertice modif_ver[],String vert,
            int num ){
        for (Vertice modif_ver1 : modif_ver) {
            if (modif_ver1 == null) {
                continue;
            }
            if (modif_ver1.getNombreVertice().equals(vert)) {
                modif_ver1.setNumeroVertice(num);
                return true;
            }
        }
     return false;   
}
    private static boolean Delete_Vertice(Vertice eliminar[], String arreglo){
        for(int i=0;i<eliminar.length;i++){
            if(eliminar[i]== null){
                continue;
            }
            if(eliminar[i].getNombreVertice().equals(arreglo)){
                eliminar[i]=null;
                System.out.println("VERTICE ELIMINADO.");
                return true;
            }
        } 
        System.out.println("NO SE ENCONTRO VERTICE.");
    return false; 
    }   
}