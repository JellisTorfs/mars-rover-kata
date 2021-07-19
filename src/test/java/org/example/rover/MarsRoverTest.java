package org.example.rover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {

    @Test
    void whenCreatingARoverWithInitialPositionAndOrientation_shouldCreateRoverOnThatPositionAndOrientation() {
        MarsRover rover = new MarsRover(1, 4, 'N');

        assertThat(rover.getOrientation()).isEqualTo('N');
        assertThat(rover.getX()).isEqualTo(1);
        assertThat(rover.getY()).isEqualTo(4);
    }
}
