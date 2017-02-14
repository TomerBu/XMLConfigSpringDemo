package edu.tomerbu;

public class CricketCoach implements Coach {


    private FortuneService fortuneService;

    public CricketCoach() {

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

}

