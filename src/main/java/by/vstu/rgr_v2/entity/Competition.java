package by.vstu.rgr_v2.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "competition")
public class Competition extends AbstractEntity {
    private String form;
    private int score;
    @OneToOne
    @JoinColumn(name = "application_id")
    private Application application;

    public Competition(String form, int score, Application application) {
        this.form = form;
        this.score = score;
        this.application = application;
    }

    public Competition() {
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
}
