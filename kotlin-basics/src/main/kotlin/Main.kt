package dev.scep

fun main() {
    println(getDisplayName("Misha"))
    println(getDisplayName(""))
    println(getDisplayName(null))
    println(getDisplayName("   "))
}

fun getDisplayName(name: String?): String {
    if (name.isNullOrBlank()) {
        return "Anonymous"
    }
    return name
}
