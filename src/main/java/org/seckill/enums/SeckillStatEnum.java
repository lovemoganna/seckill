package org.seckill.enums;

/**
 * @author: ligang
 * date: 2018/2/10
 * time: 17:47
 * 使用枚举类表述常量数据字典
 */
public enum SeckillStatEnum {
    SUCCESS(1,"秒杀成功!"),
    END(0,"秒杀结束!"),
    REPEAT_KILL(-1,"重复秒杀!"),
    INNER_ERROR(-2,"系统异常!"),
    DATA_REWRITE(-3,"数据篡改!");


    private int state;
    private String stateInfo;

    SeckillStatEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    //此静态方法迭代所有的类型
    public static SeckillStatEnum stateOf(int index) {
        for (SeckillStatEnum state : values()) {
            //values()用来拿到所有类型
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
