# Validador CPF/CNPJ

Este projeto tem como objetivo validar números de CPF e CNPJ, utilizando **Spring Boot** no back-end e uma interface simples para interagir com a API.

## 🚧 Status do Projeto

Atualmente, o projeto está em andamento e apresenta um pequeno problema de integração entre o **front-end** e o **back-end** na versão de produção, que está hospedada na Railway. Isso pode gerar um erro de validação no formulário quando executado na versão online.

**No entanto, o código está funcional localmente e o problema está sendo resolvido**.

---

## 🛠️ Como Rodar Localmente

### 1. Clonar o Repositório

```bash
git clone https://github.com/muriloalbuquerque/validador-cpf-cnpj.git
cd validador-cpf-cnpj
2. Requisitos
Certifique-se de ter os seguintes requisitos instalados em sua máquina:

JDK 17 ou superior

Maven ou Gradle (dependendo da sua preferência)

3. Rodar o Back-end
Dentro da pasta do projeto, execute o seguinte comando para rodar a aplicação com Maven:
mvn spring-boot:run
Se preferir usar o Gradle, o comando será:
./gradlew bootRun
Isso iniciará o back-end na porta 8080, que pode ser acessado via http://localhost:8080.

4. Testar a API
A API estará disponível no endpoint /validar, e você pode testar a validação de CPF ou CNPJ passando o número como parâmetro. Exemplo:
http://localhost:8080/validar?numero=xxxxxxxxx  # CPF
http://localhost:8080/validar?numero=xxxxxxxxxxxxxx  # CNPJ

5. Rodar o Front-end
Caso tenha a parte do front-end separada, siga estas instruções para rodá-lo:

Navegue até a pasta do front-end (separada no repositório).

Execute o comando para instalar as dependências:
npm install
Inicie o servidor de desenvolvimento:
npm start
Isso irá rodar o front-end na porta 3000 (ou conforme configurado) e ele irá se comunicar com a API do back-end.

🔧 Nota
O formulário de validação pode apresentar um erro na versão de produção devido ao problema de integração na Railway. Estamos trabalhando ativamente para corrigir isso.

📌 O que Está por Vir?
Resolver a integração de front-end e back-end na versão de produção.

Melhorias na validação e otimização do código.

Adicionar mais funcionalidades, como a validação de outros documentos.

🔗 Links
GitHub

Aplicação em Produção (Railway) (Atualmente com problemas de integração)

📢 Compartilhe a Jornada!
Este é apenas o começo. Estou trabalhando para deixar o projeto cada vez mais robusto, e este repositório é
uma oportunidade para aprender e melhorar a integração entre front-end e back-end.

