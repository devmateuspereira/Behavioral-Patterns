## PROJETO CRIADO COM O OBJETIVO DE FIXAÇÃO DO CONTEÚDO APRENDIDO NO CURSO

Este documento consiste na abordagem dos *Padrões de Projeto Comportamentais*

---

## Chain of Responsibility (Ninguém solta a mão de ninguém)

Evita acoplar o remetente de uma requisição ao seu destinatário ao dar a mais de um objeto a chance de servir a
requisição. Compõe os objetos em cascata e passa a requisição pela corrente até que um objeto a sirva.

Problemas abordados:

1. Como posso evitar o acoplamento entre o remetente de uma solicitação e o seu receptor?
2. Como permitir que mais que um objeto possa atender alguma requisição?

Soluções definidas:

1. Definir uma cadeia de objetos onde cada um poderá responder àquela solicitação ou enviar para o próximo objeto
   tratá-la.
2. Quem faz a solucitação não precisa saber o tamanho da cadeia, ou mesmo como (por quem) ela será resolvida.

---

## Memento (Checkpoint!)

Sem violar o encapsulamento, capturar e externalizar o estado interno de um objeto para que o objeto possa ter esse
estado restaurado posteriormente.

Problema abordado:

1. Como um objeto pode capturar o seu estado interno para poder ser restaurado posteriormente?

Solução definida:

1. Definir uma estrutura de memento onde cada estado poderá ser salvo e restaurado quando necessário.

---

## Command (Just do it!)

Encapsular uma requisição como um objeto, permitindo que clientes parametrizem diferentes requisições, filas ou
requisições de log, e suportar operações reversíveis.

Problemas abordados:

1. Como posso representar uma requisição dentro de um objeto?
2. Preciso fazer uma requisição, mas não sei como ela será resolvida ou até mesmo quem irá respondê-la?

Soluções definidas:

1. Encapsular a requisição em um objeto command separado
2. O comando não tem os detalhes de quem e como será resolvido

---

## Iterator (Primeiro ele, depois ele alí e depois aquele lá...)

Prover uma maneira de acessar os elementos de um objeto agregado sequencialmente sem expor uma representação interna.

Problema abordado:

1. Como posso navegar através de uma coleção de objetos sem a necessidade de conhecer os detalhes desta estrutura?

Solução definida:

1. Encapsular a lógica de navegação entre os elementos desta coleção em uma estrutura de iterator

---

## Mediator (Apenas um garoto de recados)

Definir um objeto que encapsula como um conjunto de objetos interagem. Meditor promove acoplamento fraco ao manter
objetos que não se referem um ao outro explicitamente, permitindo variar a sua interação independentemente.

Problemas abordados:

1. Como posso reduzir o acoplamento entre objetos que precisam se comunicar?
2. Como posso deixar a interação entre objetos mais dinâmica?

Soluções definidas:

1. Utilizar uma estrutura de mediator para encapsular a forma em que os objetos se comunicarão
2. Os objetos não precisam se conhecer, pois, toda a interação será realizada através do mediator

---

## Observer (Don't call me, I'll call you!)

Definir uma dependência um-para-muitos entre objetos para que quando um objeto mudar de estado, todos os seus
dependentes sejam notificados e atualizados automaticamente.

Problemas abordados:

1. Como posso modelar um relacionamento 1-N sem deixar todos eles acoplados?
2. Como um objeto pode notificar outros objetos quando necessário?

Solução definida:

1. Criar uma estrutura de observer para ele poder notificar todos os objetos que solicitaram ser avisados quando um
   determinado evento ocorra

---

## State (A Máquina de Turing)

Permitir a um objeto alterar o seu comportamento quanto o seu estado interno mudar. O objeto irá aparentar mudar de
classe.

Problemas abordados:

1. Como posso alterar o comportamento de um objeto quando o seu estado interno muda?
2. Como permitir que novos comportamentos sejam adicionados e integrados com os demais?

Soluções definidas:

1. Modelas os comportamentos através de states
2. Definir como serão realizadas as mudanças de estados
3. Cada state irá tomar controle da execução conforme o estado interno do objeto

---

## Strategy (Do grego Strategy)

Definir uma família de algoritmos, encapsulas cada um, e fazê-los intercambiáveis. Strategy permite que algoritmos mudem
independentemente entre clientes que os utilizam.

Problemas abordados:

1. Como uma classe pode utilizar um algoritmo definido dinamicamente?
2. Como posso selecionar e trocar uma lógica em tempo de execução?

Soluções definidas:

1. Encapsular os algoritmos possíveis para o mesmo problema em uma estrutura de strategy
2. O cliente irá delegar a execução para estas estratégias ao invés de possuir toda a lógica internamente

---

## Template Method (Não sei se percebeu, mas isso aqui é um template...)

Definir o esqueleto de um algoritmo dentro de uma operação, deixando alguns passos a serem preenchidos pelas subclasses.
Template Method permite que as suas subclasses redefinam certos passos de um algoritmo sem mudar a sua estrutura.

Problemas abordados:

1. Como posso unir partes de um código que não variam com partes variáveis?
2. Como posso alterar certos pontos do código mantendo uma estrutura?

Soluções definidas:

1. Definir uma abstração com todos os pontos que podem ser variados
2. Criar um template que contenha as partes fixas e possua pontos de chamadas para as partes variáveis