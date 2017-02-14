package edu.tomerbu;

public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    //Interface Methods
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }
}