# Sistema de Gestão de ONG

Sistema desenvolvido em Java aplicando os pilares da Programação Orientada a Objetos: **Encapsulamento**, **Herança** e **Composição**.

---

## Tecnologias

- Java 21+

---


## Estrutura do Projeto

```text
root/
├── MembroONG.java
├── Voluntario.java
├── Doador.java
├── ProjetoSocial.java
└── SistemaMain.java

```

## Fluxo do Sistema

```
SistemaMain
│
├── instancia Voluntario via construtor + Setters (com validação)
├── instancia Doador via construtor + Setters (com validação)
│
├── instancia ProjetoSocial
│   └── recebe Voluntario como lider (composição)
│
├── Voluntario.exibirResumo()
├── Doador.exibirResumo()
└── ProjetoSocial.iniciarProjeto()
```

## Arquitetura das Classes

```
MembroONG
├── Voluntario (extends MembroONG)
└── Doador (extends MembroONG)

ProjetoSocial
└── lider: Voluntario (composição)
```

### Estrutura das Classes

- `MembroONG` — superclasse com os atributos comuns a todos os membros.
- `Voluntario` e `Doador` — herdam de `MembroONG`, cada um com seu atributo específico.
- `ProjetoSocial` — classe independente que referencia um `Voluntario` como líder.


##  Checklist de Implementação

### 1. Superclasse `MembroONG`
- [x] Atributo privado `nome` (String)
- [x] Atributo privado `cpf` (String)
- [x] Atributo privado `diasAtuacao` (int)
- [x] Getter e Setter para todos os atributos
- [x] `setDiasAtuacao()` rejeita valores negativos
- [x] Método `exibirResumo()` imprime nome e dias de atuação

### 2. Subclasse `Voluntario`
- [x] Herda de `MembroONG` com `extends`
- [x] Atributo específico `setor` (String)
- [x] Getter e Setter para `setor`
- [x] `@Override` em `exibirResumo()` incluindo o setor

### 3. Subclasse `Doador`
- [x] Herda de `MembroONG` com `extends`
- [x] Atributo específico `valorDoadoMensal` (double)
- [x] Getter e Setter para `valorDoadoMensal`
- [x] `@Override` em `exibirResumo()` exibindo "Doador Ativo" e o valor

### 4. Classe `ProjetoSocial`
- [x] Atributo `nomeDoProjeto` (String)
- [x] Atributo `metaImpacto` (int)
- [x] Atributo `lider` do tipo `Voluntario` (composição)
- [x] Método `iniciarProjeto()` imprime nome do projeto, líder e setor

### 5. Classe `SistemaMain`
- [x] Contém o método `main`
- [x] Instancia um `Voluntario` e preenche via Setters
- [x] Instancia um `Doador` e preenche via Setters
- [x] Instancia um `ProjetoSocial`
- [x] Atribui o voluntário como líder do projeto
- [x] Chama `exibirResumo()` do voluntário
- [x] Chama `exibirResumo()` do doador
- [x] Chama `iniciarProjeto()` do projeto
