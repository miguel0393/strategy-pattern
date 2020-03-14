package strategy_pattern;

public class Fly implements MoveBehavior {

    @Override
    public void move(Unit unit) {
        unit.setPosition(unit.getPosition() + 10);
    }

    @Override
    public String getName() {
        return "Fly";
    }
}
