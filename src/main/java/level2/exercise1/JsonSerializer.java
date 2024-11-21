package level2.exercise1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonSerializer {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void serialize(Object object) throws IOException {
        Class<?> clazz = object.getClass();
        JsonSerialize annotation = clazz.getAnnotation(JsonSerialize.class);

        if (annotation == null) {
            throw new IllegalArgumentException("The object must be annotated with @JsonSerialize");
        }

        String directory = annotation.directory();

        File dir = new File(directory);
        if (!dir.exists() && !dir.mkdirs()) {
            throw new IOException("Could not create directory: " + directory);
        }

        String fileName = clazz.getSimpleName() + ".json";
        Path filePath = Paths.get(directory, fileName);

        objectMapper.writeValue(filePath.toFile(), object);
    }
}
