package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProducto;

public class TblProductoImp implements IProducto{

	@Override
	public void registrarProducto(TblProducto producto) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("ProyectoJPAMaven");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(producto);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
		
	}

	@Override
	public void actualizarProducto(TblProducto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProducto(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblProducto> listarProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TblProducto buscarProducto(TblProducto producto) {
		// TODO Auto-generated method stub
		return null;
	}

}
