    import com.personas.mantener.Estudiante;
    import com.personas.mantener.Persona;
    import com.personas.mantener.Profesor;

    public class AppPersonas {
        public static void main(String[] args) throws Exception {
            Persona persona= new Persona();
            persona.setNombre("pepe");
            persona.setEdad(25);

            Estudiante estudiante= new Estudiante();
            estudiante.setNombre("Juan jose");
            estudiante.setLegajo(22345);
            estudiante.setCarrera("sistemas");
            
            Profesor profesor = new Profesor();
            profesor.setNombre("Fernando");
            profesor.setCargo("paradigma de programacion");
            profesor.setMateria("Adjunto");

            System.out.println("Objeto p de tipo persona");
            System.out.printf("nombre: %s, Edad: %d \n", persona.getNombre(),persona.getEdad());
            System.out.println("Objeto e de tipo Estudiente");
            System.out.printf("Nombre: %s, Carrera:%s, Legajo: %d \n ",estudiante.getNombre(),estudiante.getCarrera(),estudiante.getLegajo());
            System.out.println("Objeto pro de tipo profesor");
            System.out.printf("Nombre: %s, Materia:%s, Cargo: %s\n",profesor.getNombre(), profesor.getMateria(), profesor.getCargo());

            
            
        }
    }
