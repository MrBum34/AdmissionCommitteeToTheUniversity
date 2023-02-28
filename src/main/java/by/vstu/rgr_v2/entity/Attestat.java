package by.vstu.rgr_v2.entity;


import javax.persistence.*;

@Entity
@Table(name = "attestats")
public class Attestat extends AbstractEntity {
    @OneToOne(mappedBy = "attestat", cascade = CascadeType.REMOVE)
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;
    private int sredniyBallAttestat;
    private int ctBelLang;
    private int ctRusLang;
    private int ctForeignLang;
    private int ctMath;
    private int ctBio;
    private int ctChemist;
    private int ctPhysics;
    private int ctWorldHistory;
    private int ctHistoryOfBelarus;
    private int ctSocialStudies;
    private int ctGeography;


    public Attestat() {
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public int getSredniyBallAttestat() {
        return sredniyBallAttestat;
    }

    public void setSredniyBallAttestat(int sredniyBallAttestat) {
        this.sredniyBallAttestat = sredniyBallAttestat;
    }

    public int getCtBelLang() {
        return ctBelLang;
    }

    public void setCtBelLang(int ctBelLang) {
        this.ctBelLang = ctBelLang;
    }

    public int getCtRusLang() {
        return ctRusLang;
    }

    public void setCtRusLang(int ctRusLang) {
        this.ctRusLang = ctRusLang;
    }

    public int getCtForeignLang() {
        return ctForeignLang;
    }

    public void setCtForeignLang(int ctForeignLang) {
        this.ctForeignLang = ctForeignLang;
    }

    public int getCtMath() {
        return ctMath;
    }

    public void setCtMath(int ctMath) {
        this.ctMath = ctMath;
    }

    public int getCtBio() {
        return ctBio;
    }

    public void setCtBio(int ctBio) {
        this.ctBio = ctBio;
    }

    public int getCtChemist() {
        return ctChemist;
    }

    public void setCtChemist(int ctChemist) {
        this.ctChemist = ctChemist;
    }

    public int getCtPhysics() {
        return ctPhysics;
    }

    public void setCtPhysics(int ctPhysics) {
        this.ctPhysics = ctPhysics;
    }

    public int getCtWorldHistory() {
        return ctWorldHistory;
    }

    public void setCtWorldHistory(int ctWorldHistory) {
        this.ctWorldHistory = ctWorldHistory;
    }

    public int getCtHistoryOfBelarus() {
        return ctHistoryOfBelarus;
    }

    public void setCtHistoryOfBelarus(int ctHistoryOfBelarus) {
        this.ctHistoryOfBelarus = ctHistoryOfBelarus;
    }

    public int getCtSocialStudies() {
        return ctSocialStudies;
    }

    public void setCtSocialStudies(int ctSocialStudies) {
        this.ctSocialStudies = ctSocialStudies;
    }

    public int getCtGeography() {
        return ctGeography;
    }

    public void setCtGeography(int ctGeography) {
        this.ctGeography = ctGeography;
    }

    @Override
    public String toString() {
        return "\nAttestat{" +
                "sredniyBallAttestat=" + sredniyBallAttestat +
                ", ctBelLang=" + ctBelLang +
                ", ctRusLang=" + ctRusLang +
                ", ctForeignLang=" + ctForeignLang +
                ", ctMath=" + ctMath +
                ", ctBio=" + ctBio +
                ", ctChemist=" + ctChemist +
                ", ctPhysics=" + ctPhysics +
                ", ctWorldHistory=" + ctWorldHistory +
                ", ctHistoryOfBelarus=" + ctHistoryOfBelarus +
                ", ctSocialStudies=" + ctSocialStudies +
                ", ctGeography=" + ctGeography +
                ", id=" + id +
                '}';
    }
}
