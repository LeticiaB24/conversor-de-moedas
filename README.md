# Conversor de Moedas

Este projeto é um Conversor de Moedas desenvolvido em Java, focado na interação textual via console. Ele permite aos usuários realizar conversões entre diferentes moedas, obtendo as taxas de câmbio dinamicamente através de uma API externa, garantindo dados precisos e em tempo real.

## Objetivo do Projeto

O principal objetivo deste desafio de programação foi desenvolver um Conversor de Moedas que oferecesse uma interação textual intuitiva (via console) com os usuários. O sistema proporciona um menu com no mínimo 6 opções distintas de conversões de moedas. Um ponto crucial do projeto é que a taxa de conversão não é estática, mas sim obtida dinamicamente por meio de uma API de taxas de câmbio, assegurando a precisão e a atualização dos dados para uma experiência mais eficaz.

## Requisitos Técnicos e Implementação

O desenvolvimento deste projeto seguiu os seguintes passos e requisitos técnicos:

- **Configuração do Ambiente Java:** O projeto foi configurado para ser executado em um ambiente Java padrão, utilizando o Maven para gerenciamento de dependências.

- **Criação do Projeto:** A estrutura do projeto foi organizada para facilitar o desenvolvimento e a manutenção, seguindo as convenções de um projeto Java.

- **Consumo da API:** A aplicação realiza requisições a uma API de taxas de câmbio para obter as cotações mais recentes. Isso garante que as conversões sejam baseadas em dados em tempo real.

- **Análise da Resposta JSON:** Após a requisição à API, a aplicação é capaz de manipular e analisar os dados retornados no formato JSON, extraindo as informações necessárias para as conversões.

- **Filtro de Moedas:** O sistema permite filtrar e exibir as moedas de interesse para o usuário, oferecendo um menu claro para a seleção das opções de conversão.

- **Exibição de Resultados aos Usuários:** Os resultados das conversões são exibidos de forma clara e compreensível no console, juntamente com um histórico das operações realizadas.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação principal.
- **Maven:** Ferramenta de automação de build e gerenciamento de dependências.
- **API de Taxas de Câmbio:** Para obter dados de conversão em tempo real (a URL da API específica pode ser configurada ou está embutida no código).
- **JSON:** Formato de dados utilizado para a comunicação com a API.

## Como Executar o Projeto

Para executar este projeto localmente, siga os passos abaixo:

### Pré-requisitos

- Java Development Kit (JDK) 11 ou superior.
- Maven 3.x ou superior.
- Git.

### Passos

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/LeticiaB24/conversor-de-moedas.git
    cd conversor-de-moedas
    ```

2.  **Compile o projeto:**
    ```bash
    mvn clean install
    ```

3.  **Execute a aplicação:**
    ```bash
    mvn exec:java -Dexec.mainClass="br.com.currencyconverter.main.ConversorDeMoedas"
    ```

    A aplicação será iniciada no console, apresentando o menu de opções.

## Estrutura do Projeto

```
conversor-de-moedas/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/
│   │   │       └── com/
│   │   │           └── currencyconverter/
│   │   │               ├── api/             # Classes para consumo da API
│   │   │               ├── main/            # Classe principal da aplicação
│   │   │               │   └── ConversorDeMoedas.java
│   │   │               └── model/           # Classes de modelo (Moeda, Historico, Conversao, MoedaDisponivel)
│   │   └── resources/
├── pom.xml                  # Arquivo de configuração do Maven
└── README.md                # Este arquivo
```

## Contribuição

Este projeto foi desenvolvido por Leticia Barauna como parte de um desafio de programação do ONE - Oracle Next Education.

## Licença

Este projeto está licenciado sob a licença MIT. 
