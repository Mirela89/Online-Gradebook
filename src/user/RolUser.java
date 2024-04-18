package user;

public enum RolUser {
    PROFESOR("ROL_PROFESOR"),
    STUDENT("ROL_STUDENT");

    final String tipRol;

    private RolUser(String tipRol) {
        this.tipRol = tipRol;
    }

    public String getTipRol() {
        return tipRol;
    }
}
