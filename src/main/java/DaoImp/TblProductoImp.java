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
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("ProyectoJPAMaven");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(producto);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.getMessage();
		}finally {
			em.close();
		}
	}

	@Override
	public void eliminarProducto(int id) {
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAMaven");
	    EntityManager em = emf.createEntityManager();
	    try {
	        em.getTransaction().begin();
	        TblProducto producto = em.find(TblProducto.class, id);
	        if (producto != null) {
	            em.remove(producto); // Eliminar el producto
	        } else {
	            System.out.println("Producto no encontrado con ID: " + id);
	        }
	        em.getTransaction().commit();
	    } catch (Exception e) {
	    	e.getMessage();
	    } finally {
	        em.close();
	        emf.close(); 
	    }
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
