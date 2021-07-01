package com.fly.tool.copy;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

/**
 * 用于缓存的键
 *
 * @author guoxiang
 * @version 1.0.0
 * @since 2021/7/1
 */
@EqualsAndHashCode
@AllArgsConstructor
public class ConverterKey {
    Class<?> fromClass;
    Class<?> toClass;
}
