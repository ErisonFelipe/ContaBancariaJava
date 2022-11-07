public class TesteConta {
    
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 0111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(123, 0112);
        cp.deposita(50);

        cc.transfere(10.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}
