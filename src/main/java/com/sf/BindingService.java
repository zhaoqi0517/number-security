package com.sf;

import java.util.Map;
import java.util.List;

/**
 *
 * 绑定号码基础服务
 *
 * create by Qi Zhao, Date:2016-06-28 01:27
 */
public interface BindingService {

    /**
     * 绑定号码
     * @param number 绑定的号码
     * @param number1 绑定的号码
     * @return 虚拟号码
     * @throws BindingException
     */
    public String bind(String number, String number1) throws BindingException;

    /**
     * 批量绑定号码
     * @param numbers 号码组
     * @return 虚拟号码
     * @throws BindingException
     */
    public String bind(String... numbers) throws BindingException;

    /**
     * 批量绑定号码
     * @param numbers 号码表
     * @return 虚拟号码列表,key=number,value=virtualNumber
     * @throws BindingException
     */
    public Map<String, String> bind(Map<String, String> numbers) throws BindingException;

    /**
     * 解绑号码
     * @param number 需要绑定的号码
     * @return 是否绑定成功
     * @throws BindingException
     */
    public Boolean unbind(String number) throws BindingException;

    /**
     * 批量解绑号码
     * @param numbers 需要绑定的号码
     * @return 是否绑定成功
     * @throws BindingException
     */
    public Boolean unbind(List<String> numbers) throws BindingException;

    /**
     * 重新绑定
     * @param existsNumber 已绑定的号码
     * @param newNumber 新需要绑定的号码
     * @return 虚拟号码
     * @throws BindingException
     */
    public String rebind(String existsNumber, String newNumber) throws BindingException;

    /**
     * 批量重新绑定
     * @param numbers 重新绑定的号码,key=existsNumber,value=newNumber
     * @return 虚拟号码表
     * @throws BindingException
     */
    public Map<String, String> rebind(Map<String, String> numbers) throws BindingException;
}
