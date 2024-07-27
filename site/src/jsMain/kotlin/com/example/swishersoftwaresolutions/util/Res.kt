package com.example.swishersoftwaresolutions.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        LIGHT_GRAY(color = Color.rgb(r = 176, g = 176, b = 176)),
        DARK_GRAY(color = Color.rgb(r = 84, g = 84, b = 84)),
        MY_LIGHT_BLUE(color = Color.rgb(r = 98, g = 223, b = 254)),
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
        LIGHT_BLUE(color = Color.rgb(r = 168, g = 236, b = 255)),
        DARK_BLUE(color = Color.rgb(r = 34, g = 63, b = 94)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 230, g = 230, b = 230)),
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 48, g = 82, b = 118)),
        GRADIENT_ONE(color = Color.rgb(r = 161, g = 196, b = 253)),
        GRADIENT_ONE_DARK(color = Color.rgb(r = 19, g = 38, b = 58)),
        GRADIENT_TWO(color = Color.rgb(r = 194, g = 233, b = 251)),
        GRADIENT_TWO_DARK(color = Color.rgb(r = 20, g = 46, b = 73))
    }

    object Icon {
        const val EMAIL_LIGHT = "mail.svg"
        const val EMAIL_DARK = "mail_light.svg"
        const val VRBO_ICON = "vrbo_icon.png"
        const val FACEBOOK_LIGHT = "facebook_light.svg"
        const val FACEBOOK_DARK = "facebook_dark.svg"
        const val FACEBOOK_LIGHT_BLUE = "facebook_light_blue.svg"
        const val MAIL_LIGHT_BLUE = "mail_light_blue.svg"
        const val GITHUB = "github.svg"
        const val GITHUB_LIGHT = "github_light.svg"
        const val INSTAGRAM = "instagram.svg"
        const val INSTAGRAM_LIGHT = "instagram_light.svg"
        const val GITLAB = "gitlab.svg"
        const val GITLAB_LIGHT = "gitlab_light.svg"
        const val SUN = "sun.svg"
        const val MOON = "moon.svg"
    }

    object Image {
        const val HOUSE_PICTURE_TWO = "house_picture_two.jpeg"
        const val CODING_ONE = "coding_one.jpg"
        const val CODING_TWO = "coding_two.jpg"
    }

    object String {
        const val NAME = "Swisher Software Solutions"
        const val PROFESSION = "Software Development & Multiplatform Web Design"
        const val ABOUT_ME = "Welcome to Swisher Software Solutions, where innovation meets elegance! I’m Swisher, the founder and lead developer here. With a passion for both software development and web design, I’m dedicated to crafting custom solutions that elevate your digital presence. My journey began with a fascination for technology and design, which has evolved into a full-fledged career helping businesses and individuals bring their visions to life. At Swisher Software Solutions, I specialize in:"
        const val MY_APPROACH = "I believe in a collaborative approach, working closely with you to understand your goals and challenges. From the initial concept to the final product, my focus is on delivering high-quality results that align with your vision. Every project is a new opportunity to innovate and push boundaries, ensuring that your digital solutions are as unique as your brand, so consider Swisher Software Solutions for:"
        const val ABOUT_ME_END = "Thank you for considering Swisher Software Solutions. I’m excited to explore how we can work together to create something exceptional. Feel free to reach out to discuss your next project or to learn more about my services."
        const val BUTTON_TEXT = "Get In Touch"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_EMAIL = "mailto:devi3east@gmail.com"
        const val SAVED_THEME = "theme"
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1600
        const val MAX_CARD_HEIGHT = 1400
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }
}