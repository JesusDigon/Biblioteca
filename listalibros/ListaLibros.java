package listalibros;

/**
 * Lista de libro de una biblioteca
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaLibros
{
   
	Libro primero;
    Libro siguiente;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
       
        primero = null;
        siguiente = null;
    }

   
    // Completar los metodos
    
    // Incluye un nuevo libro en la lista
    public void pon( Libro valor){
        Libro nuevo = valor;
        	nuevo.siguiente=primero;
        	primero= nuevo;
           	
      
        	
        }
        


    
    public boolean estaVacia(){
       return ( primero == null );    
        
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar ( int id ) {
    	
    	Libro resultado=null;
    	
    	if(!estaVacia()) {
    	Libro aux= primero;
    	Libro aux2=primero.siguiente;
    	if(primero.id==id) {
    		primero=primero.siguiente;
    		resultado=aux;
    		}else {
    	while (aux!=null) {
    		aux=aux.siguiente;
    		aux2=aux2.siguiente;
    		if(aux.id==id) {
    			aux=aux2;
    			aux2=aux2.siguiente;
    			resultado=aux;
    		}
    	}
    		}
    	
    	
    	}else {
    		
    	}return resultado;
    		
    }

   
    // Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){
    	int resultado=-1;
    	Libro aux=primero;
    	
    	while(aux!=null) {
    	if(aux.titulo.equals(titulo)) {
    		resultado= aux.id;
    	}
    		aux=aux.siguiente;
    	
    	
    	}
        return resultado;
   }
    // Muestra los libros almacenados
    public void verCatalogo (){
    	Libro aux= primero;
    	while (aux!=null) {
    		System.out.println(aux.toString());
    		aux=aux.siguiente;
    }
    }
         
    

}
