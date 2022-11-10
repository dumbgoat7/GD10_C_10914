package com.example.gd10_c_10914


import retrofit2.Call
import retrofit2.http.*

interface api {
    @GET("mahasiswa/{cari}")
    fun getData(@Path("cari") cari:String? = null): Call<ResponseDataMahasiswa>

    @FormUrlEncoded
    @POST("mahasiswa")
    fun createData(
        @Field("mhsnobp") mhsnim:String?,
        @Field("mhsnama") mhsnama:String?,
        @Field("mhsalamat") mhsalamat:String?,
        @Field("prodinama") prodinama:String?,
        @Field("mhstgllhr") mhstgllhr:String?,
    ) :Call<ResponseCreate>

    @DELETE("mahasiswa/{mhsnobp}")
    fun deleteData(@Path("mhsnobp")mhsnobp: String?):Call<ResponseCreate>

    @FormUrlEncoded
    @PUT("mahasiswa/{mhsnobp}")
    fun updateData(
        @Field("mhsnobp") mhsnobp: String?,
        @Field("mhsnama") mhsnama:String?,
        @Field("mhsalamat") mhsalamat:String?,
        @Field("prodinama") prodinama:String?,
        @Field("mhstgllhr") mhstgllhr:String?,
    ) :Call<ResponseCreate>
}