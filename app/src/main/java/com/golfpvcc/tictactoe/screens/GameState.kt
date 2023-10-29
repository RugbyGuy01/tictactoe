package com.golfpvcc.tictactoe.screens

data class GameState(
    val playerCircleCount: Int = 0,
    val playerCrossCount: Int = 0,
    val drawCount: Int = 0,
    val hintText: String = "Player '0' turn",
    val currentTurn: BoardCellValue = BoardCellValue.CIRCLE,
    val victorType: VictoryType = VictoryType.NONE,
    val hasWon: Boolean = false
)

enum class BoardCellValue {
    CIRCLE,
    CROSS,
    NONE
}

enum class VictoryType {
    HORIZONALLINE1,
    HORIZONALLINE2,
    HORIZONALLINE3,
    VERTICALLINE1,
    VERTICALLINE2,
    VERTICALLINE3,
    DIAGONALLINE1,
    DIAGONALLINE2,
    NONE
}