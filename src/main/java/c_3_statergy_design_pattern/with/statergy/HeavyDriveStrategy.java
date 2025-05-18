package c_3_statergy_design_pattern.with.statergy;

public class HeavyDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Heavy drive capability");
    }
}
