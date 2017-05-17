package com.xhz.jxxml;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by zhaoqiang on 2017/5/16.
 */
public class Main {

    private static NamedNodeMap attributes;
    private static String classNameString;
    private static String method;



    public static void main(String[] args) {
        //定义XML解析文件的作用域
        Map<String, Object> scope = new HashMap<>();
        //声明在发射调用过程中会使用到到类
        Class[] importedClasses = new Class[]{Hello.class};

        try {
//            构造XML文档对象
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("app.xml");
//           获取根子节点
            Node root = document.getFirstChild();
            //获取代码执行部分的第一个子节点
            Node node = root.getFirstChild();
            do {
                switch (node.getNodeName()) {
                    case "create":
                        //System.out.println(node);
                        //获取该节点的所有属性
                        attributes = node.getAttributes();
                        //获取类定义的完全限定名称节点
                        Node namedItem = attributes.getNamedItem("class");
                        //  System.out.println(namedItem.getNodeValue());
                        //获取类的完全限定名称
                        classNameString = namedItem.getNodeValue();
                        //获取引用名称
                        String refNameString = attributes.getNamedItem("ref").getNodeValue();
                        //根据类的完全限定名称获取该类的定义
                        Class clazz = Class.forName(classNameString);
                        //创建类的实例，并将其添加到该XMl文件的作用域
                        scope.put(refNameString, clazz.newInstance());
                        break;
                    case "call":
                        // System.out.println(node);
                        //获取要执行的方法定义的所有属性
                        attributes = node.getAttributes();
                        //获取该实例在XML作用域名称
                        String key = attributes.getNamedItem("name").getNodeValue();
                        //根据名称获取该类的实例
                        Object instance = scope.get(key);
                        //读取方法名称
                         method = attributes.getNamedItem("method").getNodeValue();
                        //根据方法名称获取该方法的定义
                        Method method1 = instance.getClass().getMethod(method);
                        //执行该方法
                        method1.invoke(instance);
                        break;
                }
               // System.out.println(node);
            } while ((node = node.getNextSibling()) != null);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
             throw new RuntimeException(String.format("Method %s not found ",method));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(String.format("Class %s not found",classNameString));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        }

    }







