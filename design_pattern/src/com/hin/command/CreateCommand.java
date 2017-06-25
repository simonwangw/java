package com.hin.command;

/**
 * ��һ�������߶������һ�����������ý�������Ӧ�Ĳ�������ʵ��excute
 * @author Administrator
 *
 */
public class CreateCommand implements Command{
    private Receiver receiver;
    
    public CreateCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void undo() {
        receiver.unAction();
    }
    
}
