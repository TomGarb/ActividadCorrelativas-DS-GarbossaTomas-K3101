import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


class Materia{
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre, List<Materia> correlativas){
        this.nombre=nombre;
        this.correlativas=new ArrayList<Materia> (correlativas);
    }
    public String getNombre(){
        return nombre;
    }
    public List<Materia> getCorrelativas(){
        return correlativas;
    }
}

class Alumno{
    private String legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String legajo,List<Materia> materiasAprobadas){
        this.legajo=legajo;
        this.materiasAprobadas=new ArrayList<Materia> (materiasAprobadas);
    }

    public boolean cumpleCorrelativa(Materia materia){
        boolean valor=false;
        for(Materia aprobada : materiasAprobadas){
            for (Materia correlativa : materia.getCorrelativas()){
                valor = (aprobada==correlativa);
            }
        }
        return valor;
    }

    public String getLegajo(){
        return legajo;
    }

}

public class Inscripcion {

    private Alumno alumno;
    private List<Materia> materias;

    public boolean aprobada(){
        boolean valor=false;
        for(Materia materia : materias){
            valor = alumno.cumpleCorrelativa(materia);
        }
        return valor;
    }
    public Inscripcion (Alumno alumno, List<Materia> materias ){
        this.alumno=alumno;
        this.materias=new ArrayList<Materia>(materias);
    }
}