import java.util.ArrayList;
import java.util.Scanner;

public class GestionCurso {

    private ArrayList<Curso> listaCursos;

    //METODOS

    public void guardarCursos(Scanner objScan) {
        System.out.println("Vamos a guardar un curso");
        System.out.println("Ingresa el nombre del curso");
        String nombreCurso = objScan.next();

        System.out.println("Ingresa el codigo del curso");
        int codigo = objScan.nextInt();

        Curso objCurso = new Curso(codigo, nombreCurso);
        this.listaCursos.add(objCurso);

        //FALTA VALIDAR QUE EL CODIGO NO EXISTA

    }

    public Curso buscarPorCodigo(Scanner objScan) {
        System.out.println("""
                Vamos a buscar por codigo
                                
                porfavor inrgrese el codigo del curso
                """);
        int codigo = objScan.nextInt();
        for (Curso cursoTemp : this.listaCursos) {
            if (cursoTemp.getCodigo() == (codigo)) {
                return cursoTemp;
            }

        }
        return null;
    }

    public void eliminarCurso(Scanner objScan){
        System.out.println("""
                Vamos a eliminar este curso 
                
                Ingresa el codigo
                """);
        int codigoTemp = objScan.nextInt();

        this.listaCursos.removeIf(Curso -> Curso.getCodigo() == codigoTemp);
        System.out.println("Eliminado con exito");
    }

    public void  listarCursos (){
        if (this.listaCursos.isEmpty()){
            System.out.println("la lista esta vacia");
        }
        else {
            for (Curso cursoTemp : this.listaCursos){
                System.out.println(cursoTemp.toString());
            }
        }
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public GestionCurso() {
        this.listaCursos = new ArrayList<>();
    }
}
