package TestEntidades;



import java.util.Date;

import DaoImp.TblProductoImp;
import model.TblProducto;

public class TestAgregarProducto {

	public static void main(String[] args) {
	  TblProducto d = new TblProducto();
	  TblProductoImp pro = new TblProductoImp();
	  d.setCantidad(123);
	  Date fecha = new Date();
	  
	  Date fechasql= new Date(fecha.getTime());
	  d.setFechaven(fechasql);
	  d.setNomprod("azucar rubia");
	  d.setNrolote("23");
	  d.setTotal(233.2);
	  d.setPrecio(23.23);
	  d.setCodbarras("21321");
	  pro.registrarProducto(d);
	  

	}

}
