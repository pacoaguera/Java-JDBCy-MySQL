package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDao;

public class Servicios {

    private ProductoDao dao;

    public Servicios(ProductoDao dao) {
        this.dao = dao;
    }

    public void BuscarProductoPorCodigo() throws Exception {

        try {
            System.out.println("ingrese el codigo del producto");
            Scanner leer = new Scanner(System.in);

            int codigo = leer.nextInt();

            Producto p1 = dao.buscarProducto(codigo);

            dao.buscarProducto(codigo);
            
            System.out.println(p1.getNombre());

        } catch (Exception e) {
            throw e;
        }

    }
//hola
}
