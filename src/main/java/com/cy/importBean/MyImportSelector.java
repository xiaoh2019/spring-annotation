package com.cy.importBean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author xiaoH
 * @create 2019-04-24-19:38
 */
public class MyImportSelector implements ImportSelector {

    //annotationMetadata
    public String[] selectImports(AnnotationMetadata annotationMetadata) {


        return new String[]{"entities.Blue","entities.Red"};
    }
}
