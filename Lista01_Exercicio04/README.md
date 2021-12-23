# Exercício 4:

## Crie um novo projeto para este exercício.

**Criar uma classe para representar robôs aspiradores que se deslocam nos eixos X,Y. Utilize as
regras do encapsulamento na criação da classe.
Um robô deve ter sua identificação (número), status (ligado, andando, parado e desligado),
posição X, posição Y, limite de armazenamento do repositório de pó (cm3), porcentagem do
repositório que está sendo usado.
Um robô executa as seguintes operações: ligar, desligar, aspirar, andar, parar.
Implemente um construtor que inicializa o robô como desligado, nas posições X=0 e Y=0,
porcentagem do reservatório em 0.0% e limite de pó informado na criação (parâmetro do
construtor).**

### Requisitos das operações:

* As operações de andar, parar e aspirar não são possíveis se o robô estiver desligado.
* __ligar:__ altera o status do robô para ligado.
* __desligar:__ alterar o status do robô para desligado.
* __andar:__ recebe como parâmetro dois valores que mostram quantos pontos nos eixos X e
Y ele vai andar. A ação soma esses valores recebidos a posição X e Y atual do robô, e
altera o status para andando.
* __aspirar:__ recebe um valor referente à quantidade de pó (cm3) a ser aspirado e atualiza a
porcentagem do repositório que está ocupado. Deve-se observar o limite de pó do
aspirador. Caso atinja o limite, o aspirador deve ser automaticamente desligado e
informado sobre o limite.
* __parar:__ altera o status para parado.

**Criar um método toString para mostrar todos os dados do robô.**

**Criar um programa que instancie dois robôs e execute as operações de ligar, desligar, andar,
parar e aspirar, mostrando os dados do robô depois de cada operação.**