## O que é o Java?

Java é uma linguagem de programação orientada a objetos, e o principal do Java é que ela é organizada em classes.

## Como o Java funciona?

O Java funciona através de um processo de compilação onde o código fonte escrito no arquivo com extensão ".java", quando você compila um arquivo Java usando o compilador presente no Java Development Kit (JDK), ele produz um arquivo com extensão ".class". Esse arquivo ".class" contém o bytecode Java, que é um conjunto de instruções de máquina virtual Java. Esse bytecode é então interpretado pela Máquina Virtual Java (JVM), que o executa em diferentes sistemas operacionais, garantindo assim a portabilidade do código Java. 

## Compilando Java manualmente

Dentro da pasta/diretório onde esta localizado o arquivo .java utilize o comando ´javac nome_do_arquivo.java´. Isto gerará um Bytecode.
Após isso utilize o comando `java nome_do_arquivo` sem a extensão para que seja executado o arquivo.
* O nome da classe pública deve ser exatamento o nome do arquivo.
* Todas as vezes que você altera o códido é necessário compilar novamente.

## Tipos Primitivos

São os tipos que vão reservar em memória um valor simples.
No Java temos 8 tipos primitivos sendo eles: 
* `int`, `double`, `float`, `char`, `byte`, `short`, `long`, `boolean`.
* String não é um tipo primitivo,é uma Classe,um tipo de referência.

# Operadores

## Operadores Aritméticos 

Um operador aritmético é utilizado para realizar cálculos matemáticos entre valores numéricos podendo se tornar ou não algo mais complexo.

* Os operadores aritméticos são: `+` adição, `-` subtração, `*` multiplicação, `/` divisão.
* A adição quando utilizada com variavéis do tipo texto realizará a concatenação de textos.

## Operadores Relacionais

Os operadores Relacionais avaliam a relação entre duas variavéis ou expressões, retornando um valor Booleano.

* Os operadores relacionais são: `==` IGUAL A outra, `!=` DIFERENTE DA outra, `>` MAIOR QUE a outra, `>=` MAIOR OU IGUAL que a outra, `<` MENOR QUE a outra, `<=` MENOR OU IGUAL que a outra.

## Operadores Lógicos

Os operadores Lógicos, representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.

* Os operadores lógicos são: `&&` E, `||` OU.
* `&&` Necessita que as duas condições sejam verdadeiras para executar o código, do outro lado `||` precisa que uma condição seja verdadeira para executar as instruções.

## Operadores de atribuição

Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

* `++` Incremento de valor, `--` Decremento de valor, `!` Negação, `-` nega um número ou expressão numeração, `+` números são positivos sem esse operador explicitamente.
* Outra forma de incrmentar,atribuir e decrementar valores `=`, `+=`, `-=`, `*=`, `/=`, `%=`.
* Ao utilizar `++` ou `--` antes da expressão ele vai incrementar ou decrementar antes de executar.

## Estruturas condicionais

A Estrutura Condicional, possibilita a escolha de um grupo de ações e comportamentos a serem executadas, quando determinadas condições são ou não satisfeitas. A Estrutura Condicional pode ser Simples ou Composta.

* Em um controle de fluxo condicional, utilizamos os operadores `if` e `else`, podendo em operações com uma terceira, quarta ou inúmeras condições utilizar o `else if`.
* Em Java, é comum utilizar o prefixo "is" em métodos de validação ou verificação que retornam um valor booleano. Ex: isEmailValido.
* Além de "is", outros prefixos como "has", "can", "should", etc., também são utilizados para métodos booleanos.
* Há casos onde se existe uma chance de uma variável não ser inicializada se agradara em um erro de compilação, voce pode colocar um valor vazio `= ""` para corrigir,porem ela será sobre escrita.

## Operadores ternários

Como vimos em operadores, podemos abreviar nosso algoritmo condicional, refatorando com o conceito de operador ternário.

* A sintaxe básica : ´(condição) ? true : false´.

## Operadores De Repetição

**For** Permite que uma variável contadora, seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando.

`for(int i = 0;i<=10;i++)`

O loop **for-each** é uma sintaxe simplificada introduzida no Java 5, projetada para iterar diretamente sobre elementos de arrays ou coleções, sem a necessidade de gerenciar explicitamente um índice.

`for (int elemento:array)`

O laço **while**, testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

`while (true){}`

**do / while** testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida, no primeiro teste o bloco será executado pelo menos uma vez.

`do{   }  while`
