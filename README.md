# Validador CPF/CNPJ 🔍✅

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1-blue)
![License](https://img.shields.io/badge/License-MIT-green)

Um validador eficiente de documentos brasileiros com API REST e interface simples.

## ✨ Funcionalidades
- Validação instantânea de CPF e CNPJ
- Retorno em JSON para integração
- Interface web amigável
- Código aberto e extensível

## 🚀 Como Usar
```bash
# Clone o projeto
git clone https://github.com/muriloalbuquerque/validador-cpf-cnpj.git

# Execute (com Maven)
mvn spring-boot:run
Acesse a API:

http
GET /validar?numero=12345678909
📦 Exemplo de Resposta
json
{
  "numero": "12345678909",
  "valido": true,
  "tipo": "CPF",
  "mensagem": "Documento válido"
}
🤝 Como Contribuir
Faça um fork do projeto

Crie sua branch (git checkout -b feature/incrivel)

Commit suas mudanças (git commit -m 'Add feature incrível')

Push para a branch (git push origin feature/incrivel)

Abra um Pull Request

📜 Licença
MIT - Veja o arquivo LICENSE para detalhes.
