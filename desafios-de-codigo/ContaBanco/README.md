# DIO - Trilha Java Básico

## Desafio de Sintaxe

Este repositório contém a resolução do desafio proposto no módulo de Sintaxe do curso da [DIO](https://www.dio.me/).

### Autor

- **Gleyson Sampaio**

### Aluno Executor

- **Matheus Alexandre Santos**

## Descrição do Desafio

O objetivo deste desafio é exercitar os conceitos apresentados no módulo de Sintaxe do curso. Para isso, foi proposto o seguinte cenário:

### Requisitos

1. Criar um projeto chamado `ContaBanco`.
2. O projeto deve conter uma classe chamada `ContaTerminal.java`.
3. A classe deve receber dados via terminal contendo as seguintes informações:

   | Atributo       | Tipo    | Exemplo        |
   |---------------|--------|--------------|
   | Numero        | Inteiro | 1021         |
   | Agencia       | Texto   | 067-8        |
   | Nome Cliente  | Texto   | MARIO ANDRADE |
   | Saldo         | Decimal | 237.48       |

### Funcionalidades

- O sistema deve solicitar que o usuário insira os dados via terminal.
- Cada entrada deve ser acompanhada de uma mensagem indicando qual informação deve ser fornecida. Exemplo:
  ```
  Por favor, digite o número da Agência:
  ```
- Após a inserção de todos os dados, o sistema deve exibir a seguinte mensagem formatada:
  ```
  Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque.
  ```

### Estrutura de Pastas

```
  dio-java-basico/
  ├── desafios-de-codigo/
  │   ├── ContaBanco/
  │   │   ├── .vscode/
  │   │   ├── src/
  │   │   │   ├── ContaTerminal.java
```

### Conceitos Revisados

- Regras de declaração de variáveis.
- Uso do terminal e da classe `Scanner`.
- Manipulação de strings e concatenação.

## Como Executar

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/ContaBanco.git
   ```
2. Acesse o diretório do projeto:
   ```sh
   cd ContaBanco
   ```
3. Compile o projeto:
   ```sh
   javac src/ContaTerminal.java
   ```
4. Execute o programa:
   ```sh
   java -cp src ContaTerminal
   ```

## Tecnologias Utilizadas

- Java

---

Projeto desenvolvido como parte do curso da **DIO**.

