package com.example.commonrecyclerview.data

/** 모든 유형의 아이템은 CommonItem의 형태로 주어집니다. */
data class CommonItem(
    val viewType: String,
    val viewObject: ViewObject
)