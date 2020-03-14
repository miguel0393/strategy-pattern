package strategy_pattern;

public class Walk implements MoveBehavior {

    @Override
    public void move(Unit unit) {
        unit.setPosition(unit.getPosition() + 1);
    }

    @Override
    public String getName() {
        return "Walk";
    }
}
