/*
 * Copyright 2018-2050 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.geercode.creed.archetype.orm.mybatisplus;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.geercode.creed.tools.common.StringUtil;
import com.geercode.creed.tools.configure.ResourceUtil;

import java.io.File;
import java.util.Map;
import java.util.regex.Matcher;

/**
 * <p>Description : 多模块项目配置类</p>
 * <p>Created on  : 2018-09-12 16:36</p>
 *
 * @author jerryniu
 * @since 1.0.0
 */
public class MultiModulePathConfig {
    private static final String CONFIG_FILE_PATH = "creed-mybatis-plus";

    private static final String ROOTARTIFACTDIR_KEY = "rootArtifactDir";
    private static final String GROUPID_KEY = "groupId";
    private static final String ARTIFACTID_KEY = "artifactId";
    private static final String PACKAGE_KEY = "package";
    private static final String AUTHOR_KEY = "author";
    private static final String DATABASE_DRIVER_KEY = "mysql.driver";
    private static final String DATABASE_URL_KEY = "mysql.url";
    private static final String DATABASE_USER_KEY = "mysql.user";
    private static final String DATABASE_PASSWORD_KEY = "mysql.pwd";

    private String rootArtifactDir;
    private String groupId;
    private String artifactId;
    private String pkg;

    private String author;
    private String header = "123";
    private String databaseDriver;
    private String databaseUrl;
    private String databaseUser;
    private String databasePassword;

    /**
     * <p>description : 初始化多模块路径配置</p>
     * <p>create   on : 2018-09-12 19:36:23</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public MultiModulePathConfig init() {
        Map<String, String> properties = ResourceUtil.readPropertiesFromResources(CONFIG_FILE_PATH);
        rootArtifactDir = properties.get(ROOTARTIFACTDIR_KEY);
        if (StringUtil.isEmpty(rootArtifactDir)) {
            rootArtifactDir = new File("../").getAbsolutePath();
        } else {
            if (!rootArtifactDir.endsWith(File.separator)) {
                rootArtifactDir += File.separator;
            }
        }
        groupId = properties.get("groupId");
        artifactId = properties.get("artifactId");
        pkg = properties.get("package");
        if (StringUtil.isEmpty(pkg)) {
            pkg = groupId + StringPool.DOT + artifactId;
        }

        author = properties.get("author");
        databaseDriver = properties.get("mysql.driver");
        databaseUrl = properties.get("mysql.url");
        databaseUser = properties.get("mysql.user");
        databasePassword = properties.get("mysql.pwd");

        return this;
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getRootArtifactDir() {
        return rootArtifactDir;
    }

    private String getRepoRoot() {
        return rootArtifactDir + artifactId + "-repo" + File.separator + "src" + File.separator + "main"
                + File.separator + "java";
    }

    private String getServiceRoot() {
        return rootArtifactDir + artifactId + "-service" + File.separator + "src" + File.separator + "main"
                + File.separator + "java";
    }

    private String getWebRoot() {
        return rootArtifactDir + artifactId + "-web" + File.separator + "src" + File.separator + "main"
                + File.separator + "java";
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getEntityDir() {
        return getRepoRoot() + File.separator + getPkgDir() + File.separator
                + "repo" + File.separator + "dao" + File.separator + "entity";
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getDaoDir() {
        return getRepoRoot() + File.separator + getPkgDir() + File.separator
                + "repo" + File.separator + "dao" + File.separator + "entity";
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getMapperDir() {
        return getRepoRoot() + File.separator + getPkgDir() + File.separator
                + "repo" + File.separator + "dao" + File.separator + "entity";
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getServiceDir() {
        return getRepoRoot() + File.separator + getPkgDir() + File.separator
                + "repo" + File.separator + "dao" + File.separator + "entity";
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getServiceImplDir() {
        return getRepoRoot() + File.separator + getPkgDir() + File.separator
                + "repo" + File.separator + "dao" + File.separator + "entity";
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getControllerDir() {
        return getRepoRoot() + File.separator + getPkgDir() + File.separator
                + "repo" + File.separator + "dao" + File.separator + "entity";
    }

    private String getPkgDir() {
        String pkgDir = pkg.replaceAll("\\.", Matcher.quoteReplacement(File.separator));
        return pkgDir;
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getPkg() {
        return pkg;
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getAuthor() {
        return author;
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getHeader() {
        return header;
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getDatabaseDriver() {
        return databaseDriver;
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getDatabaseUser() {
        return databaseUser;
    }

    /**
     * <p>description : </p>
     * <p>create   on : 2018-09-12 19:36:42</p>
     *
     * @author jerryniu
     * @version 1.0.0
     */
    public String getDatabasePassword() {
        return databasePassword;
    }
}
