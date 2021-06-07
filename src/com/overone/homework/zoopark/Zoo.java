package com.overone.homework.zoopark;

import com.overone.homework.entity.Animal;
import com.overone.homework.entity.ServiceHuman;

public class Zoo {
    private Animal animals[];
    private ServiceHuman doctor;

    public Zoo(ServiceHuman doctor, Animal... animals){
        this.animals=animals;
        this.doctor=doctor;
    }

    public void workDay(){
        System.out.println("Day has begun");
        System.out.println("Worker is going to feed animals");
        //here will be code, worker feeding animals of ZOO
        System.out.println("Doctor is going to check animals, if animal is not health, doctor will shine them");
        for (Animal animal : animals) {
            doctor.work(animal);
        }
        System.out.println("Day is over");
    }

}
