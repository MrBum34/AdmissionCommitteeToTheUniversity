package by.vstu.rgr_v2.entity;

import javax.persistence.*;

@Entity
@Table(name = "plans")
public class Plan extends AbstractEntity {
    private int besplatno;
    private int platno;
    @Column(length = 50)
    private String subject1;
    @Column(length = 50)
    private String subject2;
    @Column(length = 50)
    private String subject3;
    @OneToOne
    @JoinColumn(name = "specialtie_id")
    private Specialties specialtie;

    public Plan(int besplatno, int platno, String subject1, String subject2, String subject3, Specialties specialtie) {
        this.besplatno = besplatno;
        this.platno = platno;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.specialtie = specialtie;
    }

    public Plan() {
    }

    public int getBesplatno() {
        return besplatno;
    }

    public void setBesplatno(int besplatno) {
        this.besplatno = besplatno;
    }

    public int getPlatno() {
        return platno;
    }

    public void setPlatno(int platno) {
        this.platno = platno;
    }

    public Specialties getSpecialtie() {
        return specialtie;
    }

    public void setSpecialtie(Specialties specialtie) {
        this.specialtie = specialtie;
    }

    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getSubject3() {
        return subject3;
    }

    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }
}
