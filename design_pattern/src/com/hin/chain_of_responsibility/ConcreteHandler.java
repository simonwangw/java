package com.hin.chain_of_responsibility;

/**
 * ���崦����
 * ����������������󣬿ɷ������ĺ���ߣ�������Դ�������󣬴���֮�����������ת�������ĺ����
 * @author Administrator
 *
 */
public class ConcreteHandler extends Handler {
    /**
     * �����������ô˷�����������
     */
    @Override
    public void handleRequest() {
        /**
         * �ж��Ƿ��к�̵����ζ���
         * ����У���ת���������̵����ζ���
         * ���û�У���������
         */
        if(getSuccessor() != null)
        {            
            System.out.println("�Ź�����");
            getSuccessor().handleRequest();            
        }else
        {            
            System.out.println("��������");
        }
    }
}