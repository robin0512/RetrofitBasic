package com.example.retrofitbasic

import com.google.gson.annotations.SerializedName

data class Support(
    @SerializedName("text")
    var text: String,
    @SerializedName("url")
    var url: String
)
