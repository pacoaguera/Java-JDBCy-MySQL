package tienda.persistencia;

import tienda.entidades.Producto;

public final class ProductoDao extends Dao {

    //Lista el nombre de 1 producto que hay en la tabla producto por codigo de producto
    public Producto buscarProducto(int codigo) throws Exception {
        
        try {
            String sql = "SELECT codigo , nombre FROM producto WHERE codigo = '" + codigo + "'";
            consultarBase(sql);
            
            Producto pro1 = null;
            
            while (resultado.next()) {
                
                pro1 = new Producto();                
                
                pro1.setCodigo(resultado.getInt(1));
                
                pro1.setNombre(resultado.getString(2));
                
            }
            desconectarBase();
            
            return pro1;
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
            
            desconectarBase();
            throw e;
            
        }
        
    }
    
}
