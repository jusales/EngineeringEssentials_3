/**
 * Copyright 2018 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import React from 'react';
import './style/App.css';
import Charts from './components/Charts';
import Date from './components/Date';
import StockTicker from './components/StockTicker';

/**
 * TODO:
 * Import your components
 */


class App extends React.Component{

    constructor(props) {
        super(props);
        this.state = {
            /**
             * TODO
             * Add state objects for the user inputs and anything else you may need to render the highchart.
             */
            startData : props.startData,
            endDate : props.endDate,
        };

    }





    render () {
      return (
          <div className="page-display">
              <div className="input">
              {/**
               * TODO
               * Render the StockTicker and Date components. You can use the date component twice
               * for both the start and end dates.
               * Add onChange props to the StockTicker and both Date components.
               * These props methods should set state and help determine if the
               * highchart should be displayed by changing the state of that boolean.
               * Don't forget to bind these methods!
               */
              <StockTicker/>
              }

                <div className="date-range">
                <Date text = " Start Date"/>
                <Date text = " End Date"/>
                </div>
              </div>

          </div>
      );
    }
}

export default App;
