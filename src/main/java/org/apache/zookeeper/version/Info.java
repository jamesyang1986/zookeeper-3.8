package org.apache.zookeeper.version;

/**
 * @author: jamesyang
 * @date: 2023/1/16
 */
public interface Info {
    int MAJOR = 3;
    int MINOR = 8;
    int MICRO = 1;
    String QUALIFIER = "${parsedVersion.qualifier}".isEmpty() ? null : "${parsedVersion.qualifier}";
    int REVISION = -1; //@deprecated, please use REVISION_HASH
    String REVISION_HASH = "${mvngit.commit.id}";
    String BUILD_DATE = "${build.time}";
}

