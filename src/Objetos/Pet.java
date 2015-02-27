package Objetos;

/**
 *
 * @author cmejuto
 */
public class Pet {
    
    private int id; 
    private String nombre;
    private String chip;  
    private String especie; 
    private String raza; 
    private String idU;

    public Pet() {
    }

    public Pet(int id, String nombre, String chip, String especie, String raza, String idU) {
        this.id = id;
        this.nombre = nombre;
        this.chip = chip;
        this.especie = especie;
        this.raza = raza;
        this.idU = idU;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }


    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getIdU() {
        return idU;
    }

    public void setIdU(String idU) {
        this.idU = idU;
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", nombre=" + nombre + ", chip=" + chip + ", especie=" + especie + ", raza=" + raza + ", idU=" + idU + '}';
    }

   
    
    
}
