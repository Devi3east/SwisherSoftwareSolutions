package com.example.swishersoftwaresolutions.components

import androidx.compose.runtime.Composable
import com.example.swishersoftwaresolutions.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.px

@Composable
fun RightSide(
    breakpoint: Breakpoint
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(right = 15.px)
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier
                    .height((Res.Dimens.MAX_CARD_HEIGHT - 24).px)
            )
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .objectFit(ObjectFit.Contain),
            src = Res.Image.CODE_TWO
        )
    }
}