repositories { mavenCentral() }
dependencies { compile(kotlin("stdlib")) }
//task任务、task任务集、生命周期、组
tasks {
    task("openDoor") {
        group = "冰冻大象"
        doFirst { println("开冰箱门") }
    }
    task("putElephant") {
        group = "冰冻大象"
        doFirst { println("放大象") }
    }.dependsOn("openDoor")
    task("closeDoor") {
        group = "冰冻大象"
        doFirst { println("关冰箱门") }
    }.dependsOn("putElephant")
}