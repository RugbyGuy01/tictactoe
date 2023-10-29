package com.golfpvcc.tictactoe

sealed class UserAction {
    object PlayAgainButtionClicked: UserAction()
    data class BoardTapped(val cellNo: Int): UserAction()

}
