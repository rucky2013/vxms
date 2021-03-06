package org.jacpfx.entity.encoder;

import org.jacpfx.common.util.Serializer;
import org.jacpfx.entity.Payload;
import org.jacpfx.common.encoder.Encoder;

import java.io.IOException;

/**
 * Created by Andy Moncsek on 25.11.15.
 */
public class ExampleByteEncoder implements Encoder.ByteEncoder<Payload<String>> {
    // TODO create a "more reactive" interface
    @Override
    public byte[] encode(Payload<String> input) {
        try {
            return Serializer.serialize(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }
}
