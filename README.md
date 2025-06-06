# ♟️ Chess System - Projeto Java POO

Projeto de um **jogo de xadrez** desenvolvido **inteiramente em Java**, com execução no **terminal**, utilizando de forma prática e completa os **pilares da Programação Orientada a Objetos (POO)**.

---

## 🧠 Princípios da POO Aplicados

| Pilar         | Como foi aplicado no projeto                                 |
|---------------|--------------------------------------------------------------|
| **Encapsulamento** | Uso de atributos privados com acesso via métodos públicos (`get`/`set`). Exemplo: `Piece`, `Position`. |
| **Abstração**      | Classes como `Piece`, `Board` e `ChessPiece` escondem os detalhes da implementação do jogo. |
| **Herança**        | `Bishop`, `Knight`, `Queen` e outras peças herdam de `ChessPiece`, que por sua vez herda de `Piece`. |
| **Polimorfismo**   | Cada peça sobrescreve seu próprio método de movimentação (`possibleMoves()`), representando **polimorfismo por sobrescrita**. |

---

## 📂 Pacotes

- `boardgame`: Estrutura genérica de um tabuleiro e peças. Pode ser reaproveitada para outros jogos.
- `chess`: Implementa a lógica do xadrez, incluindo movimentos válidos, regras, capturas, cheque e promoção.
- `chess.pieces`: Contém as classes específicas de cada peça, com seu comportamento exclusivo.
- `UI`: Interface de texto para interação com o usuário no terminal.
- `Program`: Classe principal (`main`) que inicia a aplicação.

---

## 💻 Execução no Terminal

- Jogo é totalmente baseado em **texto no terminal**.
- O usuário digita coordenadas para movimentar as peças (ex: `e2` → `e4`).
- O sistema exibe o tabuleiro atualizado a cada jogada.

---

## ⚙️ Requisitos

- Java 17+
- Terminal com suporte UTF-8 (para melhor visualização do tabuleiro)

---

## 📪 Recursos e Funcionalidades

-  **Validação completa de jogadas**
-  **Captura de peças**
-  **Promoção de peão** (escolha de nova peça ao alcançar a última linha)
- ♟ **Movimentos especiais implementados:**
  -  **Roque pequeno e grande** (movimento simultâneo do rei e da torre)
  -  **En Passant** (captura especial de peão adversário que avançou duas casas)
  -  **Xeque e Xeque-Mate** (validação automática do estado do rei)
-  **Impedimento de jogadas ilegais** que coloquem ou mantenham o próprio rei em xeque
-  **Histórico e controle de turnos**
-  **Detecção de fim de jogo**
-  Estrutura modular baseada em camadas e pacotes reaproveitáveis (`boardgame`, `chess`, `pieces`)
-  Sistema robusto de **tratamento de exceções** (`ChessException`, `BoardException`)
-  **Interface de usuário no terminal** com visualização clara do tabuleiro
-  Arquitetura clara, extensível e orientada a objetos

---

## 📚 Aprendizados

Esse projeto é ideal para consolidar:

- Domínio de Java básico e intermediário
- Estruturação de pacotes
- Aplicação real dos pilares da POO
- Boas práticas de organização e reutilização de código

---

## 🛠️ Próximos Passos

- Criar testes unitários
- Interface gráfica com JavaFX





