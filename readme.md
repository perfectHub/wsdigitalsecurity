**生成数字签名：**

***cleint***
创建与给定的别名，像“client​​”/“clientpass”在密钥库密码私钥
keytool -genkey -alias client -keypass clientpass -keystore client-privatestore.jks -storepass storepass -dname "cn=client" -keyalg RSA
自签署的证书
keytool -selfcert -alias client -keypass clientpass -keystore client-privatestore.jks -storepass storepass 
从我们的私人密钥库中导出的公钥文件命名client-key.rsa
keytool -export -alias client -file client-key.rsa -keystore client-privatestore.jks -storepass storepass
 公钥导入到新的keystore：
keytool -import -alias client  -file client-key.rsa -keystore client-publicstore.jks -storepass storepass

***server***
keytool -genkey -alias server -keypass serverpass -keystore server-privatestore.jks -storepass storepass -dname "cn=server" -keyalg RSA

keytool -selfcert -alias server -keypass serverpass -keystore server-privatestore.jks -storepass storepass 

keytool -export -alias server -file server-key.rsa -keystore server-privatestore.jks -storepass storepass

keytool -import -alias server  -file server-key.rsa -keystore server-publicstore.jks -storepass storepass