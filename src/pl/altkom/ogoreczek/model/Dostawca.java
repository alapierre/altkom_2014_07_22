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
public class Dostawca {
    
    private Status statusDostawcy;
    private String nazwaDostawcy;
    private String loginDostawcy;

    public Status getStatusDostawcy() {
        return statusDostawcy;
    }

    public void setStatusDostawcy(Status statusDostawcy) {
        this.statusDostawcy = statusDostawcy;
    }

    public String getNazwaDostawcy() {
        return nazwaDostawcy;
    }

    public void setNazwaDostawcy(String nazwaDostawcy) {
        this.nazwaDostawcy = nazwaDostawcy;
    }

    public String getLoginDostawcy() {
        return loginDostawcy;
    }

    public void setLoginDostawcy(String loginDostawcy) {
        this.loginDostawcy = loginDostawcy;
    }

    @Override
    public String toString() {
        return "Dostawca{" + "statusDostawcy=" + statusDostawcy + ", nazwaDostawcy=" + nazwaDostawcy + ", loginDostawcy=" + loginDostawcy + '}';
    }
   
    
    
}
