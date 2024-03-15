import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // instancias
        Scanner objScan = new Scanner(System.in);
        GestionCurso objGestionCurso = new GestionCurso();
        int optionAdministrar = 0;
        do {
            System.out.println("""
                    MENU DE OPCIONES
                                        
                    1. Administrar Cursos
                    2. Administrar Estudiantes
                    3. Salir
                                        
                    """);

            optionAdministrar = objScan.nextInt();

            switch (optionAdministrar) {
                case 1:
                    int optionCursos = 0;
                    do {
                        System.out.println("""
                                MENU CURSOS
                                                                
                                1. Crear un curso
                                2. Buscar curso por codigo
                                3. Listar cursos
                                4. salir
                                """);
                        optionCursos = objScan.nextInt();
                        switch (optionCursos) {
                            case 1:
                                objGestionCurso.guardarCursos(objScan);

                                break;
                            case 2:
                                System.out.println("Busca un curso por codigo");
                                System.out.println("Ingresa el codigo");


                                System.out.println(objGestionCurso.buscarPorCodigo(objScan).toString());
                                break;
                            case 3:
                                System.out.println("LISTA DE CURSOS");
                                objGestionCurso.listarCursos();
                                break;
                        }
                    } while (optionCursos != 4);
                    break;
                case 2:

                    int optionEstudiantes = 0;
                    do {
                        System.out.println("""
                                MENU CURSOS
                                                                
                                1. Agregar Estudiante 
                                2. Eliminar Estudiante
                                3. Listar Estudiantes
                                4. salir
                                """);
                        optionEstudiantes = objScan.nextInt();
                        switch (optionEstudiantes) {
                            case 1:
                                System.out.println("LISTA DE CURSOS");
                                objGestionCurso.listarCursos();
                                Curso objCurso = objGestionCurso.buscarPorCodigo(objScan);
                                if (objCurso == null) {
                                    System.out.println("NO EXISTE NINGUN CURSO");
                                } else {

                                    objCurso.guardarEstudiante(objScan);
                                }
                                break;

                            case 2 :
                                System.out.println("LISTA DE CURSOS");
                                objGestionCurso.listarCursos();



                                Curso cursoEliminando = objGestionCurso.buscarPorCodigo(objScan);

                                if(cursoEliminando == null){
                                    System.out.println("EL CURSO NO SE ENCONTRO");
                                }else {
                                    cursoEliminando.eliminarEstudiante(objScan);
                                }

                                break;

                            case 3:
                                System.out.println("LISTA DE CURSOS");
                                objGestionCurso.listarCursos();



                                Curso cursoListar = objGestionCurso.buscarPorCodigo(objScan);
                                if (cursoListar == null){
                                    System.out.println("NO SE ENCONTRO EL CURSO");
                                }else {
                                    cursoListar.listaEstudiantes();
                                }
                                break;
                        }
                    } while (optionEstudiantes != 4);
                    break;
            }
        } while (optionAdministrar != 3);
    }
}