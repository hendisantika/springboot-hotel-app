package com.hendisantika.springboothotelapp.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.io.StringWriter;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hotel-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/10/25
 * Time: 08.25
 */
public class VelocityLayoutViewResolver implements ViewResolver {

    private final VelocityEngine velocityEngine;
    private String prefix = "";
    private String suffix = ".vm";
    private String contentType = "text/html;charset=UTF-8";
    private boolean cache = true;

    public VelocityLayoutViewResolver(VelocityEngine velocityEngine) {
        this.velocityEngine = velocityEngine;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix != null ? prefix : "";
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix != null ? suffix : "";
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setCache(boolean cache) {
        this.cache = cache;
    }

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        return new VelocityView(velocityEngine, prefix + viewName + suffix, contentType);
    }

    private record VelocityView(VelocityEngine velocityEngine, String templatePath,
                                String contentType) implements View {

        @Override
            public String getContentType() {
                return contentType;
            }

            @Override
            public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
                    throws Exception {
                VelocityContext context = new VelocityContext();

                // Add model attributes to context
                if (model != null) {
                    for (Map.Entry<String, ?> entry : model.entrySet()) {
                        context.put(entry.getKey(), entry.getValue());
                    }
                }

                // Add request attributes
                if (request != null) {
                    Enumeration<String> attrNames = request.getAttributeNames();
                    while (attrNames.hasMoreElements()) {
                        String attrName = attrNames.nextElement();
                        context.put(attrName, request.getAttribute(attrName));
                    }
                }

                // Get and merge template - full path from classpath root
                Template template = velocityEngine.getTemplate(templatePath, "UTF-8");
                StringWriter writer = new StringWriter();
                template.merge(context, writer);

                // Write response
                response.setContentType(getContentType());
                response.setCharacterEncoding("UTF-8");
                response.getWriter().write(writer.toString());
            }
        }
}
