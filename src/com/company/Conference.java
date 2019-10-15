package com.company;

public class Conference {

    String topic;
    static int period;
    public static String itConferenceTopic = "go codding";
    static Conference itConference;

    public Conference(String topic) {
        this.topic = topic;
    }

    Conference() {
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    void showTopic() {
        System.out.println(this.getTopic());
    }

    static void showPeriod() {
        System.out.println(period);
    }

    static Conference itConference() {
        if (itConference == null) {
            itConference = new Conference(itConferenceTopic);
        }
        return itConference;
    }

    public static void main(String[] args) {
        Conference.period = 3;
        showPeriod();
        Conference medicalConference = new Conference();
        medicalConference.setTopic(".......................");
        medicalConference.showTopic();
        Conference itConference = Conference.itConference();
        System.out.println(itConference.getTopic());
    }

}