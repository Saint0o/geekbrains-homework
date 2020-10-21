package ru.geekbrains.HomeWork4;

public abstract class Participant {
    private final String NAME;
    private final int MAX_JUMP;
    private final int MAX_RUN;

    protected Participant(String name, int max_jump, int max_run) {
        NAME = name;
        MAX_JUMP = max_jump;
        MAX_RUN = max_run;
    }

    public void runAndJump(Object... obstacles) {
        boolean isPassed = true;
        for (Object obstacle:obstacles) {
            if (obstacle instanceof Treadmill) {
                if (((Treadmill) obstacle).getLENGTH() < MAX_RUN) {
                    System.out.println(NAME + " пробежал успешно.");
                } else {
                    System.out.println(NAME + " не смог пробежать.");
                    isPassed = false;
                    break;
                }
            } else {
                if (((Wall) obstacle).getHEIGHT() < MAX_JUMP) {
                    System.out.println(NAME + " перепрыгнул успешно.");
                } else {
                    System.out.println(NAME + " не смог перепрыгнуть.");
                    isPassed = false;
                    break;
                }
            }
        }
        if (isPassed)
        System.out.println(NAME + " все испытания прошел успешно!");
    }
}
