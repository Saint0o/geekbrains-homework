package ru.geekbrains.HomeWork4;

public abstract class Participant {
    private final String NAME;
    protected int maxJump = 0;
    protected int maxRun = 0;
    protected int maxSwim = 0;
    protected int maxFly = 0;

    protected Participant(String name) {
        NAME = name;
    }

    public String getNAME() {
        return NAME;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public int getMaxFly() {
        return maxFly;
    }

    //    public void runAndJump(Object... obstacles) {
//        boolean isPassed = true;
//        for (Object obstacle:obstacles) {
//            if (obstacle instanceof Treadmill) {
//                if (((Treadmill) obstacle).getLENGTH() < MAX_RUN) {
//                    System.out.println(NAME + " пробежал успешно.");
//                } else {
//                    System.out.println(NAME + " не смог пробежать.");
//                    isPassed = false;
//                    break;
//                }
//            } else {
//                if (((Wall) obstacle).getHEIGHT() < MAX_JUMP) {
//                    System.out.println(NAME + " перепрыгнул успешно.");
//                } else {
//                    System.out.println(NAME + " не смог перепрыгнуть.");
//                    isPassed = false;
//                    break;
//                }
//            }
//        }
//        if (isPassed)
//        System.out.println(NAME + " все испытания прошел успешно!");
//    }
}
