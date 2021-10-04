package main;

import lib.VolumeModel;

public class VolumeModelApp {

    public static void main(String[] args) {

        //create an instance of VolumeModel using the no-argument constructor
        VolumeModel vm1 = new VolumeModel();
        System.out.println(vm1);
        System.out.println("max volume: " + vm1.getMaxVolume());
        System.out.println("volume: " + vm1.getVolume());
        System.out.println("muted: " + vm1.isMuted());

        //setVolume to maximum
        vm1.setVolume(vm1.getMaxVolume());
        System.out.println(vm1);

        //turnDown until zero
        while (vm1.getVolume()>0) {
            vm1.turnDown();
            System.out.println(vm1);
        }

        vm1.setMuted(true);
        //turn up until max
        int max = vm1.getMaxVolume();
        while (vm1.getVolume()> 0) {
            System.out.println(vm1);
        }

        //create an instance of VolumeModel using three-argument constructor
        VolumeModel vm2 = new VolumeModel(11, 8, true);
        System.out.println(vm2);
        System.out.println("max volume: " + vm2.getMaxVolume());
        System.out.println("volume: " + vm2.getVolume());
        System.out.println("muted: " + vm2.isMuted());

        //test turnDown(int)
        vm2.turnDownBy(1);
        System.out.println(vm2);
        vm2.turnDownBy(8);
        System.out.println(vm2);

        System.out.println("\n -------------------- \n");

        VolumeModel vm3 = new VolumeModel();
        System.out.println(vm3);
        System.out.println("max volume: " + vm3.getMaxVolume());
        System.out.println("volume: " + vm3.getVolume());
        System.out.println("muted: " + vm3.isMuted());

        //setVolume to maximum
        vm1.setVolume(vm3.getMaxVolume());
        System.out.println(vm1);
        vm3.turnDown();

        //turnDown until zero
        while (vm3.getVolume()< vm3.getMaxVolume()) {
            vm3.turnUpBy(2);
            System.out.println(vm3);
        }
    }

}
