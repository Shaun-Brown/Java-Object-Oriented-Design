package main;

import lib.Module;

public class ModuleApp {

    public static void main(String[] args) {

        Module[] modules = new Module[6];

        modules[0] = new Module("CTEC0701","OOSoftware", 40);
        modules[1] = new Module("CTEC0702","Front End Programming", 60);
        modules[2] = new Module("CTEC0703","Functional Programming", 80);
        modules[3] = new Module("CTEC0704","Computer Ethics", 30);
        modules[4] = new Module("CTEC0705","Methods", 55);
        modules[5] = new Module("CTEC0706","Fuzzy Logic", 25);

        for (Module module: modules){
            System.out.println(module.toString());
        }

//        modules[2].setCwkWeight(80);

        System.out.println("\n ---------------------------------------------- \n");

        for (Module m: modules){
            if(m.getExamWeight()> 50) {
                System.out.println(m.getCode() + ": This is mostly exam based");
            } else if (m.getExamWeight() < 50) {
                System.out.println(m.getCode() + ": This is mostly coursework based");
            } else {
                System.out.println(m.getCode() + ": The exams and coursework have equal weight here");
            }
        }

    }
}
