package core.oop_hw;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Telephone {
    private final String phoneBrand;
    private final double diagonalD;
    private boolean nfs;
}
