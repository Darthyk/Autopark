import {getVehicles} from "./actions";
import {connect} from "react-redux";
import React, {Component} from 'react';
import 'react-bootstrap-table-next/dist/react-bootstrap-table2.min.css';
import BootstrapTable from 'react-bootstrap-table-next';

class App extends Component {

    componentWillMount() {
        this.props.getVehicles();
    }

    columns = [{
        dataField: 'enginePower',
        text: 'Engine power',
        style: {
            width: '200px'
        },
        align: 'center'
    }, {
        dataField: 'productionYear',
        text: 'Production year',
        style: {
            width: '200px'
        },
        align: 'center'
    }, {
        dataField: 'price',
        text: 'Price',
        style: {
            width: '200px'
        },
        align: 'center'
    }];

    expandRow = {
        onlyOneExpanding: true,
        showExpandColumn: true,
        renderer: row => (
            <div>
                <p>{row.brand.name}</p>
                <p>Car type: {row.brand.vehicleType}</p>
                <p>Carrying: {row.brand.carrying}</p>
                <p>Gas tank: {row.brand.gasTank}</p>
                <p>Passenger load: {row.brand.loadCapacity}</p>
            </div>
        )
    };

    render () {
      return (
          <div className="App">
              <header className="App-header">
                  <h1>Autopark</h1>
              </header>

              <div className='myTable'>
                  <BootstrapTable
                    keyField='id'
                    data={this.props.vehicles}
                    columns={this.columns}
                    expandRow={this.expandRow}
                  />
              </div>
          </div>
      );
  }
}

function mapStateToProps(state, ownProps) {
    return {
        vehicles: state.vehicles
    };
}


export default connect(mapStateToProps, {getVehicles: getVehicles})(App)
