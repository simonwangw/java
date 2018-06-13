package com.xiaomi.learn.gson;

import com.google.gson.*;

import java.lang.reflect.Type;

public class BookSerialiser implements JsonSerializer<Book> {

    public static void main(String[] args) {
        // Configure GSON
        final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Book.class, new BookSerialiser());
        gsonBuilder.setPrettyPrinting();
        final Gson gson = gsonBuilder.create();

        final Book javaPuzzlers = new Book();
        javaPuzzlers.setTitle("Java Puzzlers: Traps, Pitfalls, and Corner Cases");
        javaPuzzlers.setIsbn10("032133678X");
        javaPuzzlers.setIsbn13("978-0321336781");
        javaPuzzlers.setAuthors(new String[]{"Joshua Bloch", "Neal Gafter"});

        // Format to JSON
        final String json = gson.toJson(javaPuzzlers);
        System.out.println(json);
    }

    public JsonElement serialize(final Book book, Type type, JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("title", book.getTitle());
        jsonObject.addProperty("isbn-10", book.getIsbn10());
        jsonObject.addProperty("isbn-13", book.getIsbn13());

        final JsonArray jsonAuthorsArray = new JsonArray();
        for (final String author : book.getAuthors()) {
            final JsonPrimitive jsonAuthor = new JsonPrimitive(author);
            jsonAuthorsArray.add(jsonAuthor);
        }
        jsonObject.add("authors", jsonAuthorsArray);

        return jsonObject;
    }
}
