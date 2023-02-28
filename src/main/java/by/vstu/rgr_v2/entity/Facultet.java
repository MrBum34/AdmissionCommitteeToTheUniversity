package by.vstu.rgr_v2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "fcultets")
public class Facultet extends AbstractEntity {
    @Column(name = "name", nullable = false)
    private String name;
    @OneToMany(mappedBy = "facultet")
    private List<Specialties> specialties;

    public Facultet() {
    }

    public List<Specialties> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<Specialties> specialties) {
        this.specialties = specialties;
    }

    public Facultet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nFacultets{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}
