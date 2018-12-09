package lab8;


import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {
    static {
        try {
            File file = new File("logs/error.log");
            FileOutputStream fos = new FileOutputStream(file);
            PrintStream ps = new PrintStream(fos);
            System.setErr(ps);
        } catch (Exception e) { System.err.println("Could not redirect stdErr stream."); }
    }

    public static void main(String [] args) {
        try {
            String webappDirLocation = "src/ua/univ/lab8/";
            Tomcat tomcat = new Tomcat();

            String webPort = System.getenv("PORT");
            if (webPort == null || webPort.length() == 0) {
                webPort = "8082";
            }

            tomcat.setPort(Integer.valueOf(webPort));

            StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File(webappDirLocation + "\\JSP").getAbsolutePath());
            System.out.println("configuring app with basedir: " + new File(webappDirLocation + "\\JSP").getAbsolutePath());

            File additionWebInfClasses = new File("C:/IdeaProjects/MOOP/target/classes");
            WebResourceRoot resources = new StandardRoot(ctx);
            resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes", additionWebInfClasses.getAbsolutePath(), "/"));
            ctx.setResources(resources);

            Settings.infoLogger.info("**************************************************************");
            Settings.infoLogger.info("Starting server...............................................");

            tomcat.start();
            tomcat.getServer().await();
        } catch (Exception e) {
            Settings.errorLogger.error(e.getMessage());
        }
    }
}
