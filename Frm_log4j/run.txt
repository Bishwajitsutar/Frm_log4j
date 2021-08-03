set projectLocation=C:\Users\USER\eclipse-workspace\Frm_log4j
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml