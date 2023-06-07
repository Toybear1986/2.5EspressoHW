package ru.kkuzmichev.simpleappforespresso;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.ViewAssertion;

public class CustomViewAssertions {
    public static ViewAssertion isRecyclerView() {
        return (view, noViewFoundException) -> {
            try {
                RecyclerView recyclerView = (RecyclerView) view;
            } catch (ClassCastException cce) {
                throw new IllegalStateException("This is not a RecyclerView");
            }
        };
    }
}