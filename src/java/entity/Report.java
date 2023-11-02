/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Report {
    private int activityId;
    private int organizerId;
    public Report(int activityId, int organizerId) {
        this.activityId = activityId;
        this.organizerId = organizerId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(int organizerId) {
        this.organizerId = organizerId;
    }

   

    @Override
    public String toString() {
        return "Report{" + "activityId=" + activityId + ", organizerId=" + organizerId + '}';
    }
    
    
    
}
