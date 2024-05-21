package kata

data class TennisGame(val pointsPlayerOne: Int = 0, val pointsPlayerTwo: Int = 0, val score: String = "Love-Love") {

    companion object {

        fun playerOneWinsPoint(game: TennisGame): TennisGame {
            val playersOnePoints = game.pointsPlayerOne.inc()
            if (game.pointsPlayerOne == 0)
                return TennisGame(playersOnePoints, 0, "15-Love")
            else if (game.pointsPlayerOne == 1)
                return TennisGame(playersOnePoints, 0, "30-Love")
            else return TennisGame(playersOnePoints, 0, "40-Love")
        }

        fun playerTwoWinsPoint(game: TennisGame): TennisGame {
            val playersTwoPoints = game.pointsPlayerTwo.inc()
            if (game.pointsPlayerTwo == 0)
                return TennisGame(0, playersTwoPoints, "Love-15")
            else if (game.pointsPlayerTwo == 1)
                return TennisGame(0, playersTwoPoints, "Love-30")
            return TennisGame(0, playersTwoPoints, "Love-40")
        }
    }
}
