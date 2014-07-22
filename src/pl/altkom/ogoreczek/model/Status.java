/*
 * Copyright 2014 Anna Kosinska-Woloch <anna.kosinska.woloch@gmail.com>.
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

package pl.altkom.ogoreczek.model;

/**
 *
 * @author Anna Kosinska-Woloch <anna.kosinska.woloch@gmail.com>
 */
public enum Status {
    
    aktywny, 
    zawieszony, 
    przetwarzanie, 
    nieAktywny, 
    odrzucony, 
    opłacony,
    zrealizowany;

    public static Status getAktywny() {
        return aktywny;
    }

    public static Status getZawieszony() {
        return zawieszony;
    }

    public static Status getPrzetwarzanie() {
        return przetwarzanie;
    }

    public static Status getNieAktywny() {
        return nieAktywny;
    }

    public static Status getOdrzucony() {
        return odrzucony;
    }

    public static Status getOpłacony() {
        return opłacony;
    }

    public static Status getZrealizowany() {
        return zrealizowany;
    }
    
    
}
