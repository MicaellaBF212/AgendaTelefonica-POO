/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.agenda;

import ec.edu.ups.agenda.clases.OperadoraTelefonica;
import ec.edu.ups.agenda.clases.Persona;
import ec.edu.ups.agenda.clases.Telefono;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Mica
 */
public class AgendaTelefonica {

    public static void main(String[] args) {
        Date fechaDeNacimientoUno = new Date(2000, 0, 15);
        Persona personaUno = new Persona("093298", "Pepito Perez", fechaDeNacimientoUno);
        OperadoraTelefonica operadoraUno = new OperadoraTelefonica(1, "Claro");

        //Telefono telefonoUno = new Telefono(78867, "Movil", personaUno, operadoraUno);
        //Imprimir todos los datos del telefono, incluyendo datos completos de la persona y operadora telefonica
        /*
        System.out.println("--------------------------------------");
        System.out.println("Resumen de Datos Telefono");
        System.out.println("-Telefono-");
        System.out.println("Numero :" +  telefonoUno.getNumero());
        System.out.println("-Tipo" + telefonoUno.getTipo());
        System.out.println("Operadora : ");
        System.out.println("Codigo :" +  telefonoUno.getUnaOperadora().getCodigo());
        System.out.println("Nombre de la operadora:" +  telefonoUno.getUnaOperadora().getNombre());
        System.out.println("-Persona-");
        System.out.println("Numero de cedula :" + telefonoUno.getUnaPersona().getCedula());
        System.out.println("Nombre :" + telefonoUno.getUnaPersona().getNombre());
        System.out.println("Fecha de Nacimiento:" + telefonoUno.getUnaPersona().getFechaNacimiento());
         */
        //System.out.println("Datos del TelefonoUno: " + telefonoUno.toString());
        //Manejo de Listas en Java
        /*
        ArrayList<OperadoraTelefonica> operadoras = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        String continuar = "N";
        do{ 
            System.out.println("Ingresa el codigo de la operadora"); 
            int codigo = entrada.nextInt(); 
            System.out.println("Ingresa el nombre de la operadora"); 
            String nombre = entrada.next(); 
            OperadoraTelefonica operadora = new OperadoraTelefonica(); 
            operadora.setCodigo(codigo); operadora.setNombre(nombre); 
            operadoras.add(operadora); 
            System.out.println("¿Desea ingresar otra operadora? (S/N)"); 
            continuar = entrada.next(); 
        }while(continuar.equalsIgnoreCase("S")); 
        for(OperadoraTelefonica operadorita: operadoras){ 
            System.out.println(operadorita); 
        }
       
        menu
        1.Registrar Contactos (implementar)
        2.Registrar Operadoras (implementar)
        3.Registrar Telefonos (no implementar)
        4.Salir
        
        subir a Github (enlace publicado en Teams)
         */
        Scanner entrada = new Scanner(System.in);
        ArrayList<OperadoraTelefonica> operadoras = new ArrayList();
        ArrayList<Persona> contactos = new ArrayList();
        ArrayList<Telefono> telefonos = new ArrayList();

        int opcion;
        do {
            System.out.println("----MENU----");
            System.out.println("1.- Registrar Contactos");
            System.out.println("2.- Registrar Operadoras");
            System.out.println("3.- Registrar Telefonos");
            System.out.println("4.- Salir");
            System.out.println("Elegir un numero(1-4)");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    String continuar1;
                    do {
                        System.out.println("Ingresa el nombre del contacto");
                        String nombre = entrada.next();
                        System.out.println("Ingresa la cedula");
                        String cedula = entrada.next();
                        System.out.println("Ingresa fecha de nacimiento");
                        System.out.println("Ingresar su año de nacimiento");
                        int año = entrada.nextInt();
                        System.out.println("Ingresar su dia de nacimiento");
                        int dia = entrada.nextByte();
                        System.out.println("Ingresar su mes de nacimiento");
                        int mes = entrada.nextByte();
                        Date fechaNac = new Date(año - 1900, mes - 1, dia);

                        Persona contacto = new Persona();
                        contacto.setNombre(nombre);
                        contacto.setCedula(cedula);
                        contacto.setFechaNacimiento(fechaNac);
                        contactos.add(contacto);
                        System.out.println("¿Desea ingresar otro contacto? (S/N)");
                        continuar1 = entrada.next();
                    } while (continuar1.equalsIgnoreCase("S"));

                    for (Persona personitas : contactos) {
                        System.out.println("---------------");
                        System.out.println(personitas);
                    }
                    break;
                case 2:
                    String continuar2;
                    do {
                        System.out.println("Ingresa el codigo de la operadora");
                        int codigo = entrada.nextInt();
                        System.out.println("Ingresa el nombre de la operadora");
                        String nombre = entrada.next();

                        OperadoraTelefonica operadora = new OperadoraTelefonica();
                        operadora.setCodigo(codigo);
                        operadora.setNombre(nombre);
                        operadoras.add(operadora);
                        System.out.println("¿Desea ingresar otra operadora? (S/N)");
                        continuar2 = entrada.next();
                    } while (continuar2.equalsIgnoreCase("S"));

                    for (OperadoraTelefonica operadorita : operadoras) {
                        System.out.println("---------------------");
                        System.out.println(operadorita);
                    }
                    break;
                case 3:
                    if (!contactos.isEmpty() && !operadoras.isEmpty()) {

                        System.out.print("Ingrese el numero de telefono: ");
                        int numero = entrada.nextInt();

                        System.out.print("Ingrese el tipo de telefono (movil/casa/etc): ");
                        String tipo = entrada.next();

                        Telefono telefono = new Telefono(numero, tipo);
                        //Buscar persona en la lista de personas
                        boolean fuePersonaEncontrada = false;
                        do {
                            System.out.println("Ingresa la cedula de la persona: ");
                            String cedulaBuscada = entrada.next();

                            for (Persona personaEncontrada : contactos) {
                                if (personaEncontrada.getCedula().equals(cedulaBuscada)){
                                    telefono.setUnaPersona(personaEncontrada);
                                    fuePersonaEncontrada = true;
                                    break;
                                }
                            }

                            if (!fuePersonaEncontrada) {
                                System.out.println("No se encontro la persona.");
                            }

                        } while (!fuePersonaEncontrada);

                        boolean fueOperadoraEncontrada = false;

                        do {
                            System.out.println("Ingresa el codigo de la Operadora");
                            int codigoBuscado = entrada.nextInt();

                            for (OperadoraTelefonica operadoraEncontrada : operadoras) {
                                if (operadoraEncontrada.getCodigo() == codigoBuscado) {
                                    telefono.setUnaOperadora(operadoraEncontrada);
                                    fueOperadoraEncontrada = true;
                                    break;
                                }
                            }

                            if (!fueOperadoraEncontrada) {
                                System.out.println("No se encontro la operadora.");
                            }
                        } while (!fueOperadoraEncontrada);

                        telefonos.add(telefono);
                        System.out.println("Se guardo su telefono :)");
                    } else {
                        System.out.println("No existen operadoras o personas registradas");
                    }
                    for (Telefono telefonito : telefonos) {
                        System.out.println(telefonito);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 4);
        entrada.close();
    }
}
