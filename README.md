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


## 🚀 Como usar
Clone o projeto:

```bash
git clone https://github.com/muriloalbuquerque/validador-cpf-cnpj.git
```

Execute com Maven:

```bash
mvn spring-boot:run
```

Acesse a API:

```
GET /validar?numero=12345678909
```

---

## 📦 Exemplo de resposta

```json
{
  "numero": "12345678909",
  "valido": true,
  "tipo": "CPF",
  "mensagem": "Documento válido"
}
```

---

## 🤝 Como contribuir

1. Faça um fork do projeto
2. Crie sua branch:  
   ```bash
   git checkout -b feature/incrivel
   ```
3. Commit suas mudanças:  
   ```bash
   git commit -m "Add feature incrível"
   ```
4. Push para a branch:  
   ```bash
   git push origin feature/incrivel
   ```
5. Abra uma pull request

## 📜 Licença
[MIT - Veja o arquivo LICENSE para detalhes](LICENSE)
