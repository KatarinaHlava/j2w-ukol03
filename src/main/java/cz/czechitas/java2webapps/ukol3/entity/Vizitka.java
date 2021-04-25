package cz.czechitas.java2webapps.ukol3.entity;

public class Vizitka {
    private String jmeno;
    private String firma;
    private String ulica;
    private String obecPSC;
    private String celaAdresa;
    private String email;
    private String telefon;
    private String web;

    public Vizitka() {
    }

    public Vizitka(String jmeno, String firma, String ulica, String obecPSC, String email, String telefon, String web) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulica = ulica;
        this.obecPSC = obecPSC;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
    }

    public String getCelaAdresa() {
        this.celaAdresa=this.ulica+" "+ this.obecPSC;
        return celaAdresa;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getObecPSC() {
        return obecPSC;
    }

    public void setObecPSC(String obecPSC) {
        this.obecPSC = obecPSC;
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

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
