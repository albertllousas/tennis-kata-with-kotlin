package kata

data class TennisGame(val pointsPlayerOne: Int = 0, val pointsPlayerTwo: Int = 0, val score: String = "Love-Love") {

    companion object {

        fun playerOneWinsPoint(game: TennisGame): TennisGame {
            if (game.pointsPlayerOne == 0)
                return TennisGame(game.pointsPlayerOne.inc(), 0, "15-Love")
            else if (game.pointsPlayerOne == 1)
                return TennisGame(game.pointsPlayerOne.inc(), 0, "30-Love")
            else return TennisGame(game.pointsPlayerOne.inc(), 0, "40-Love")
        }

        fun playerTwoWinsPoint(game: TennisGame): TennisGame {
            if (game.pointsPlayerTwo == 0)
                return TennisGame(0, game.pointsPlayerTwo.inc(), "Love-15")
            else if (game.pointsPlayerTwo == 1)
                return TennisGame(0, game.pointsPlayerTwo.inc(), "Love-30")
            return TennisGame(0, game.pointsPlayerTwo.inc(), "Love-40")
        }
    }
}
