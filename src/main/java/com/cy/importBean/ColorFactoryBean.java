package com.cy.importBean;

import entities.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author xiaoH
 * @create 2019-04-24-20:19
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    public Color getObject() throws Exception {
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
