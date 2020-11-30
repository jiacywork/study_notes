package com.jiacy.app.设计模式.行为型.命令模式;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        for(Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }

}
