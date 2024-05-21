package kata

data class TennisGame(val pointsPlayerOne: Int = 0, val pointsPlayerTwo: Int = 0, val score: String = "Love-Love") {

    companion object {

        fun playerOneWinsPoint(game: TennisGame): TennisGame {
            val playersOnePoints = game.pointsPlayerOne.inc()
            val playersOneScore = if (playersOnePoints == 1) "15" else if (playersOnePoints == 2) "30" else "40"
            if (game.pointsPlayerOne == 0)
                return TennisGame(playersOnePoints, 0, "$playersOneScore-Love")
            else if (game.pointsPlayerOne == 1)
                return TennisGame(playersOnePoints, 0, "$playersOneScore-Love")
            else return TennisGame(playersOnePoints, 0, "$playersOneScore-Love")
        }

        fun playerTwoWinsPoint(game: TennisGame): TennisGame {
            val playersTwoPoints = game.pointsPlayerTwo.inc()
            val playersTwoScore = if (playersTwoPoints == 1) "15" else if (playersTwoPoints == 2) "30" else "40"
            if (game.pointsPlayerTwo == 0)
                return TennisGame(0, playersTwoPoints, "Love-$playersTwoScore")
            else if (game.pointsPlayerTwo == 1)
                return TennisGame(0, playersTwoPoints, "Love-$playersTwoScore")
            return TennisGame(0, playersTwoPoints, "Love-$playersTwoScore")
        }
    }
}
