package strategy_pattern;

public class Viking extends Unit {

    public Viking(MoveBehavior moveBehavior) {
        this.setMoveBehavior(moveBehavior);
        this.setPosition(0);
    }

    public void move() {
        this.getMoveBehavior().move(this);
    }
}
