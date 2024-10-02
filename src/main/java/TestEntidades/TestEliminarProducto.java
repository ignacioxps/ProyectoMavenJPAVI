package TestEntidades;



import java.util.Date;

import DaoImp.TblProductoImp;
import model.TblProducto;

public class TestEliminarProducto {

	public static void main(String[] args) {
	  TblProducto d = new TblProducto();
	  TblProductoImp pro = new TblProductoImp();

	  int sss= 2;
      pro.eliminarProducto(sss);
	  	  

	}

}
