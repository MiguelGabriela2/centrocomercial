package centrocomercial;

import java.util.Date;

public class Centrocomercial {
    
     private int  numerodealmacenes;
     private int  numeroclientes;
     private Date fechadeapertura;
     private string  numerodedias;
      private boolean  fechadecierre;     

    public Centrocomercial(int numerodealmacenes, int numeroclientes, Date fechadeapertura, string numerodedias, boolean fechadecierre) {
        this.numerodealmacenes = numerodealmacenes;
        this.numeroclientes = numeroclientes;
        this.fechadeapertura = fechadeapertura;
        this.numerodedias = numerodedias;
        this.fechadecierre = fechadecierre;
    }
// comentario de prueba
    public int getNumerodealmacenes() {
        return numerodealmacenes;
    }

    public void setNumerodealmacenes(int numerodealmacenes) {
        this.numerodealmacenes = numerodealmacenes;
    }

    public int getNumeroclientes() {
        return numeroclientes;
    }

    public void setNumeroclientes(int numeroclientes) {
        this.numeroclientes = numeroclientes;
    }

    public Date getFechadeapertura() {
        return fechadeapertura;
    }

    public void setFechadeapertura(Date fechadeapertura) {
        this.fechadeapertura = fechadeapertura;
    }

    public string getNumerodedias() {
        return numerodedias;
    }

    public void setNumerodedias(string numerodedias) {
        this.numerodedias = numerodedias;
    }

    public boolean isFechadecierre() {
        return fechadecierre;
    }

    public void setFechadecierre(boolean fechadecierre) {
        this.fechadecierre = fechadecierre;
    }




