package p_16_state_design_pattern_vending_machine;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    int value;

    Coin(int value) {
        this.value =value;
    }

}
