Exercício 3:
Crie um novo projeto para este exercício.

3.1) Crie uma nova classe para moradores aplicando as regras de encapsulamento, ou seja,
escondendo os atributos e publicando métodos de acesso. As informações do morador são: ID,
nome, CPF, telefone, data de nascimento, sexo e código de acesso. O diagrama UML de
morador é mostrado abaixo.

O atributo ID é um número sequencial gerado automaticamente a cada nova instância criada.
Utilize atributo estático para auxiliar nessa tarefa.

3.2) Crie um programa de cadastro para instanciar alguns moradores usando os métodos de
acesso criados no item 3.1. As instâncias criadas devem ser armazenadas em listas (usar
ArrayList ou outro tipo de lista dinâmica). Ao final, varrer a lista e mostrar todos os moradores
cadastrados.

3.3) Crie uma classe para representar os apartamentos de um edifício, seguindo regras de
encapsulamento. Cada apartamento tem as seguintes informações: bloco (A, B, C, etc.), andar,
número (101, 201, 404, etc.), metragem, situação (alugado, financiado, quitado) e uma lista de
moradores, conforme o diagrama UML abaixo.

A lista de moradores deve ser armazenada utilizando um ArrayList (ou outra lista dinâmica).

A atualização do andar e apartamento deve ser feita em um único método, pois deve-se
verificar se o número do apartamento é condizente com o andar. Por exemplo, para o andar “1”
é permitido apenas número “1XX” (101, 112, 121, etc.). Considere que o número sempre terá 3
dígitos.
Página
