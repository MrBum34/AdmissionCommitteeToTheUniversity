package by.vstu.rgr_v2.entity;


import javax.persistence.*;

@Entity
@Table(name = "specialties")
public class Specialties extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "facultet_id")
    private Facultet facultet;
    private String name;
    @OneToOne(mappedBy = "specialtie", cascade = CascadeType.REMOVE)
    @JoinColumn(name = "plan_id", nullable = false)
    private Plan plan;

    public Specialties(Facultet facultet, String name, Plan plan) {
        this.facultet = facultet;
        this.name = name;
        this.plan = plan;
    }

    public Specialties() {
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Facultet getFacultet() {
        return facultet;
    }

    public void setFacultet(Facultet facultet) {
        this.facultet = facultet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
