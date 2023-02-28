package by.vstu.rgr_v2.entity;

import javax.persistence.*;

@Entity
@Table(name = "applications")
public class Application extends AbstractEntity {
    @OneToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;
    @OneToOne
    @JoinColumn(name = "attestat_id")
    private Attestat attestat;
    @OneToOne
    @JoinColumn(name = "speciality_id")
    private Specialties speciality;
    private String form;
    private String status;
    @OneToOne(mappedBy = "application", cascade = CascadeType.REMOVE)
    private Competition competition;

    public Application() {
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public Attestat getAttestat() {
        return attestat;
    }

    public void setAttestat(Attestat attestat) {
        this.attestat = attestat;
    }

    public Specialties getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Specialties speciality) {
        this.speciality = speciality;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
