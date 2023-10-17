package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var gridView: LazyGridView
    private val data = mutableListOf<MataKuliah>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.grid_view)

        data.addAll(
            listOf(
                MataKuliah(
                    name = "Algoritma dan Pemrograman",
                    sks = 3,
                    imageResource = R.drawable.ic_algoritma
                ),
                MataKuliah(
                    name = "Basis Data",
                    sks = 3,
                    imageResource = R.drawable.ic_database
                ),
                MataKuliah(
                    name = "Kalkulus",
                    sks = 3,
                    imageResource = R.drawable.ic_kalkulus
                ),
                MataKuliah(
                    name = "Fisika Dasar",
                    sks = 3,
                    imageResource = R.drawable.ic_fisika
                ),
                MataKuliah(
                    name = "Kimia Dasar",
                    sks = 3,
                    imageResource = R.drawable.ic_kimia
                ),
                MataKuliah(
                    name = "Bahasa Indonesia",
                    sks = 2,
                    imageResource = R.drawable.ic_bahasa_indonesia
                ),
                MataKuliah(
                    name = "Bahasa Inggris",
                    sks = 2,
                    imageResource = R.drawable.ic_bahasa_inggris
                ),
                MataKuliah(
                    name = "Filsafat Ilmu",
                    sks = 2,
                    imageResource = R.drawable.ic_filsafat_ilmu
                ),
                MataKuliah(
                    name = "Wawasan Kebangsaan",
                    sks = 2,
                    imageResource = R.drawable.ic_wawasan_kebangsaan
                ),
            )
        )

        val adapter = MataKuliahAdapter(data)
        gridView.adapter = adapter
    }
}
