public class TesteTRibutavel {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 1234);
        cc.deposita(100.00);

        SeguroDeVida sv = new SeguroDeVida();

        CalculaImposto ci = new CalculaImposto();
        ci.registra(cc);
        ci.registra(sv);

        System.out.println(ci.getTotalImposto());
    }
    
}
