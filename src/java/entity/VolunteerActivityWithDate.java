/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author datka
 */
public class VolunteerActivityWithDate {
    private VolunteerActivity activity;
    private Date participationDate;
    private String oName;
    // Các phương thức getter và setter cho activity và participationDate

    public VolunteerActivityWithDate(VolunteerActivity activity, Date participationDate, String oName) {
        this.activity = activity;
        this.participationDate = participationDate;
        this.oName = oName;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public VolunteerActivityWithDate() {
    }

    public VolunteerActivity getActivity() {
        return activity;
    }

    public void setActivity(VolunteerActivity activity) {
        this.activity = activity;
    }

    public Date getParticipationDate() {
        return participationDate;
    }

    public void setParticipationDate(Date participationDate) {
        this.participationDate = participationDate;
    }
}
