import java.util.Scanner;
import java.lang.System;

public class Persona implements MethodInterface{
    Scanner scanner = new Scanner(System.in);
    
    private String nombre;
    private String apellidos;
    private String fechaCumple;
    private int edad;
    private String sexo;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre() {
        System.out.println("Porfavor intoruzca el nombre: ");
        String nombre = scanner.nextLine();
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos() {
        System.out.println("Porfavor intoruzca el apellido: ");
        String apellidos = scanner.nextLine();
        this.apellidos = apellidos;
    }
    public String getFechaCumple() {
        return fechaCumple;
    }
    public void setFechaCumple() {
        System.out.println("Porfavor intoruzca la fecha de cumpleaños(siguiente formato: dd/mm/yyyy): ");
        String fechaCumple = scanner.nextLine();
        String[] arrFechaCumple = fechaCumple.split("/");
        String[] arrMesFechaCumple = arrFechaCumple[1].split("");
        if(arrMesFechaCumple[0].equals("0")){
            this.fechaCumple = arrFechaCumple[0] + "/" + arrMesFechaCumple[1] + "/" + arrFechaCumple[2];
        }
        else{
            this.fechaCumple = fechaCumple;
        }
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad() {
        System.out.println("Porfavor intoruzca la edad: ");
        String edad = scanner.nextLine();
        try {
            int parsedEdad = Integer.parseInt(edad);
            this.edad = parsedEdad;
        } catch (NumberFormatException e) {
            System.out.println("Ha habido un error a la hora de introducir la edad. Intentelo de nuevo");
            System.exit(-1);
        }
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo() {
            System.out.println("Porfavor intoruzca el sexo: ");
            String sexo = scanner.nextLine();
            this.sexo = sexo;
        }
    
    
    @Override
    public void fechaDeNacimiento(Persona p) {
        String[] arrayFecha = p.getFechaCumple().split("/");
        try {
            if(Integer.parseInt(arrayFecha[1]) == 1 || Integer.parseInt(arrayFecha[1]) == 2 || Integer.parseInt(arrayFecha[1]) == 12){
                System.out.println(p.getNombre() + " ha nacido en invierno");
            }
            else if(Integer.parseInt(arrayFecha[1]) == 3 || Integer.parseInt(arrayFecha[1]) == 4 || Integer.parseInt(arrayFecha[1]) == 5){
                System.out.println(p.getNombre() + " ha nacido en primavera");
            }
            else if(Integer.parseInt(arrayFecha[1]) == 6 || Integer.parseInt(arrayFecha[1]) == 7 || Integer.parseInt(arrayFecha[1]) == 8){
                System.out.println(p.getNombre() + " ha nacido en verano");
            }
            else if(Integer.parseInt(arrayFecha[1]) == 9 || Integer.parseInt(arrayFecha[1]) == 10 || Integer.parseInt(arrayFecha[1]) == 11){
                System.out.println(p.getNombre() + " ha nacido en otoño");
            }
            else{
                throw new RuntimeException("Hubo un error a la hora de introducir la fecha de nacimiento intentelo de nuevo.\n Ejemplo: 1/1/2000");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Hubo un error a la hora de introducir la fecha de nacimiento. Intenelo de nuevo: ");
        }
    }        
}  





