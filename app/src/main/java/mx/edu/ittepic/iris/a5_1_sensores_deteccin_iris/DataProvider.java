package mx.edu.ittepic.iris.a5_1_sensores_deteccin_iris;

/**
 * Created by OEM on 10/05/2018.
 */

public class DataProvider {
    // 1.1. Definir campos de clase para los elementos del CardView
    private String nombre;
    private String fabricante;
    private String version;
    private String rango_max;
    private String retraso_min;
    private String potencia;

    // 1.2. Generar el constructor

    public DataProvider(String nombre, String fabricante, String version, String rango_max, String retraso_min, String potencia) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.version = version;
        this.rango_max = rango_max;
        this.retraso_min = retraso_min;
        this.potencia = potencia;
    }


    // 1.3. Generar los métodos getter.


    public String getNombre() {
        return nombre;
    }

    public void setNnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRango_max() {
        return rango_max;
    }

    public void setRango_max(String rango_max) {
        this.rango_max = rango_max;
    }

    public String getRetraso_min() {
        return retraso_min;
    }

    public void setRetraso_min(String retraso_min) {
        this.retraso_min = retraso_min;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
}
