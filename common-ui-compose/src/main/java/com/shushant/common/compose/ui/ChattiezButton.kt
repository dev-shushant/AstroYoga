package com.shushant.common.compose.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shushant.common.compose.theme.Typography
import com.shushant.common.compose.theme.buttonColor
import com.shushant.common.compose.theme.textColor

@Composable
fun ChattiezButton(color: Color = buttonColor, buttonText: String, onClickAction: () -> Unit) {
    TextButton(
        onClick = { onClickAction.invoke() },
        shape = RoundedCornerShape(14.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(horizontal = 20.dp)
    ) {
        Text(
            text = buttonText,
            style = Typography.bodyLarge.copy(fontSize = 18.sp),
            color = Color.White,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.width(10.dp))
        Icon(
            imageVector = Icons.Filled.ArrowForward,
            contentDescription = "ArrowForward",
            tint = Color.White
        )
    }
}