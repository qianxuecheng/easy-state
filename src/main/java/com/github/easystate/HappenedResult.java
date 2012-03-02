package com.github.easystate;

/**
 * ������Ľ��
 *
 * @author <a href="mailto:zephyrleaves@gmail.com"></a>
 * @since 2010-4-13 13:29:07
 */
public enum HappenedResult {
    /**
     * �ɹ�
     */
    SUCCESS,
    /**
     * û�����״̬
     */
    NO_FIELD,
    /**
     * û��������һ������
     */
    NO_NEXT,
    /**
     * û������·��
     */
    NO_ARC,
    /**
     * û���¼�
     */
    NO_EVENT,
    /**
     * λ�ô���
     */
    UNKNOW;

    /**
     * �Ƿ�ɹ�
     *
     * @return true �ɹ� false ���ɹ�
     */
    public boolean isSuccess() {
        return SUCCESS.equals(this);
    }

}
