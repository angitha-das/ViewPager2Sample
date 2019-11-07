package com.example.viewpager2sample

object DummyImageData {
    val images: List<Image>
        get() {
            val images = mutableListOf<Image>()
            return images.apply {
                add(Image(R.drawable.dummy, "Your Recording"))
                add(Image(R.drawable.dummy, "Film"))
                add(Image(R.drawable.dummy, "Series"))
                add(Image(R.drawable.dummy, "Kids"))
                add(Image(R.drawable.dummy, "Sport"))
            }
        }
}