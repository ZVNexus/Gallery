package com.android.gallery.extensions

import com.android.gallery.helpers.SORT_DESCENDING

fun Int.isSortingAscending() = this and SORT_DESCENDING == 0
