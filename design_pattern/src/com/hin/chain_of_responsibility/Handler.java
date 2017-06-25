package com.hin.chain_of_responsibility;

/**
 * ���帺������Ľӿ�
 * @author Administrator
 *
 */
public abstract class Handler {
    
    // ���к�̵����ζ���
    protected Handler successor;
    
    // ʾ�⴦������ķ�������Ȼ���ʾ�ⷽ����û�д�������ģ���ʵ���ǿ��Դ�������ģ����ݾ�����Ҫ��ѡ���Ƿ񴫵ݲ���
    public abstract void handleRequest();
    
    // ȡֵ����
    public Handler getSuccessor() {
        return successor;
    }
    
    // ��ֵ���������ú�̵����ζ���
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    } 
}