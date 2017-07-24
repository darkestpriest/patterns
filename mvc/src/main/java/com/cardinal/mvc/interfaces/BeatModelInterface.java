package com.cardinal.mvc.interfaces;

import com.cardinal.mvc.observer.BPMObserver;
import com.cardinal.mvc.observer.BeatObserver;

public interface BeatModelInterface {

    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    int getBPM();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
