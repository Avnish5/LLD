package o_15_null_object_design_pattern;

public class Car implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() {
        return 50;
    }
}
