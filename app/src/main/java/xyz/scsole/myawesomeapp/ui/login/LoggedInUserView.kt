package xyz.scsole.myawesomeapp.ui.login

/**
 * User details post authentication that is exposed to the UI
 *
 * @property displayName The user's display name
 */
data class LoggedInUserView(
        val displayName: String
        //... other data fields that may be accessible to the UI
)