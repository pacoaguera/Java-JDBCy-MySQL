
package tienda;

import tienda.persistencia.ProductoDao;
import tienda.servicios.Servicios;


public class TiendaMain  {

    
    public static void main(String[] args) throws Exception {
        
        ProductoDao pd = new ProductoDao();
        
        
        try {
             Servicios nc = new Servicios(pd);            
        
        nc.BuscarProductoPorCodigo();
        } catch (Exception e) {
           
        }
        
    }
    
}
