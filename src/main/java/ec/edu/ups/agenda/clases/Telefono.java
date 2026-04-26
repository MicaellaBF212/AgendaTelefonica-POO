/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.agenda.clases;

/**
 *
 * @author User
 */
public class Telefono {
    private int numero;
    private String tipo;
    private Persona unaPersona;
    private OperadoraTelefonica unaOperadora;

    public Telefono() {
    }

    public Telefono(int numero, String tipo, Persona unaPersona, OperadoraTelefonica unaOperadora) {
        this.numero = numero;
        this.tipo = tipo;
        this.unaPersona = unaPersona;
        this.unaOperadora = unaOperadora;
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona getUnaPersona() {
        return unaPersona;
    }

    public void setUnaPersona(Persona unaPersona) {
        this.unaPersona = unaPersona;
    }

    public OperadoraTelefonica getUnaOperadora() {
        return unaOperadora;
    }

    public void setUnaOperadora(OperadoraTelefonica unaOperadora) {
        this.unaOperadora = unaOperadora;
    }
    
    public String toString(){
        String resultado = "Datos del telefono: \n";
        resultado +="Numero de Telefono: " + numero + "\n";
        resultado +="Tipo de Telefono: " + tipo + "\n";
        resultado +="Persona: " + unaPersona + "\n";
        resultado +="Operadora: " + unaOperadora;
        
        return resultado;
    }
}
