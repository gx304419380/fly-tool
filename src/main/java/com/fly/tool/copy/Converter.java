package com.fly.tool.copy;

/**
 * @author guoxiang
 * @version 1.0.0
 * @since 2021/7/1
 */
public interface Converter {

    /**
     * 将一个对象复制到另一个对象
     * @param from  from
     * @param to    to
     */
    void convert(Object from, Object to);
}
