package com.mine.pokedex.network.model.others


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIv(
    @SerialName("diamond-pearl")
    val diamondPearl: DiamondPearl,
    @SerialName("heartgold-soulsilver")
    val heartgoldSoulsilver: HeartgoldSoulsilver,
    @SerialName("platinum")
    val platinum: Platinum
)