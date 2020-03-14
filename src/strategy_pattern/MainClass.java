package strategy_pattern;

public class MainClass {

    public static void main(String[] args) {

        Unit viking = new Viking(new Walk());

        System.err.println("Viking initial mode: " + viking.getMoveBehavior().getName());
        System.err.println("Viking current position: " + viking.getPosition());
        viking.move();
        System.err.println("Viking position after walk: " + viking.getPosition());

        viking.setMoveBehavior(new Fly());
        System.err.println("Viking next mode: " + viking.getMoveBehavior().getName());
        System.err.println("Viking current position: " + viking.getPosition());
        viking.move();
        System.err.println("Viking position after fly: " + viking.getPosition());

    }
}
