package com.cy.component.filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author xiaoH
 * @create 2019-04-24-17:28
 */
@Component
public class MyTypeFilter implements TypeFilter {

    /**
     *
     * @param metadataReader   读取当前扫描类的信息
     * @param metadataReaderFactory   可以获取其他任何类信息
     * @return
     * @throws IOException
     */
    public boolean match(MetadataReader metadataReader,
                         MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前扫描类的类信息
        ClassMetadata classMetadata =    metadataReader.getClassMetadata();
        //获取当前类资源信息
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();
        System.out.println("--->"+className);
        if(className.contains("er")){
            return true;
        }
        return false;
    }
}
