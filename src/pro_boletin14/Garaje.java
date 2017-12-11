package pro_boletin14;
/**
 *
 * @author abrandarizdominguez
 */
public class Garaje {
    private int numeroCoches;
    private String matricula;
    private int plazas;
    // Constructor por defecto:
    public Garaje() {
        
    }
    // Constructor por parametros
    public Garaje(int plazas){
        this.plazas = plazas;
    }
    //SETS Y GETS
    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getPlazas() {
        return plazas;
    }
    
    
    
    
}
