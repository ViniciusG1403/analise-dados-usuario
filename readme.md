## Análise de Comportamento de Usuários em E-commerce
Este projeto é uma aplicação de análise de comportamento de usuários em um site de e-commerce, desenvolvido como parte de um portfólio pessoal para demonstrar habilidades em tecnologias de big data.

Tecnologias Utilizadas

Java Spring: Framework para o desenvolvimento de aplicativos web e serviços RESTful.

Apache Kafka: Plataforma de streaming distribuída para ingestão de dados em tempo real.

Apache Spark: Motor de processamento unificado para análise de dados em larga escala.

Apache Cassandra: Banco de dados NoSQL distribuído para armazenamento de dados escalável e de alta disponibilidade.
Objetivo do Projeto

O objetivo deste projeto é coletar, processar e analisar dados de navegação de usuários em um site de e-commerce. Através da análise desses dados,
pretendemos oferecer insights valiosos para melhorar a experiência do usuário e aumentar as vendas. As principais funcionalidades incluem:

Captura de Dados: Utilização do Kafka para ingestão de eventos de navegação dos usuários em tempo real.

Processamento em Tempo Real: Utilização do Spark Streaming para processar os dados conforme são recebidos do Kafka.

Análise de Padrões de Comportamento: Aplicação de algoritmos de machine learning para identificação de padrões de comportamento dos usuários, como segmentação de clientes e tendências de compra.

Armazenamento de Dados: Utilização do Cassandra para armazenamento eficiente dos dados brutos e processados.
Dashboard de Visualização: Desenvolvimento de um dashboard usando Spring Boot e React/Angular para visualização dos insights gerados.
Como Utilizar

### Para executar o projeto localmente, siga os passos abaixo:

Configuração do Ambiente:

Instale o Java JDK, Apache Kafka, Apache Spark e Apache Cassandra.
Configure as variáveis de ambiente necessárias para cada uma dessas ferramentas.

Configuração do Projeto:

Clone este repositório em sua máquina local.
Configure as propriedades de conexão com o Kafka, Spark e Cassandra no arquivo de configuração correspondente (por exemplo, application.properties para Spring Boot).
Execução do Projeto:

Inicie os serviços do Kafka, Spark e Cassandra conforme necessário.
Inicie a aplicação Spring Boot para iniciar a ingestão, processamento e análise de dados.