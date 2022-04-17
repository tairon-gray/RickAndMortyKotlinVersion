package com.evg_ivanoff.rickmortycharacterswiki.pojo.character

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




data class MainResponceCharacters(
    @SerializedName("info")
    @Expose
    val dataInfo: Info? = null,

    @SerializedName("results")
    @Expose
    val characterOnes: List<Character>? = null
)
