#  Academia API
Este projeto simula uma API RESTful para o gerenciamento de uma academia de ginástica, utilizando os principais conceitos de mapeamento objeto-relacional (ORM) com Spring Data JPA.

##  Entidades Modeladas
### Aluno
- id: Identificador único
- nome: Nome completo com validação de tamanho
- email: Validação de formato
- cpf: Validação de 11 dígitos
- bairro, endereco, telefone: Dados de contato
- dataNascimento: Deve ser uma data passada
- Relacionamentos:
  - Um aluno possui **uma matrícula**
  - Um aluno possui **múltiplas avaliações físicas**

### Matrícula
- id Identificador único
- aluno Relacionamento um-para-um
- dataDaMatricula Data de inscrição
- plano: Tipo de plano contratado
- status: Situação da matrícula
- observacoes: Campo opcional para observações

### Avaliação Física
- id: Identificador único
- aluno: Relacionamento muitos-para-um
- dataDaAvaliacao: Data e hora da avaliação
- peso, altura, imc: Dados físicos com validação positiva
- observacoes: Comentários adicionais

##  Estrutura do Projeto
academia-api/ ├── model/ │   ├── Aluno.java │   ├── AvaliacaoFisica.java │   └── Matricula.java ├── repository/ │   ├── AlunoRepository.java │   ├── AvaliacaoFisicaRepository.java │   └── MatriculaRepository.java ├── README.md

##  Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Data JPA
- Bean Validation (Jakarta)
- Lombok

##  Aprendizados
- Como mapear entidades com JPA
- Como aplicar validações com anotações
- Como estruturar repositórios com JpaRepository
- Como modelar relacionamentos entre objetos

##  Observações
Este projeto é parte de um desafio educacional e foi desenvolvido com foco em aprendizado e portfólio.
