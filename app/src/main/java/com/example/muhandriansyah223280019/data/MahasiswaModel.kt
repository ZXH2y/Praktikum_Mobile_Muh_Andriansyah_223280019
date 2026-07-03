package com.example.muhandriansyah223280019.data

import com.google.gson.annotations.SerializedName

data class MahasiswaRequest(
    @SerializedName(value = "nim") val nim: String,
    @SerializedName(value = "nama") val nama: String,
    @SerializedName(value = "kelas") val kelas: String,
    @SerializedName(value = "prodi") val prodi: String,
)

data class MahasiswaResponse(
    @SerializedName(value = "status") val status:
    Boolean,
    @SerializedName(value = "message") val message:
    String
)

data class MahasiswaListResponse(
    @SerializedName(value = "status") val status:
    Boolean,
    @SerializedName(value = "data") val data:
    List<MahasiswaResponse>
)