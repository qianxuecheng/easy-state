package com.github.easystate;

/**
 * ״̬����
 *
 * @author <a href="mailto:zephyrleaves@gmail.com"></a>
 * @since 2010-4-13 12:34:25
 */
public interface State{

    /**
     * ��ȡֵ
     *
     * @return the value (type int) of this State object.
     */
    int getValue();

    /**
     * ��ȡ״̬��
     *
     * @return ״̬��
     */
    String getOrginName();


    /**
     * ��ȡ��Ӧ��״̬
     *
     * @param name of type String
     *
     * @return State
     */
    State getStateByName(String name);
}
