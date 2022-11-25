package com.hillel.somov.javaPRO.lessons.lesson4.MemberAll;

public class Main {

    public static void main(String[] args) {

        Member[] members = {
                new Cat("Pushok", 200, 5),
                new Human("Gena", 5000, 4),
                new Robot("Stratos", 15000, 2)

        };

        Obstacle[] obstacles = {
                new RunningTrack(1000),
                new Wall(4)

        };
        System.out.println("Track length: " + ((RunningTrack) obstacles[0]).getLength()
                          + " m, " + " Wall height: " + ((Wall) obstacles[1]).getHeight() + " m.");
        System.out.println();

        for (Member member : members) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof RunningTrack) {
                    if (member.getMaxRun() >= ((RunningTrack) obstacle).getLength()) {
                        System.out.println(member.getName() + " was able to run Running Track. "
                                          + member.getName() + " can run - " + member.getMaxRun() + "m.");
                    } else {
                        System.out.println(member.getName() + " dropped out. It couldn't overcome obstacles. "
                                          + member.getName() + " run only " + member.getMaxRun() + "m!");
                        break;
                    }
                } else if (obstacle instanceof Wall) {
                    if (member.getMaxJump() >= ((Wall) obstacle).getHeight()) {
                        System.out.println(member.getName() + " was able to jump over Wall. "
                                          + member.getName() + "can jump - " + member.getMaxJump() + "m.");
                    } else {
                        System.out.println(member.getName() + " dropped out. It couldn't overcome obstacles. "
                                          + member.getName() + " jump only " + member.getMaxJump()
                                          + "m" + " but the height of the wall was " + ((Wall) obstacle).getHeight() + "m!");
                        break;
                    }
                }
            }
        }
    }
}
