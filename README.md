# 🛡️ SentinelVoice - Intelligent Voice API

[![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.4-brightgreen?style=for-the-badge&logo=springboot)](https://spring.io/projects/spring-boot)
[![Docker](https://img.shields.io/badge/Docker-Enabled-blue?style=for-the-badge&logo=docker)](https://www.docker.com/)

Esta é uma API Inteligente desenvolvida em **Spring Boot** para o desafio de projeto final da **DIO.me**. O foco principal foi criar um serviço robusto capaz de receber e processar arquivos de áudio, preparando a base para integrações com modelos de Reconhecimento de Fala (Speech-to-Text).

---

## 🚀 Diferenciais de Engenharia (DevOps Mindset)

Durante o desenvolvimento em ambiente restrito, foram aplicadas soluções de infraestrutura para garantir a portabilidade:

* **Docker Multi-stage Build:** A aplicação utiliza um estágio de compilação (Maven) e um estágio de execução leve (JRE), reduzindo o tamanho da imagem e aumentando a segurança.
* **Resiliência de Ambiente:** Configuração manual do Maven Wrapper e contorno de ausência de JDK local via containerização.
* **Arquitetura Limpa:** Separação clara entre Controllers e lógica de negócio.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17
* **Framework:** Spring Boot 3.2.4
* **Gerenciador de Dependências:** Maven
* **Containerização:** Docker
* **Documentação:** Markdown

---

## 📦 Como Executar o Projeto

### Pré-requisitos
* Docker instalado

### Passo a Passo
1.  **Build da Imagem:**
    ```bash
    docker build -t sentinel-voice-api .
    ```

2.  **Execução do Container:**
    (Mapeando para a porta 8081 para evitar conflitos locais)
    ```bash
    docker run -d -p 8081:8080 --name sentinel-api sentinel-voice-api
    ```

---

## 🧪 Testando a API

Para validar o funcionamento, você pode enviar um arquivo (áudio ou texto para teste) via `curl`:

```bash
curl -X POST http://localhost:8081/api/v1/voice/transcribe \
  -F "file=@pom.xml"
```

**Resposta esperada:** `Sentinel recebeu: pom.xml`

---

## 👨‍💻 Autor

**João Breno da Silva** Estagiário DevOps | Estudante de TI na Estácio de Sá

---
*Projeto desenvolvido para fins educacionais na plataforma [DIO.me](https://www.dio.me/)*
