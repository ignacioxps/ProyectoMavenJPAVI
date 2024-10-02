package TestEntidades;



import java.util.Date;

import DaoImp.TblProductoImp;
import model.TblProducto;

public class TestActualizarProducto {

	public static void main(String[] args) {
	  TblProducto d = new TblProducto();
	  TblProductoImp pro = new TblProductoImp();
	  d.setCantidad(123);
	  Date fecha = new Date();
	  d.setIdproducto(3);
	  Date fechasql= new Date(fecha.getTime());
	  d.setFechaven(fechasql);
	  d.setNomprod("azucar blanca");
	  d.setNrolote("23");
	  d.setTotal(233.2);
	  d.setPrecio(23.23);
	  d.setCodbarras("21321");
	  pro.actualizarProducto(d);
	  System.out.println("Producto Actualizado Correctamente");
	  

	}

}
