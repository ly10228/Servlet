package com.ly.servlet;

import com.ly.service.HelloService;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @author luoyong001
 * @Description: MyServletContainerInitializer
 * ����������ʱ��Ὣ@HandlesTypesָ�������������������ࣨʵ���࣬�ӽӿڵȣ����ݹ�����
 * �������Ȥ�����ͣ�
 * Shared libraries������⣩ / runtimes pluggability������ʱ���������
 * 1��Servlet����������ɨ�裬��ǰӦ������ÿһ��jar����
 * 	        ServletContainerInitializer��ʵ��
 * 2���ṩServletContainerInitializer��ʵ���ࣻ
 * 	       ������ڣ�META-INF/services/javax.servlet.ServletContainerInitializer
 *         �ļ������ݾ���ServletContainerInitializerʵ�����ȫ������
 * �ܽ᣺����������Ӧ�õ�ʱ�򣬻�ɨ�赱ǰӦ��ÿһ��jar������
 *        META-INF/services/javax.servlet.ServletContainerInitializer
 *        ָ����ʵ���࣬�������������ʵ����ķ������������Ȥ�����ͣ�
 *        ServletContainerInitializer��
 *        @HandlesTypes��
 * @create 2020-01-09 0:05
 * @last modify by [dell 2020-01-09 0:05]
 **/
@HandlesTypes({HelloService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {

    /**
     * @param c   ����Ȥ�����͵����������ͣ�
     * @param ctx ����ǰWebӦ�õ�ServletContext��һ��WebӦ��һ��ServletContext��
     * @return void
     * @Description: Ӧ��������ʱ�򣬻�����onStartup������
     * 1����ʹ��ServletContextע��Web�����Servlet��Filter��Listener��
     * 2����ʹ�ñ���ķ�ʽ������Ŀ������ʱ���ServletContext������������
     * ��������Ŀ������ʱ������ӣ�
     * 1����ServletContainerInitializer�õ���ServletContext��
     * 2����ServletContextListener�õ���ServletContext��
     * @author luoyong
     * @create 0:08 2020/1/9
     * @last modify by [LuoYong 0:08 2020/1/9 ]
     */
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        System.out.println("����Ȥ����������:");
        c.stream().forEach(System.out::println);
    }
}
