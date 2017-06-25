package com.hin.command;

/**
 * �������
 * @author Administrator
 *
 */
public class Invoker {
    // �����������     
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public Command getCommand() {
        return command;
    }

    // ִ������    
    public void runCommand(){
        command.execute();
    }
    
    //��������     
    public void unDoCommand(){
        command.undo();
    }
}
