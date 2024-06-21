package com.fundraising;

public class FundraisingEvent {
    private String id;
    private String name;
    private double goal;
    private double raised;

    public FundraisingEvent(String id, String name, double goal) {
        this.id = id;
        this.name = name;
        this.goal = goal;
        this.raised = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGoal() {
        return goal;
    }

    public void setGoal(double goal) {
        this.goal = goal;
    }

    public double getRaised() {
        return raised;
    }

    public void donate(double amount) {
        this.raised += amount;
    }

    @Override
    public String toString() {
        return "FundraisingEvent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", goal=" + goal +
                ", raised=" + raised +
                '}';
    }
}