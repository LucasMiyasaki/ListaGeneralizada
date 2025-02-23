# Projeto: Implementação de Lista Generalizada em Java

## Descrição
Este projeto implementa uma estrutura de dados de **Lista Generalizada** (LG) em Java. A lista generalizada permite armazenar tanto **átomos** (valores simples) quanto **outras listas**, criando uma estrutura aninhada. (Projeto ainda em andamento)

Exemplo de lista generalizada: `[aaa, [bbb, ccc], ddd, [eee, [ ], fff]]`

## Estrutura do Projeto
O projeto é composto pelas seguintes classes:

- **Elemento (abstract)**: Classe base abstrata para representar um elemento da lista, podendo ser um átomo ou uma sublista.
- **Atomo**: Subclasse de `Elemento` que armazena uma informação textual (`info`).
- **No**: Também uma subclasse de `Elemento`, representa um nó da lista generalizada, contendo:
  - `cabeca`: Aponta para um elemento (`Atomo` ou outro `No`).
  - `cauda`: Aponta para o próximo nó da lista.
- **ListaGen**: Classe principal para a manipulação da lista generalizada, com métodos para:
  - `gerarLista(String)`: Constrói a lista generalizada a partir de uma representação em string.
- **Main**: Classe responsável por executar o programa.

## Requisitos
- Java 8 ou superior.

## Como Executar
1. Clone ou baixe o repositório.
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```
2. Abra o projeto em uma IDE como Eclipse ou IntelliJ.
3. Compile e execute a classe `Main`.
