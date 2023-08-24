## PROJETO CRIADO COM O OBJETIVO DE FIXAÇÃO DO CONTEÚDO APRENDIDO NO CURSO

Este documento consiste na abordagem dos *Padrões de Projeto Comportamentais*

---

## Chain of Responsibility (Ninguém solta a mão de ninguém)

Evita acoplar o remetente de uma requisição ao seu destinatário ao dar a mais de um objeto a chance de servir a
requisição. Compõe os objetos em cascata e passa a requisição pela corrente até que um objeto a sirva.

Problemas abordados:

1. Como posso evitar o acoplamento entre o remetente de uma solicitação e seu receptor?
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

1. Como um objeto pode capturar seu estado interno para poder ser restaurado posteriormente?

Solução definida:

1. Definir uma estrutura de memento onde cada estado poderá ser salvo e restaurado quando necessário.

---