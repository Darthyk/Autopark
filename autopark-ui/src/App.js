import {getVehicles} from "./actions";
import {connect} from "react-redux";
import React, {Component} from 'react';
import Table from 'react-bootstrap/Table';
import 'bootstrap/dist/css/bootstrap.min.css';

class App extends Component {

    componentWillMount() {
        this.props.getVehicles();
    }

    renderTableRows(data) {
        if (data !== null) {

            data.map((row, index) => {
                console.log("ROW", row);
                return (
                    <tr key={index}>
                        <td>{row.name}</td>
                        <td>{row.enginePower}</td>
                        <td>{row.productionYear}</td>
                        <td>{row.price}</td>
                    </tr>
                );
            })
        }


    }

    render () {
      return (
          <div className="App">
              <header className="App-header">
                  <h1>Autopark</h1>
              </header>

              <div>
                  <Table striped bordered hover>
                      <thead>
                      <tr>
                          <th>Name</th>
                          <th>Engine power</th>
                          <th>Production year</th>
                          <th>Price</th>
                      </tr>
                      </thead>
                      <tbody>
                        {this.props.vehicles.map((row, index) => {
                            console.log("ROW", row);
                            return (
                                <tr key={index}>
                                    <td>{row.name}</td>
                                    <td>{row.enginePower}</td>
                                    <td>{row.productionYear}</td>
                                    <td>{row.price}</td>
                                </tr>
                            );
                        })}
                      </tbody>
                  </Table>
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
