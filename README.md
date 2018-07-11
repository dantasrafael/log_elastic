# log_elastic
Testando a integração do LOG do Spring Boot no ElasticSearch

ETAPAS:
1) Instalar o Elasticsearch:
- Faça o download do arquivo zip elasticsearch em https://www.elastic.co/downloads/elasticsearch
- Extraia para um diretório (descompacte-o)
- Execute-o (bin/elasticsearch.bat)
- Verifique se ele é executado usando http://localhost:9200

2) Instale o Kibana 4:
- Faça o download do arquivo Kibana em https://www.elastic.co/downloads/kibana
- Extraia para um diretório (descompacte-o)
- Execute-o (bin/kibana.bat)
- Verifique se ele é executado usando http://localhost:5601

3) Instalar o Logstash:
- Faça o download do zip do Logstash em https://www.elastic.co/downloads/logstash
- Extraia para um diretório (descompacte-o)

4) Configurar o arquivo de log do Spring Boot:
- No arquivo (application.properties) adicionar a seguinte linha: logging.file=application.log
- O Spring Boot agora registrará as mensagens de nível ERROR, WARN e INFO no application.log e também irá rotacioná-lo quando atingir 10 Mb.

5) Configurar o Logstash para entender o formato do arquivo de log do Spring Boot:
- Criar o arquivo de configuração (logstash.conf) na raiz do projeto
- Executar no terminal (/"caminho do logstash"/bin/logstash -f logstash.conf)

6) Configurar o Kibana:
- Abrir o navegador http://localhost:5601
- Configurar os índices do logstash (padrão: logstash-YYYY.MM.DD)