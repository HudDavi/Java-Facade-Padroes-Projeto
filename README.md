# Serviço de Cliente e Endereço com Facade

Este é um exemplo simples de um sistema Java que ilustra a separação de responsabilidades entre um serviço de cliente e um serviço de endereço. O objetivo é mostrar como esses serviços podem ser usados em conjunto para salvar informações de cliente e obter informações de endereço com base no CEP.

## Visão Geral

Neste exemplo, temos dois serviços:

1. **ClienteService**: Este serviço é responsável por salvar informações do cliente, como nome e CEP. Ele demonstra como salvar informações de cliente no sistema.

2. **EnderecoService**: Este serviço é responsável por obter informações de endereço com base no CEP fornecido. Ele demonstra como recuperar informações de endereço, como cidade e estado, com base no CEP.

## Uso

Para executar este exemplo:

1. Clone ou faça o download deste repositório para a sua máquina local.
2. Importe o projeto em sua IDE Java preferida.
3. Execute a classe `App` para ver o funcionamento dos serviços de cliente e endereço.

## Estrutura do Projeto

A estrutura do projeto é organizada em pacotes:

- **`app`**: Contém a classe `App`, que é a classe principal para execução do exemplo.
- **`app.service.cliente`**: Contém a classe `ClienteService`, que representa o serviço de cliente.
- **`app.service.endereco`**: Contém a classe `EnderecoService`, que representa o serviço de endereço.

## Funcionalidades

Este projeto demonstra como separar as responsabilidades entre serviços de cliente e endereço:

- O `ClienteService` é responsável por salvar as informações do cliente e exibi-las no sistema.
- O `EnderecoService` é responsável por obter informações de cidade e estado com base no CEP fornecido.

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

## Autor

- Hudson Silva