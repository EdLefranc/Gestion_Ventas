/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

/**
 *
 * @author Ed Le Franc
 */
public class AlmacenData {
    
    /*
    
    
    import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    private Connection conexion;

    // Constructor que establece la conexión a la base de datos
    public ProductoDAO() {
        // Código para establecer la conexión
    }

    public List<Producto> listarProductos() {
        List<Producto> listaProductos = new ArrayList<>();
        try {
            // Crear la consulta SQL
            String consulta = "SELECT * FROM productos";
            // Ejecutar la consulta
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            // Recorrer los resultados y crear objetos Producto
            while (rs.next()) {
                int id = rs.getInt("idProducto");
                String nombre = rs.getString("nombre");
                // Obtener otros atributos si existen
                Producto producto = new Producto(id, nombre);
                listaProductos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar excepciones, loggear o lanzar excepciones personalizadas
        }
        return listaProductos;
    }

    public Producto buscarProducto(int idProducto) {
        Producto producto = null;
        try {
            // Crear la consulta SQL para buscar un producto por su ID
            String consulta = "SELECT * FROM productos WHERE idProducto = ?";
            // Preparar la consulta con un PreparedStatement
            PreparedStatement pstmt = conexion.prepareStatement(consulta);
            pstmt.setInt(1, idProducto);
            // Ejecutar la consulta
            ResultSet rs = pstmt.executeQuery();
            // Verificar si se encontró el producto
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                // Obtener otros atributos si existen
                producto = new Producto(idProducto, nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar excepciones
        }
        return producto;
    }

    public void guardarProducto(Producto producto) {
        try {
            // Crear la consulta SQL para insertar un nuevo producto
            String consulta = "INSERT INTO productos (nombre) VALUES (?)";
            // Preparar la consulta con un PreparedStatement
            PreparedStatement pstmt = conexion.prepareStatement(consulta);
            pstmt.setString(1, producto.getNombre());
            // Ejecutar la consulta
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar excepciones
        }
    }

    public void modificarProducto(Producto producto) {
        try {
            // Crear la consulta SQL para actualizar un producto
            String consulta = "UPDATE productos SET nombre = ? WHERE idProducto = ?";
            // Preparar la consulta con un PreparedStatement
            PreparedStatement pstmt = conexion.prepareStatement(consulta);
            pstmt.setString(1, producto.getNombre());
            pstmt.setInt(2, producto.getId());
            // Ejecutar la consulta
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar excepciones
        }
    }

    public void eliminarProducto(int idProducto) {
        try {
            // Crear la consulta SQL para eliminar un producto por su ID
            String consulta = "DELETE FROM productos WHERE idProducto = ?";
            // Preparar la consulta con un PreparedStatement
            PreparedStatement pstmt = conexion.prepareStatement(consulta);
            pstmt.setInt(1, idProducto);
            // Ejecutar la consulta
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar excepciones
        }
    }
}

    
    
    */
    
}
