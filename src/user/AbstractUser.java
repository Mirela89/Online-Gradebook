package user;
import model.Facultate;

//user abstract, va fi mostenita de student & profesor
public abstract class AbstractUser {
    private long id;
    private String nume;
    private String prenume;
    private String cnp;
    private String email;
    private String telefon;
    private Facultate facultate;
    private RolUser rol;

    //constructor
    protected AbstractUser(long id, String nume, String prenume, String cnp, String email, String telefon, Facultate facultate, RolUser rol) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.email = email;
        this.telefon = telefon;
        this.facultate = facultate;
        this.rol = rol;
    }

    //getteri si setteri
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Facultate getFacultate() {
        return facultate;
    }

    public void setFacultate(Facultate facultate) {
        this.facultate = facultate;
    }

    public RolUser getRol() {
        return rol;
    }

    public void setRol(RolUser rol) {
        this.rol = rol;
    }

    //-------------------------------------------------

}
