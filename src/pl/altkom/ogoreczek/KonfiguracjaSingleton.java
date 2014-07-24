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

package pl.altkom.ogoreczek;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class KonfiguracjaSingleton {

    private static final String KONFIGURACJAPROPERTIES = "konfiguracja.properties";
    
    private static KonfiguracjaSingleton instancja = null;
    
    private Properties props = new Properties();
    
    private KonfiguracjaSingleton() {
    }
    
    public static KonfiguracjaSingleton getInstance() {
        if(instancja == null) {
            instancja = new KonfiguracjaSingleton();
            instancja.init();
        }
        return instancja;
    }
    
    private void init() {
        props.setProperty("plik_z_danymi_klientów", "klienci.bin");
        props.setProperty("plik_z_danymi_klientów", "klienci.bin");
    }
    
    public String getProperty(String key) {
        return props.getProperty(key);
    }
    
    public void save() throws IOException {
        props.store(new FileWriter(KONFIGURACJAPROPERTIES), null);
    }
    
    
    public void load() throws IOException {
        props.load(new FileReader(KONFIGURACJAPROPERTIES));
    }
}
