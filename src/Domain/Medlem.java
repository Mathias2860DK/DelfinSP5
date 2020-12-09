package Domain;

import Handler.FormandHandler;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Medlem {
    private int id;
    private String name;
    private int aargang;
    private String medlemsStatus;
    private String medlemsGruppe;
    private String medlemsType;
    private int medlemsBalance;
    private String gender;

    public Medlem(int id, String name, int aargang, String medlemsStatus, String medlemsGruppe, String medlemsType, int medlemsBalance, String gender) {
        this.id = id;
        this.name = name;
        this.aargang = aargang;
        this.medlemsStatus = medlemsStatus;
        this.medlemsGruppe = medlemsGruppe;
        this.medlemsType = medlemsType;
        this.medlemsBalance = medlemsBalance;
        this.gender = gender;
    }

    public Medlem() {
        this.id = id;
        this.name = name;
        this.aargang = aargang;
        this.medlemsStatus = medlemsStatus;
        this.medlemsGruppe = medlemsGruppe;
        this.medlemsType = medlemsType;
        this.medlemsBalance = medlemsBalance;
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAargang(int aargang) {
        this.aargang = aargang;
    }

    public void setMedlemsStatus(String medlemsStatus) {
        this.medlemsStatus = medlemsStatus;
    }

    public void setMedlemsGruppe(String medlemsGruppe) {
        this.medlemsGruppe = medlemsGruppe;
    }

    public void setMedlemsType(String medlemsType) {
        this.medlemsType = medlemsType;
    }

    public void setMedlemsBalance(int medlemsBalance) {
        this.medlemsBalance = medlemsBalance;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMedlemsStatus() {
        return medlemsStatus;
    }

    public String getMedlemsGruppe() {
        return medlemsGruppe;
    }

    public String getName() {
        return name;
    }

    public int getAargang() {
        return aargang;
    }

    public String getMedlemsType() {
        return medlemsType;
    }

    public int getMedlemsBalance() {
        return medlemsBalance;
    }

    public String getGender() {
        return gender;
    }




    @Override
    public String toString() {

            return "Medlem{" +
                    "id=" + getId() +
                    ", name='" + name + '\'' +
                    ", aargang=" + aargang +
                    ", medlemsStatus='" + medlemsStatus + '\'' +
                    ", medlemsGruppe='" + medlemsGruppe + '\'' +
                    ", medlemsType='" + medlemsType + '\'' +
                    ", medlemsBalance=" + medlemsBalance +
                    ", gender='" + gender + "\n";

    }
}
