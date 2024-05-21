package kata

data class TennisGame(val pointsPlayerOne: Int = 0, val pointsPlayerTwo: Int = 0, val score: String = "Love-Love") {

    companion object {

        fun playerOneWinsPoint(game: TennisGame): TennisGame {
            val playersOnePoints = game.pointsPlayerOne.inc()
            val playersOneScore = if (playersOnePoints == 1) "15" else if (playersOnePoints == 2) "30" else "40"
            return TennisGame(playersOnePoints, 0, "$playersOneScore-Love")
        }

        fun playerTwoWinsPoint(game: TennisGame): TennisGame {
            val playersTwoPoints = game.pointsPlayerTwo.inc()
            val playersTwoScore = if (playersTwoPoints == 1) "15" else if (playersTwoPoints == 2) "30" else "40"
            val playersOneScore = if (game.pointsPlayerOne == 0) "Love" else if (game.pointsPlayerOne == 1) "15" else if (game.pointsPlayerOne == 2) "30" else "40"
            return TennisGame(game.pointsPlayerOne, playersTwoPoints, "$playersOneScore-$playersTwoScore")
        }
    }
}
