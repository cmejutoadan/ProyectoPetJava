package Modelos;

import javax.swing.table.AbstractTableModel;
/**
 *
 * @author cmejuto
 */
import Conexion.ConectaBD;
import Objetos.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloUsuario extends AbstractTableModel {

    //declaramos objetos que vamos a necesitar
    Statement stm;
    ResultSet rs;
    ConectaBD cbd;

    //declaramos arraylist
    ArrayList<User> aUser;

    //constructor
    public ModeloUsuario() throws SQLException {
        cbd = new ConectaBD();//conecto la base de datos
        //inicializamos el arraylist
        aUser = new ArrayList();
        //llamamos a refrescar
        refrescarDatos();

    }

    public void refrescarDatos() { //very important - se ejecuta al hacer una modificación. 
        try {
            stm = cbd.getConn().createStatement();
            rs = stm.executeQuery("select * from usuario");
            aUser.clear();
            while (rs.next()) {
                /*int id, 
                 String unombre, 
                 int tlf, 
                 String direccion, 
                 String provincia, 
                 String user, 
                 String pass*/

                // ojo con la instanciación del objeto de la clase User
                aUser.add(new User(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
            fireTableDataChanged();//internamente método del abstracttablemodel que comprueba si los datos cambian y redibuja la tabla
            rs.close();
            stm.close();

        } catch (SQLException ex) {
        }
    }

    @Override
    public int getRowCount() {
        return aUser.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    //método para rellenar la tabla
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return aUser.get(rowIndex).getId();
        } else if (columnIndex == 1) {
            return aUser.get(rowIndex).getUnombre();
        } else if (columnIndex == 2) {
            return aUser.get(rowIndex).getTlf();
        } else if (columnIndex == 3) {
            return aUser.get(rowIndex).getMail();
        } else if (columnIndex == 4) {
            return aUser.get(rowIndex).getDireccion();
        } else if (columnIndex == 5) {
            return aUser.get(rowIndex).getProvincia();
        } else if (columnIndex == 6) {
            return aUser.get(rowIndex).getUser();
        } else {
            return aUser.get(rowIndex).getPass();
        }
    }

    //método para dar nombre a las columnas
    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "ID";
        } else if (column == 1) {
            return "NOMBRE";
        } else if (column == 2) {
            return "TELEFONO";
        } else if (column == 3) {
            return "CORREO-E";
        } else if (column == 4) {
            return "DIRECCIÓN";
        } else if (column == 5) {
            return "PROVINCIA";
        } else if (column == 6) {
            return "USUARIO";
        } else {
            return "CONTRASEÑA";

        }
    }

}
