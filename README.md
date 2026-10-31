# Java OO: Bytebank

Projeto de estudo de orientação a objetos em Java, com um modelo simples de conta bancária.

## Conceitos praticados

- **Encapsulamento:** atributos privados com getters e setters em `Cliente` e `Conta`
- **Construtores:** `Conta` recebe agência e número ao ser criada
- **Membros estáticos:** `Conta.getTotal()` conta as contas criadas
- **Composição:** uma `Conta` tem um `Cliente` como titular

## Como executar

Com o JDK instalado:

```bash
cd bytebank-encapsulado
javac -encoding UTF-8 -d bin src/*.java
java -cp bin TestaGetESet
java -cp bin TestaValores
```
