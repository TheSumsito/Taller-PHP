/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import modelo.conexion.conexion;
import modelo.entidades.empleado;

/**
 *
 * @author mjara
 */
public class daoControlador {
    
    Connection conexion;

    public daoControlador() {
    }
    
    public boolean AgregarEmpleado(empleado emp) throws SQLException{
        boolean respuesta = false;
        try {
            this.conexion = new conexion().obtenerConexion();
            String AgregarEmpleado = "{ CALL SP_AGREGAR_EMPLEADO (?,?,?,?) }";
            CallableStatement cstmt = this.conexion.prepareCall(AgregarEmpleado);
            cstmt.setString(1, emp.getRut());
            cstmt.setString(2, emp.getNombre());
            cstmt.setString(3, emp.getApellido());
            cstmt.setInt(4, emp.getEdad());
            
            if (cstmt.executeUpdate()>0) {
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return respuesta;
    }
    
}
