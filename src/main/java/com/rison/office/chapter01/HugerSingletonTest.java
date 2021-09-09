package com.rison.office.chapter01;

import com.sun.org.apache.xalan.internal.xsltc.dom.SingletonIterator;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * @author : Rison 2021/9/9 下午3:32
 * 单例模式
 */

public class HugerSingletonTest {
    // TODO :饿汉式：线程安全，耗费资源

    private static final HugerSingletonTest instance = new HugerSingletonTest();

    public static HugerSingletonTest getInstance() {
        return instance;
    }

    private HugerSingletonTest() {
    }

    ;

}

class HugerSingletonTest2 {
    //TODO: 饿汉式：在静态代码实例化对象

    private static HugerSingletonTest2 instance;

    static {
        instance = new HugerSingletonTest2();
    }

    public static HugerSingletonTest2 getInstance() {
        return instance;
    }

    private HugerSingletonTest2() {
    }
}

class LazySingleton {
    //TODO: 懒汉式，线程安全，给方法加锁

    private static LazySingleton lazySingleton;

    public synchronized static LazySingleton getInstance() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    private LazySingleton() {
    }

    ;
}

class LazySingleton2 {
    // TODO: 懒汉式： 线程安全，双重检查锁（同步代码块）

    private static volatile LazySingleton2 lazySingleton2;

    public static LazySingleton2 getInstance() {
        if (null == lazySingleton2) {
            synchronized (LazySingleton2.class) {
                if (null == lazySingleton2) {
                    lazySingleton2 = new LazySingleton2();
                }
            }
        }
        return lazySingleton2;
    }

    private LazySingleton2() {
    }

    ;
}

class LazySingleton3 {
    //TODO: 线程安全的懒汉式：静态内部类（推荐）

    private static class LazySingletonBuilder {
        private static LazySingleton3 instance = new LazySingleton3();
    }

    public synchronized static LazySingleton3 getInstance() {
        return LazySingletonBuilder.instance;
    }

    private LazySingleton3() {
    }

    ;
}

enum  SingletonTest{
    //TODO: 线程安全，枚举

    INSTANCE;
}
