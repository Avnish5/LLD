package q_17_atm_design;

public enum TransactionType {

    CASH_WITHDRAWAL,
    BALANCE_CHECK;

    public static void showAllTransactionTypes() {
        for (TransactionType type : TransactionType.values()) {
            System.out.println(type.name());
        }
    }
}
