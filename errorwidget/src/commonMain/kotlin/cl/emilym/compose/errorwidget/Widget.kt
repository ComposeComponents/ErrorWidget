package cl.emilym.compose.errorwidget

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cl.emilym.compose.standardbutton.StandardButton
import cl.emilym.compose.units.rdp

@Composable
fun ErrorWidget(
    exception: Exception?,
    message: String? = null,
    retry: (() -> Unit)? = null
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(0.5.rdp)
    ) {
        Text(LocalErrorWidgetConfig.current.errorTitle, style = MaterialTheme.typography.titleMedium)
        LocalErrorWidgetConfig.current.genericMessage?.let {
            Text(it, style = MaterialTheme.typography.bodyMedium)
        } ?: (message ?: exception?.message)?.let {
            Text(it, style = MaterialTheme.typography.bodyMedium)
        }
        retry?.let {
            StandardButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = { retry() }
            ) {
                Text(LocalErrorWidgetConfig.current.retryButtonText, style = MaterialTheme.typography.labelMedium)
            }
        }
    }

}