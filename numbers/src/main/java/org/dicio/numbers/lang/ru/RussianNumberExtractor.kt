package org.dicio.numbers.lang.ru

import org.dicio.numbers.lang.NumberExtractor

class RussianNumberExtractor : NumberExtractor() {
    override val languageCode = "ru"

    override val smallNumbers = mapOf(
        "ноль" to 0,
        "один" to 1, "одна" to 1,
        "два" to 2, "две" to 2,
        "три" to 3,
        "четыре" to 4,
        "пять" to 5,
        "шесть" to 6,
        "семь" to 7,
        "восемь" to 8,
        "девять" to 9,
        "десять" to 10
    )

    override val tens = mapOf(
        "двадцать" to 20,
        "тридцать" to 30,
        "сорок" to 40,
        "пятьдесят" to 50,
        "шестьдесят" to 60,
        "семьдесят" to 70,
        "восемьдесят" to 80,
        "девяносто" to 90
    )

    override val hundreds = mapOf(
        "сто" to 100,
        "двести" to 200,
        "триста" to 300,
        "четыреста" to 400,
        "пятьсот" to 500,
        "шестьсот" to 600,
        "семьсот" to 700,
        "восемьсот" to 800,
        "девятьсот" to 900
    )
}
