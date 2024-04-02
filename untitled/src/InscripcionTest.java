import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InscripcionTest {
    Materia sistemasyOrganizaciones = new Materia("Sistemas y Organizaciones",List.of());
    Materia analisisDeSistemas= new Materia("Analisis de Sistemas",List.of(sistemasyOrganizaciones));
    Materia diseno= new Materia("diseño",List.of(sistemasyOrganizaciones,analisisDeSistemas));
    Alumno tomas=new Alumno("2023894",List.of(analisisDeSistemas,sistemasyOrganizaciones));
    Alumno juan=new Alumno("154546",List.of());
    @Test
    public void tomasSePuedeInscribir(){
        Inscripcion unaInscripcion=new Inscripcion(tomas,List.of(diseno));
        assertTrue(unaInscripcion.aprobada());
    }

    @Test
    public void juanNoSePuedeInscribir(){
        Inscripcion unaInscripcion=new Inscripcion(juan,List.of(diseno,analisisDeSistemas));
        assertFalse(unaInscripcion.aprobada());
    }
}