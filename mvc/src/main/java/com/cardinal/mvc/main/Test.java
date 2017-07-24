package com.cardinal.mvc.main;

import com.cardinal.mvc.controller.BeatController;
import com.cardinal.mvc.interfaces.BeatModelInterface;
import com.cardinal.mvc.interfaces.ControllerInterface;
import com.cardinal.mvc.model.BeatModel;

public class Test {
    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
