package pers.hilox.framework.core.ensure;

import pers.hilox.framework.core.ensure.extensions.EnsureParamBoolean;
import pers.hilox.framework.core.ensure.extensions.EnsureParamObject;
import pers.hilox.framework.core.ensure.extensions.EnsureParamString;

/**
 * 参数校验类实例化类
 * @author hilox
 * @since 1.0
 */
public class Ensure {

    /**
     * Object参数校验类实例化
     * @param object 参数
     * @return
     */
    public static EnsureParamObject that(Object object) {
        return new EnsureParamObject(object);
    }

    /**
     * String参数校验类实例化
     * @param string 参数
     * @return
     */
    public static EnsureParamString that(String string) {
        return new EnsureParamString(string);
    }

    /**
     * 布尔参数校验类实例化
     * @param hiloxObject 参数
     * @param <HiloxObject> 参数类型
     * @return
     */
    public static <HiloxObject extends Boolean> EnsureParamBoolean that(HiloxObject hiloxObject) {
        return new EnsureParamBoolean(hiloxObject);
    }
}
