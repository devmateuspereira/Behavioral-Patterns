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