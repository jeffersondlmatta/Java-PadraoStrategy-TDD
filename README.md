Desconto com Padrão Strategy e TDD
Este repositório demonstra a aplicação do padrão de design Strategy para calcular descontos em produtos e utiliza Test-Driven Development (TDD) para garantir que a lógica de cálculo de descontos esteja correta.

📝 Proposta
Padrão Strategy: A ideia é usar o padrão de design Strategy para permitir que diferentes tipos de desconto (por exemplo, desconto de Natal, Ano Novo, etc.) sejam aplicados de forma flexível sem alterar o código principal.
TDD: A abordagem de Test-Driven Development foi utilizada para garantir que a implementação de cada estratégia de desconto fosse validada por testes automatizados antes da implementação do código.
🔧 Tecnologias
Java 8+
JUnit 4 para testes

⚙️ Estrutura do Código
Interface Desconto: Define o contrato para as estratégias de desconto.
Classes de desconto:
DescontoNatal: Aplica 10% de desconto.
DescontoAnoNovo: Aplica 15% de desconto.
CalculadoraDeDesconto: Recebe uma estratégia de desconto e aplica ao preço de um produto.
Testes JUnit: Testam as diferentes estratégias de desconto.

🏗 Como Funciona
Desconto Strategy: Cada tipo de desconto implementa a interface Desconto, permitindo que a lógica de cálculo do desconto seja facilmente trocada sem alterar o código que utiliza o desconto.
TDD: Antes de implementar a lógica de descontos, os testes foram escritos para garantir que o desconto esperado fosse aplicado corretamente. A implementação do código ocorreu após os testes falharem, seguindo a metodologia TDD.

💻 Executando o Código
Clone o repositório:

sh
Copiar
Editar
git clone <url-do-repositorio>
cd <diretorio-do-repositorio>
Compile e execute os testes:

Maven:
sh
Copiar
Editar
mvn test
Gradle:
sh
Copiar
Editar
gradle test
Para rodar o programa principal:

sh
Copiar
Editar
java Main

🧪 Testes
Os testes garantem que o desconto de 10% (para o Natal) e o desconto de 15% (para o Ano Novo) sejam aplicados corretamente.

Exemplo de Teste:
java
Copiar
Editar
@Test
public void deveAplicarDescontoDeNatal() {
    double precoOriginal = 100.0;
    Desconto desconto = new DescontoNatal();
    double precoComDesconto = desconto.aplicarDesconto(precoOriginal);
    double precoEsperado = 90.0; // 10% de desconto
    assertEquals(precoEsperado, precoComDesconto, 0.01);
}

🎯 Conclusão
Este projeto exemplifica a implementação do padrão Strategy para cálculos de desconto e a metodologia TDD para garantir que a lógica de desconto funcione corretamente desde o início. Essa abordagem facilita a manutenção do código, já que novas estratégias de desconto podem ser adicionadas de maneira simples, sem alterações no código existente.
