package Modelos;

import Conexion.ConectaBD;
import Objetos.Pet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author cmejuto
 */
public class ModeloMascota extends AbstractTableModel {

    //declaramos las variables
    Statement stm;
    ResultSet rs;
    ConectaBD cbd;
    String usuario;
    private int ncolum;
    //declaramos un arrayList para guardar los animales
    ArrayList<Pet> amascota;
    
    
    public ModeloMascota(int ncolum) throws SQLException{ //este contructor lo utilizamos para el panel de administrador
        cbd = new ConectaBD();//conecto la base de datos
        this.ncolum = ncolum; 
        //inicializamos el arraylist
        amascota = new ArrayList();
        //llamamos a refrescarTabla que actualiza los datos
        refrescarTabla();
    }

    public ModeloMascota(String usuario, int ncolum) throws SQLException { //este constructor lo utilizamos para la pantalla usuario
        this.usuario = usuario;
        this.ncolum = ncolum;
        //dentro del constructor inicializamos los objetos
        amascota = new ArrayList();
        cbd = new ConectaBD();   
        //llamamos a refrescar por si hay datos en la tabla
        refrescar();
    }

    public void refrescar() { //very important - se ejecuta al hacer una modificación. 
 
        try {
            stm = cbd.getConn().createStatement();
            rs = stm.executeQuery("select * from mascota where usuario = '" + usuario + "'");
            amascota.clear();
            while (rs.next()) {
                // ojo con la instanciación del objeto
                amascota.add(new Pet(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6)));
            }
            fireTableDataChanged();//internamente método del abstracttablemodel que comprueba si los datos cambian y redibuja la tabla
            rs.close();
            stm.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
        public void refrescarTabla() { //very important - se ejecuta al hacer una modificación. 
        try {
            stm = cbd.getConn().createStatement();
            rs = stm.executeQuery("select * from mascota");
            amascota.clear();
            while (rs.next()) {
                // ojo con la instanciación del objeto
                amascota.add(new Pet(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6)));
            }
            fireTableDataChanged();//internamente método del abstracttablemodel que comprueba si los datos cambian y redibuja la tabla
            rs.close();
            stm.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public int getRowCount() {
        return amascota.size();
    }

    @Override
    public int getColumnCount() {
        return ncolum;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return amascota.get(rowIndex).getId();
        } else if (columnIndex == 1) {
            return amascota.get(rowIndex).getNombre();
        } else if (columnIndex == 2) {
            return amascota.get(rowIndex).getChip();
        } else if (columnIndex == 3) {
            return amascota.get(rowIndex).getEspecie();
        } else if (columnIndex == 4){
             return amascota.get(rowIndex).getRaza();
        } else {
           return amascota.get(rowIndex).getIdU();
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
            return "CHIP";
        } else if (column == 3) {
            return "ESPECIE";
        } else if (column == 4) {
            return "RAZA";
        } else {
            return "USUARIO";
        }
    }
}
