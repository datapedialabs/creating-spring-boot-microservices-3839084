package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.tourservice.TourManagementService;
import com.example.tourservice.TravelAgentService;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class.getPackageName());
        TravelAgentService agent = context.getBean(TravelAgentService.class);
        TourManagementService manager = context.getBean(TourManagementService.class);
        manager.createTour("Zoo Tour", 100, true);
        System.out.println("\n******Explore California Tour Catalogue******");
        agent.displayTours();

        System.out.println("\n******Explore California Tour Kid Friendly Tours******");
        agent.displayToursBy(true);
    }
}