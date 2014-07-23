/*
 * Copyright 2014 Adrian Lapierre <adrian@soft-project.pl>.
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

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class Child extends Parent {

    public Child() {
        super(1);
        System.out.println("konstuktor child");
    }

    @Override
    public void m1() {
        System.out.println("in child");
    }
    
    
    
    public void m2() {
        System.out.println("m2 w Child");
    }
    
    public void m3(String str) {
        System.out.println("String str");
    }
    
}
