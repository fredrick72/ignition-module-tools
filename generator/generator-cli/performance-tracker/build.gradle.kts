/*
 * This project was generated by the Ignition Module Generator.  It is intended to provide initial project structure
 * and minimize boilerplate.  This initial project is a starting point for your own module projects using the Gradle
 * build system.  It is not intended to be a replacement for learning and understanding Gradle.
 *
 * Generator: https://github.com/inductiveautomation/ignition-module-tools/tree/master/generator/generator-core
 * Gradle Docs: https://docs.gradle.org/current/userguide/userguide.html
 */

plugins {
    id("io.ia.sdk.modl") version("0.4.0")
}

val sdk_version by extra("8.1.20")

allprojects {
    version = "0.0.1-SNAPSHOT"
}

ignitionModule {
    /*
     * Human readable name of the module, as will be displayed on the gateway status page
     */
    name.set("Performance Tracker")

    /*
     * Name of the '.modl' file to be created, without file extension.
     */
    fileName.set("Performance-Tracker")
    /*
     * Unique identifier for the module.  Reverse domain convention is recommended (e.g.: com.mycompany.charting-module)
     */
    id.set("com.eleconsulting.performandtracker.PerformanceTracker")

    /*
     * Version of the module.  Here being set to the same version that gradle uses, up above in this file.
     */
    moduleVersion.set("${project.version}")

    moduleDescription.set("A short sentence describing what it does, but not much longer than this.")

    /*
     * Minimum version of Ignition required for the module to function correctly.  This typically won't change over
     * the course of a major Ignition (7.9, 8.0, etc) version, except for when the Ignition Platform adds/changes APIs
     * used by the module.
     */
    requiredIgnitionVersion.set(sdk_version)
    /*
     *  This is a map of String: String, where the 'key' represents the fully qualified path to the project
     *  (using gradle path syntax), and the value is the shorthand Scope string.
     *  Example entry: listOf( ":gateway" to "G", ":common" to "GC", ":vision-client" to "C" )
     */
    projectScopes.putAll(mapOf(
        ":client" to "CD",
        ":common" to "GCD",
        ":designer" to "D",
        ":gateway" to "G"
    ))

    /*
     * Add your module dependencies here, following the examples, with scope being one or more of G, C or D,
     * for (G)ateway, (D)esigner, Vision (C)lient.
     * Example:
     * moduleDependencies = mapOf(
     *    "CD" to "com.inductiveautomation.vision",
     *    "G" to "com.inductiveautomation.opcua"
     *  )
     */
    moduleDependencies.set(mapOf<String, String>())

    /*
     * Add required module dependencies here, following the examples, with scope being one or more of G, C or D,
     * for (G)ateway, (D)esigner, Vision (C)lient.
     *
     * Example:
     *   moduleDependencySpecs {
     *      register("com.inductiveautomation.vision") {
     *          scope = "GCD"
     *          required = true
     *      }
     *      // register("com.another.mod") { ...
     *   }
     *
     * If any of module's required module dependencies are not present, the
     * gateway will fault on loading the module.
     *
     * NOTE: For modules targeting Ignition 8.3 and later. Use `moduleDependencies` for 8.1 and earlier.
     * This property will only add the "required" flag if {requiredIgnitionVersion} is at least 8.3
     *
     */
    moduleDependencySpecs { }

    /*
     * Map of fully qualified hook class to the shorthand scope.  Only one scope may apply to a class, and each scope
     * must have no more than single class registered.  You may omit scope registrations if they do not apply.
     *
     * Example entry: "com.myorganization.vectorizer.VectorizerDesignerHook" to "D"
     */
    hooks.putAll(mapOf(
        "com.eleconsulting.performandtracker.gateway.PerformanceTrackerGatewayHook" to "G",
        "com.eleconsulting.performandtracker.client.PerformanceTrackerClientHook" to "C",
        "com.eleconsulting.performandtracker.designer.PerformanceTrackerDesignerHook" to "D"
    ))

    /*
     * Optional 'documentation' settings.  Supply the files that would be desired to end up in the 'doc' dir of the
     * assembled module, and specify the path to the index.html file inside that folder. In this commented-out
     * example, the html files being collected are located in the module root project in `src/docs/`
     */
    // the files to collect into the documentation dir, with example implementation
    // documentationFiles.from(project.file("src/docs/"))

    /* The path from the root documentation dir to the index file, or filename if in the root doc dir. */
    // documentationIndex.set("index.html")

    /*
     * Optional unsigned modl settings. If true, modl signing will be skipped. This is not for production and should
     * be used merely for development testing
     */
    skipModlSigning.set(false)
}
