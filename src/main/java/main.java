public class main {

    /*
    ESTE PROGRAMA BUSCA LITERALMENTE COMO SE INGRESO CADA PALABRA (GRUPO,TITULO),
    PARA CAMBIAR ESTO ES NECESARIO CONVERTIR A MINUSCULAS LAS COSAS QUE SE QUIERAN
    BUSCAR CON UN "cadena.toLowerCase()"

     */
    public static void main(String[] args) {
        String[][] vinilos =new String [100][3];
        agregar_vinilos(vinilos,"Iron Maiden","Iron Maiden","1980");
        agregar_vinilos(vinilos,"Iron Maiden","Killers","1981");
        agregar_vinilos(vinilos,"Iron Maiden","The number of the beast","1982");
        agregar_vinilos(vinilos,"AC-DC","Back in black","1980");
        agregar_vinilos(vinilos,"AC-DC","Highway to Hell","1979");
        agregar_vinilos(vinilos,"AC-DC","Who  made who","1986");
        agregar_vinilos(vinilos,"Judas Priest","British steel","1980");
        agregar_vinilos(vinilos,"Judas Priest","Painkiller","1990");
        agregar_vinilos(vinilos,"Judas Priest","Defenders of the faith","1984");
        agregar_vinilos(vinilos,"Kiss","Destroyer","1976");

        mostrar_cantidad_vinilos(vinilos);
        mostrar_coleccion(vinilos);
        mostrar_busqueda_artista(vinilos,"AC-DC");
        cantidad_espacios_disponibles(vinilos);
        mostrar_busqueda_vinilo(vinilos,"Killers");


    }

    public static void agregar_vinilos(String[][] v, String grupo, String titulo, String año){
        int k= cantidad_vinilos(v);
        if(k<100) {
            v[k][0] = grupo;
            v[k][1] = titulo;
            v[k][2] = año;
        }else{
            System.out.println("vinilos en maxima capcidad");
        }
    }
    
    public static int cantidad_vinilos(String[][] v){
        int k=0;
        while(v[k][0]!=null && v[k][1]!=null && v[k][2]!=null){
            k++;
        }
        return k;
    }

    public static void mostrar_cantidad_vinilos(String[][] v){
        int k=cantidad_vinilos(v);
        System.out.println("Hay un total de: "+k+" vinilos en coleccion");
    }
    
    public static void mostrar_coleccion(String[][] vinilos){
        int cant_vinilos=cantidad_vinilos(vinilos);
        for (int i = 0; i < cant_vinilos; i++) {
            System.out.print("Fila "+(i+1)+": ");
            for (int j = 0; j < vinilos[i].length; j++) {
                System.out.print(vinilos[i][j]+" - ");
            }
            System.out.println(" ");
        }
    }

    public static boolean buscar_artista(String[][] v, String artista){
        int k = cantidad_vinilos(v);
        int i = 0;
        while(i<k){
            if (v[i][0].equals(artista)){//v[i][0]==artista -->eso habia puesto
                return true;
            }
            i++;
        }
        return false;
    }

    public static void mostrar_busqueda_artista(String[][] v, String artista){
        boolean T=buscar_artista(v,artista);
        if(T) {//T == true -->eso habia puesto
            System.out.println("El artista "+artista+" SI esta en la coleccion");
        }else{
            System.out.println("El artista "+artista+" NO esta en la coleccion");
        }
    }

    public static void cantidad_espacios_disponibles(String[][] v){
        System.out.println("Hay un total de: "+(v.length-cantidad_vinilos(v))+" espacios disponibles en la coleccion");
    }

    public static void mostrar_busqueda_vinilo(String[][] v, String titulo){
        boolean T = busqueda_vinilo(v,titulo);
        if (T){//T == true -->eso habia puesto
            System.out.println("El vinilo "+titulo+" SI esta en la coleccion");
        }else{
            System.out.println("El vinilo "+titulo+" NO esta en la coleccion");
        }
    }

    public static boolean busqueda_vinilo(String[][] v, String busqueda){
        int k = cantidad_vinilos(v);
        int i = 0;
        while(i<k){
            if(v[i][1].equals(busqueda)){//v[i][1]==busqueda
                return true;
            }
            i++;
        }
        return false;
    }

}
