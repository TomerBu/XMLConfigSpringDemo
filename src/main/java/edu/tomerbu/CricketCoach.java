package edu.tomerbu;

public class CricketCoach implements Coach {
    public void init() {
        System.out.println("LifeCycleOnCreateMethod");
    }

    public void cleanup(){
        System.out.println("LifeCycleOnDestroyMethod");

    }
    private FortuneService fortuneService;
    private String email;

    @Override
    public String toString() {
        return "CricketCoach{" +
                "fortuneService=" + fortuneService +
                ", email='" + email + '\'' +
                ", team='" + team + '\'' +
                "}@" + Integer.toHexString(hashCode());
    }

    private String team;

    static int counter = 0;

    public CricketCoach() {
        counter++;
        System.out.println("Inside constructor " + counter);
    }

    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    public String getFortune() {
        return fortuneService != null ? fortuneService.getFortune() : "No Fortune yet!";
    }

    //public setter for setter injection
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    //public setter for Literal setter injection
    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

}

