package Interfaces;

import model.TblProducto;

import java.util.List;

public interface IProducto {
    void registrarProducto(TblProducto producto);
    void actualizarProducto(TblProducto producto);
    void eliminarProducto(int id);
    List<TblProducto> listarProductos();
    TblProducto buscarProducto(TblProducto producto);
}