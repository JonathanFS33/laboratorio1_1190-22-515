package logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jonathan
 */
public class Gasolinera {
    
    public ArrayList<DatosReporte> reportes = new ArrayList();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    private int bombaSuper = 10000;
    private int bombaRegular = 9000;
    private int bombaDiesel = 10000;
    
    public int getBombaSuper() {
        return bombaSuper;
    }

    public void setBombaSuper(int bombaSuper) {
        this.bombaSuper = bombaSuper;
    }

    public int getBombaRegular() {
        return bombaRegular;
    }

    public void setBombaRegular(int bombaRegular) {
        this.bombaRegular = bombaRegular;
    }

    public int getBombaDiesel() {
        return bombaDiesel;
    }


    public void setBombaDiesel(int bombaDiesel) {
        this.bombaDiesel = bombaDiesel;
    }
    
    public void agregarSuper(int gas){
        this.bombaSuper += gas;
        System.out.println(this.bombaSuper);
    }
    public void agregarRegular(int gas){
        this.bombaRegular += gas;
        System.out.println(this.bombaRegular);
    }
    public void agregarDiesel(int gas){
        this.bombaDiesel += gas;
    }
    
    public void venderSuper(int gas){
        this.bombaSuper -= gas;
        System.out.println(this.bombaSuper);
    }
    public void venderRegular(int gas){
        this.bombaRegular -= gas;
        System.out.println(this.bombaRegular);
    }
    public void venderDiesel(int gas){
        this.bombaDiesel -= gas;
    }
    
    public void mensajeGasInsuficiente(){
        JOptionPane.showMessageDialog(null, "Gasolina en bomba insuficiente");
    }
    
    public void mensajeValorInvalido(){
        JOptionPane.showMessageDialog(null, "Debe ingresar un valor en el formulario");
    }
    
    public void setReporte(String tipo, int cantidad, String date){
        DatosReporte reporte = new DatosReporte();
        reporte.setTipo(tipo);
        reporte.setCantidad(cantidad);
        reporte.setFecha(date);
        
        reportes.add(reporte);
    }
    
    public void cargarTabla(DefaultTableModel modelo){
        modelo.addColumn("Tipo");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Fecha");
        
        modelo.setRowCount(0);
    
        for(int i=1;i<reportes.size();i++){
        }
        
        for (int i = 0; i < reportes.size(); i++) {
            Object[] fila={
                reportes.get(i).getTipo(),
                reportes.get(i).getCantidad(),
                reportes.get(i).getFecha()
            };
            modelo.addRow(fila);
        }
    }
}
