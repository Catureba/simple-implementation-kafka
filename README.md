
# Estudos Kafka

Este projeto é um estudo de Kafka, incluindo a configuração de consumidores e produtores para o envio e recebimento de mensagens. Siga as instruções abaixo para configurar o ambiente e rodar o projeto.

## Passo a Passo

### 1. Clonando o Repositório

Clone o repositório para sua máquina local:
```bash
git clone https://github.com/catureba/estudos-kafka.git
cd estudos-kafka
```

### 2. Baixando o Kafka

Baixe o binário do Kafka no site oficial:

[Kafka Downloads](https://kafka.apache.org/downloads)

Após o download, extraia o conteúdo em um diretório de sua preferência.

### 3. Rodando o Zookeeper e o Kafka

Antes de iniciar o Kafka, é necessário rodar o Zookeeper. No diretório onde você extraiu o Kafka, rode os seguintes comandos:

#### Iniciar o Zookeeper
```bash
./bin/zookeeper-server-start.sh config/zookeeper.properties
```

#### Iniciar o Kafka
Em uma nova janela de terminal, rode o comando abaixo para iniciar o Kafka:
```bash
./bin/kafka-server-start.sh config/server.properties
```

### 4. Rodando os Projetos Consumer e Producer

Com o Zookeeper e o Kafka em execução, você pode rodar os projetos **Consumer** e **Producer**. No terminal, navegue até os diretórios dos projetos e execute-os conforme as instruções específicas de cada um (geralmente com `mvn spring-boot:run` ou comandos equivalentes).

### 5. Testando o Endpoint de Pagamentos

Com o Producer rodando, você pode enviar uma mensagem de pagamento fazendo um POST no seguinte endpoint:

**Endpoint**:
```http
POST http://localhost:9090/pagamentos
```

**Body (JSON)**:
```json
{
    "numero": 3,
    "valor": 150,
    "descricao": "Pagamento de serviço"
}
```

Use uma ferramenta como `curl`, Postman, ou Insomnia para enviar a requisição.

---

Pronto! Agora você deve estar com o ambiente Kafka configurado e pronto para testar o fluxo de mensagens entre Producer e Consumer.
