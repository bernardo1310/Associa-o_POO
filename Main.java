package Video;
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setCodigo(123);
        banco.setNome("Banco do Brasil");
        banco.setNumeroAgencias(100);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bernardo");
        pessoa.setEndereco("Rua Exemplo, 123");

        CartaoDeCredito cartao = new CartaoDeCredito();
        cartao.setNumero(987654);
        cartao.setOperadora("Visa");
        cartao.setLimite(5000.0);
        cartao.setTipoDeCartao("Platinum");

        ContaSimples contaSimples = new ContaSimples();
        contaSimples.setBanco(banco);
        contaSimples.setAgencia(456);
        contaSimples.setNumeroDaConta(789123);
        contaSimples.setSaldo(1000.0);
        contaSimples.setCorrentista(pessoa);
        contaSimples.setSaldoPoupanca(500.0);

        contaSimples.depositoPoupanca(200.0);
        contaSimples.saquePoupanca(100.0);

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setBanco(banco);
        contaEspecial.setAgencia(789);
        contaEspecial.setNumeroDaConta(321456);
        contaEspecial.setSaldo(2000.0);
        contaEspecial.setCorrentista(pessoa);
        contaEspecial.setDiasSemJuros(30);
        contaEspecial.setLimite(10000.0);
        contaEspecial.setCartao(cartao);
        contaEspecial.deposito(300.0);
        contaEspecial.saque(150.0);

        System.out.println("Banco:");
        System.out.println(banco);

        System.out.println("\nPessoa:");
        System.out.println(pessoa);

        System.out.println("\nCartão de Crédito:");
        System.out.println(cartao);

        System.out.println("\nConta Simples:");
        System.out.println(contaSimples);

        System.out.println("\nConta Especial:");
        System.out.println(contaEspecial);
    }
}
