//创建kotlin文件，打包
plugins {
    application
}
application {
    mainClassName = "Main"//主程序入口，用来打包（打包：Tasks下distribution下disZip以Zip格式打包）（打包好的文件在Moudule下distributions里）
}
repositories {
    mavenCentral()
}
dependencies { compile(kotlin("stdlib")) }
