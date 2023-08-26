import pkgAlumnos.Alumno;
import pkgAlumnos.Curso;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("001","juan perez","4444","5 calle 9-2");
        Curso cur = new Curso("555","programacion",500);
        alumno1.agregarCurso(cur);
        alumno1.agregarCurso(new Curso("12","Derecho",300));

        System.out.println("nombre del alumno"+alumno1.getNombre());
        System.out.println("carnet"+alumno1.getCarnet());

        //iteracion

        for (Curso curso:alumno1.getCursos()){
            System.out.println("curso : "+curso.getNombre()+"Valor :"+curso.getCosto);
        }
//===============================================================================
        Alumno alumno2 = new Alumno("002","chepe perez","4454","7 calle 10-2");
        Curso cur = new Curso("555","programacion",500);
        alumno2.agregarCurso(cur);
        alumno2.agregarCurso(new Curso("12","Derecho",300));

        System.out.println("nombre del alumno"+alumno2.getNombre());
        System.out.println("carnet"+alumno2.getCarnet());

        //iteracion

        for (Curso curso:alumno2.getCursos()){
            System.out.println("curso : "+curso.getNombre()+"Valor :"+curso.getCosto);
        }

        //===============================================================================
        Alumno alumno3 = new Alumno("003","pepe perez","3354","9 calle 11-2");
        Curso cur = new Curso("555","programacion",500);
        alumno3.agregarCurso(cur);
        alumno3.agregarCurso(new Curso("12","Derecho",300));

        System.out.println("nombre del alumno"+alumno3.getNombre());
        System.out.println("carnet"+alumno3.getCarnet());

        //iteracion

        for (Curso curso:alumno3.getCursos()){
            System.out.println("curso : "+curso.getNombre()+"Valor :"+curso.getCosto);
        }
    }
}