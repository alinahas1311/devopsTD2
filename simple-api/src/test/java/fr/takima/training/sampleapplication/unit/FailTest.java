package fr.takima.training.sampleapplication.unit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FailTest {

    @Test
    void testAlwaysFails() {
        fail("❌ Test simulé pour provoquer un échec CI.");
    }
}
