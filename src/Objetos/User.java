package Objetos;
/**
 *
 * @author cmejuto
 */
public class User {
    
    private int id;
    private String unombre;
    private int tlf;
    private String mail; 
    private String direccion;
    private String provincia;
    private String user;
    private String pass;


    public User(int id, String unombre, int tlf, String mail,  String direccion, String provincia, String user, String pass) {
        this.id = id;
        this.unombre = unombre;
        this.tlf = tlf;
        this.direccion = direccion;
        this.provincia = provincia;
        this.user = user;
        this.pass = pass;
        this.mail = mail; 
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", unombre=" + unombre + ", tlf=" + tlf + ", mail=" + mail + ", direccion=" + direccion + ", provincia=" + provincia + ", user=" + user + ", pass=" + pass + '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnombre() {
        return unombre;
    }

    public void setUnombre(String unombre) {
        this.unombre = unombre;
    }

   

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
}
