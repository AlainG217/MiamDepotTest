<%-- 
    Document   : testContent.jsp
    Created on : 9 juin 2020, 14:58:06
    Author     : stagjava
--%>

<p>Ceci est une page g�n�r�e depuis une servlet</p>
<p>Hello World</p>
<%
    String attributMsg = (String) request.getAttribute("cle");
    out.println(attributMsg);
%>
<br>
<% 
    String auteur = (String) request.getAttribute("auteur");
    out.println("Param�tre cr�� directement depuis la requ�te " + auteur);    
%>
<p>R�cup�ration du bean:
    <jsp:useBean id="alphonse" class="fr.ldnr.alain.beans.Personne" scope="request"/>
    <jsp:getProperty name="alphonse" property="nom" />
    <jsp:getProperty name="alphonse" property="prenom" />
    <jsp:getProperty name="alphonse" property="age" />
    
</p>
<p>Modification du bean:
    <jsp:setProperty name="alphonse" property="nom" value="Stule" />
    <jsp:setProperty name="alphonse" property="prenom" value="Sophie"/>
    <jsp:setProperty name="alphonse" property="age" value="21"/>
    <%= alphonse.toString() %>
    
</p>
