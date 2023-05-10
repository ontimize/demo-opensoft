# Ontimize Classic Project
## Prerequisites
* Java 1.8
## First init
```  
mvn install  
```  
## Launch database
```  
cd *-server  
mvn exec:java -Prun_database  
```  
## Launch server
<table>
  <tr>
    <td>Maven</td>
    <td>Application</td>
  </tr>
  <tr>
    <td>

```  
cd *-server  
mvn exec:java -Prun_server
```  

</td>
    <td>

    JDK -------------→ 1.8
    Classpath module → *-server
    Main method -----→ com.example.opensoft.server.ProjectServerLauncher
    Arguments -------→ com/example/opensoft/server/conf/server.properties
   </td>
  </tr>
</table>

## Launch client
<table>
  <tr>
    <td>Maven</td>
    <td>Application</td>
  </tr>
  <tr>
    <td>

```  
cd *-client  
mvn exec:java -Prun_client  
```  

</td>
    <td>

    JDK -------------→ 1.8
    Classpath module → *-client
    Main method -----→ com.example.opensoft.client.ClientLauncher
    Arguments  ------→ com/example/opensoft/client/conf/labels.xml
                       com/example/opensoft/client/clientapplication.xml
                       -conf
                       com/example/opensoft/client/conf/defaultXmlConfigurationParameters.xml
   </td>
  </tr>
</table>

To enable Look&Feel, add the next lines to VM params
```  
-Dcom.ontimize.gui.lafclassname="com.ontimize.plaf.OntimizeLookAndFeel"  
-Dcom.ontimize.gui.lafstyle="com/ontimize/plaf/style/whiteStyle.css"  
```