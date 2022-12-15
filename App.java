public class App {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre();
        persona1.setApellidos();
        persona1.setFechaCumple();
        persona1.setEdad();
        persona1.setSexo();

        System.out.println(persona1.getNombre() + " ha sido creado con exito");
        
        Persona persona2 = new Persona();
        persona2.setNombre();
        persona2.setApellidos();
        persona2.setFechaCumple();
        persona2.setEdad();
        persona2.setSexo();

        System.out.println(persona2.getNombre() + " ha sido creado con exito");

        persona1.fechaDeNacimiento(persona1);
        persona2.fechaDeNacimiento(persona2);
    }
}