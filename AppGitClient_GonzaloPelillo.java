/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pelfuego
 */
public class AppGitClient_GonzaloPelillo {
    private String cliente;
    private String versión;
    private String SistemaOper;
    private String licencia;

    public AppGitClient_GonzaloPelillo(){
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVersión() {
        return versión;
    }

    public void setVersión(String versión) {
        this.versión = versión;
    }

    public String getSistemaOper() {
        return SistemaOper;
    }

    public void setSistemaOper(String SistemaOper) {
        this.SistemaOper = SistemaOper;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    
    @Override
    public String toString() {
    return "GitClient{" + "cliente=" + cliente + ", versión=" + versión + ", sistemaOper=" + SistemaOper + ", Licencia=" + licencia + '}';
    }

    
    
}

