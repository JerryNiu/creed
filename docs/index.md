```
mvn archetype:generate                                   \
  -DinteractiveMode=false                                \
  -DarchetypeGroupId=com.geercode.creed                  \
  -DarchetypeArtifactId=creed-archetype-multi            \
  -DarchetypeVersion=0.4-SNAPSHOT                        \
  -DgroupId=com.yimei.architect                          \
  -DartifactId=creed-simple-app                          \
  -Dpackage=com.yimei.architect.simple                   \
  -Dversion=1.0-SNAPSHOT
```