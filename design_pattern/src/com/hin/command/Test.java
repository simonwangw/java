package com.hin.command;

/**
 * ����ģʽ�Ĳ���
 * ��һ�������װΪһ�����󣬴Ӷ�ʹ����ò�ͬ������Կͻ����в�����
 * Ҫ�㣺
	1������ģʽ����������Ķ����ִ������Ķ������
	2���ڱ����������֮����ͨ�����������й�ͨ�ġ���������װ�˽����ߺ�һ����һ�鶯��
	3��������ͨ��������������execute()�����������ʹ�ý����ߵĶ���������
 * @author Administrator
 * 2014/07/09
 */
public class Test {

	public static void main(String[] args) {
		//����������
        Receiver receiver = new Receiver();
        //����������󣬲��������Ľ�����
        Command command = new CreateCommand(receiver);
        
        //���������ߣ�������������ý�ȥ
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        
        //������Բ���һ��
        invoker.runCommand();
        invoker.unDoCommand();
	}
}
