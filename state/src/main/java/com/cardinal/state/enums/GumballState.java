package com.cardinal.state.enums;

public enum GumballState {
    SOLD_OUT(0),
    NO_QUARTER(1),
    HAS_QUARTER(2),
    SOLD(3);

    private int state;
    private static final GumballState defaultState = SOLD_OUT;

    GumballState(int i) {
        this.state = i;
    }

    public static GumballState getDefaultState() {
        return defaultState;
    }
}
