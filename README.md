# DNS packet sniffing using java 
###### Author: prakashpandey

This Application listen to a network device provided by user and filter out the DNS packet. 

```
     0                              16                            31
     * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
     * |Version|  IHL  |Type of Service|           Total Length        |
     * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
     * |         Identification        |Flags|      Fragment Offset    |
     * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
     * |  Time to Live |    Protocol   |         Header Checksum       |
     * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
     * |                       Source Address                          |
     * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
     * |                    Destination Address                        |
     * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
     * |                    Options                    |    Padding    |
     * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
     
```

# Build project

- `git clone github.com/prakashpandey/packetsniffer`

- `cd packetsniffer`

- `mvn clean`

- `mvn install`

- `mvn compile assembly:single` 

- `java -jar jar_name.jar device_name`. E.g `java -jar target/packetsniffer-0.0.1-SNAPSHOT-jar-with-dependencies.jar 127.0.0.1`

Note: You can find the `name of the jar` at `/target folder`


# Application structure

```

pom.xml
├── README.md
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── prakashpandey
│   │               └── packetsniffer
│   │                   ├── Device.java
│   │                   ├── PacketHandler.java
│   │                   ├── PacketManager.java
│   │                   └── PacketSniffer.java

```


