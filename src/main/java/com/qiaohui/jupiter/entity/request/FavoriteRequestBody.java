package com.qiaohui.jupiter.entity.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.qiaohui.jupiter.entity.db.Item;
import com.qiaohui.jupiter.entity.db.Item;

public class FavoriteRequestBody {
    private final Item favoriteItem;

    @JsonCreator
    public FavoriteRequestBody(@JsonProperty("favorite") Item favoriteItem) {
        this.favoriteItem = favoriteItem;
    }

    public Item getFavoriteItem() {
        return favoriteItem;
    }
}
