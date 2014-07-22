/*
 * Copyright 2014 Your Name <Ewa Milewska>.
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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Your Name <Ewa Milewska>
 */
public class MatrixTest {
    
    public MatrixTest() {
    }

    @Test
    public void testSetElement() {
    }

    @Test
    public void testWyznacznik() {
        Matrix matrix = new Matrix(4);
        
        for(int i = 0; i < 4; i++) {
          matrix.setElement(i, i, i+1);
        }
        
        double result = matrix.wyznacznik();
        System.out.println(matrix.wyznacznik());
        
        assert result == 24 : "nieprawidłowa wartość wyznacznika";
    }
    
}
