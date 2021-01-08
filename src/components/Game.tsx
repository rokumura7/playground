import Board from 'components/Board'

const Game = () => (
  <div className="game">
    <div className="game-board">
      <Board status={'x'} />
    </div>
    <div className="game-info">
      <div>{/* status */}</div>
      <ol>{/* TODO */}</ol>
    </div>
  </div>
)

export default Game
