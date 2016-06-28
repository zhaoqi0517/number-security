package com.sf;

import java.util.Map;
import java.util.List;

public interface BindingService {

    public String bind(String number, String number1) throws BindingException;

    public String bind(String... numbers) throws BindingException;

    public Map<String, String> bind(Map<String, String> numbers) throws BindingException;

    public Boolean unbind(String number) throws BindingException;

    public Boolean unbind(List<String> numbers) throws BindingException;

    public String rebind(String existsNumber, String newNumber) throws BindingException;
}
