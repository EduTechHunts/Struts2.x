<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="login" validate="true">
			<s:textfield label="E-mail" name="email" />
			<s:password label="Password" name="password" />
			<s:submit value="Login" />
</s:form>