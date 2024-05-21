package kata

data class TennisGame(val pointsPlayerOne: Int = 0, val pointsPlayerTwo: Int = 0, val score: String = "Love-Love") {

    companion object {

        fun playerOneWinsPoint(game: TennisGame): TennisGame {
            if (game.pointsPlayerOne == 0)
                return TennisGame(1, 0, "15-Love")
            else if (game.pointsPlayerOne == 1)
                return TennisGame(2, 0, "30-Love")
            else return TennisGame(3, 0, "40-Love")
        }

        fun playerTwoWinsPoint(game: TennisGame): TennisGame {
            return TennisGame(0, 1, "Love-15")
        }
    }
}
