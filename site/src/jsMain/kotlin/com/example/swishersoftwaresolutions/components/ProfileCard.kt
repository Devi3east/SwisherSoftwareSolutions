package com.example.swishersoftwaresolutions.components

import androidx.compose.runtime.Composable
import com.example.swishersoftwaresolutions.util.Res
import com.varabyte.kobweb.compose.css.Height
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.ui.thenIf
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ProfileCard() {
    val breakpoint = rememberBreakpoint()

    SimpleGrid(
        numColumns = numColumns(base = 1, md = 2),
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint <= Breakpoint.MD) 100.percent
                else Res.Dimens.MAX_CARD_WIDTH.px
            )
            .height(Height.FitContent)
            .boxShadow(
                color = Colors.Black.copy(alpha = 10),
                blurRadius = 50.px,
                spreadRadius = 50.px
            )
            .padding(all = 12.px)
            .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
            .background(Colors.White)
    ) {
        LeftSide(breakpoint)
        RightSide(breakpoint)
    }
}