# Sistema de Gestão de ONG

## ✅ Checklist de Implementação

### 1. Superclasse `MembroONG`
- [x] Atributo privado `nome` (String)
- [x] Atributo privado `cpf` (String)
- [x] Atributo privado `diasAtuacao` (int)
- [x] Getter e Setter para todos os atributos
- [x] `setDiasAtuacao()` rejeita valores negativos
- [x] Método `exibirResumo()` imprime nome e dias de atuação

### 2. Subclasse `Voluntario`
- [ ] Herda de `MembroONG` com `extends`
- [ ] Atributo específico `setor` (String)
- [ ] Getter e Setter para `setor`
- [ ] `@Override` em `exibirResumo()` incluindo o setor

### 3. Subclasse `Doador`
- [ ] Herda de `MembroONG` com `extends`
- [ ] Atributo específico `valorDoadoMensal` (double)
- [ ] Getter e Setter para `valorDoadoMensal`
- [ ] `@Override` em `exibirResumo()` exibindo "Doador Ativo" e o valor

### 4. Classe `ProjetoSocial`
- [ ] Atributo `nomeDoProjeto` (String)
- [ ] Atributo `metaImpacto` (int)
- [ ] Atributo `lider` do tipo `Voluntario` (composição)
- [ ] Método `iniciarProjeto()` imprime nome do projeto, líder e setor

### 5. Classe `SistemaMain`
- [ ] Contém o método `main`
- [ ] Instancia um `Voluntario` e preenche via Setters
- [ ] Instancia um `Doador` e preenche via Setters
- [ ] Instancia um `ProjetoSocial`
- [ ] Atribui o voluntário como líder do projeto
- [ ] Chama `exibirResumo()` do voluntário
- [ ] Chama `exibirResumo()` do doador
- [ ] Chama `iniciarProjeto()` do projeto

### 6. Entrega
- [ ] Código no GitHub (repositório público)
- [ ] Prints de execução do programa
- [ ] Link do repositório enviado no Google Forms
- [ ] Entregue até **16/06/2026 às 23:59**