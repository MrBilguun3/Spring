package com.MyApp.loosely_coupled;

public class MyApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        //PartTimeMentor partTime = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount((Mentor) fullTime);

        mentor.manageAccount();

    }
}
