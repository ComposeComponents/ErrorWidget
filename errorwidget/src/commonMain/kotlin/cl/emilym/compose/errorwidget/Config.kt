package cl.emilym.compose.errorwidget

import androidx.compose.runtime.staticCompositionLocalOf

data class ErrorWidgetConfig(
    val errorTitle: String = "Something went wrong",
    val retryButtonText: String = "Retry",
    val genericMessage: String? = null
)

val LocalErrorWidgetConfig = staticCompositionLocalOf { ErrorWidgetConfig() }