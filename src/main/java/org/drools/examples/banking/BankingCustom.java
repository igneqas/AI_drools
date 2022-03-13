package org.drools.examples.banking;

public class BankingCustom {
    public static void main(String[] args) {
        CustomBank bank1 = new CustomBank("SEB", 12645.56, 1);
        CustomBank bank2 = new CustomBank("Swedbank", 50662.19, 2);

        CustomAccount acc1 = new CustomAccount(1, bank1);
        CustomAccount acc2 = new CustomAccount(2, bank1);
        CustomAccount acc3 = new CustomAccount(3, bank2);
        CustomAccount acc4 = new CustomAccount(4, bank2);

        Object[] cashflows = {
            new CustomCashflow(CustomCashflow.DEPOSIT, new SimpleDate("02/03/2022"), 265.45, acc1, acc1),
            new CustomCashflow(CustomCashflow.DEPOSIT, new SimpleDate("03/03/2022"), 5.45, acc2, acc2),
            new CustomCashflow(CustomCashflow.DEPOSIT, new SimpleDate("01/03/2022"), 12.00, acc1, acc1),
            new CustomCashflow(CustomCashflow.DEPOSIT, new SimpleDate("02/04/2022"), 100.00, acc1, acc1),
            new CustomCashflow(CustomCashflow.DEPOSIT, new SimpleDate("05/03/2022"), 1000.00, acc3, acc3),
            new CustomCashflow(CustomCashflow.DEPOSIT, new SimpleDate("05/03/2022"), 4266.75, acc4, acc4),
            new CustomCashflow(CustomCashflow.DEPOSIT, new SimpleDate("20/03/2022"), 150.00, acc4, acc4),
            new CustomCashflow(CustomCashflow.WITHDRAWAL, new SimpleDate("08/03/2022"), 30.00, acc1, acc1),
            new CustomCashflow(CustomCashflow.WITHDRAWAL, new SimpleDate("09/03/2022"), 35.00, acc3, acc3),
            new CustomCashflow(CustomCashflow.WITHDRAWAL, new SimpleDate("07/03/2022"), 10.00, acc1, acc1),
            new CustomCashflow(CustomCashflow.WITHDRAWAL, new SimpleDate("15/03/2022"), 10.00, acc4, acc4),
            new CustomCashflow(CustomCashflow.TRANSFER, new SimpleDate("10/05/2022"), 100.00, acc4, acc2),
            new CustomCashflow(CustomCashflow.TRANSFER, new SimpleDate("29/04/2022"), 50.00, acc4, acc2),
            new CustomCashflow(CustomCashflow.TRANSFER, new SimpleDate("26/3/2022"), 5.00, acc1, acc3),
                new CustomCashflow(CustomCashflow.WITHDRAWAL, new SimpleDate("08/03/2022"), 30.00, acc1, acc1)
        };

        new RuleRunner().runRules( new String[] { "Custom.drl" },
                cashflows );
    }
}
