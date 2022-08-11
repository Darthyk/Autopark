import axios from 'axios';

import {autoparkApi} from "../constants/api";

export function getVehicles() {

    return (dispatch) => {
        axios.get(autoparkApi + '/v1/vehicles').then((result) => {
            console.log("RESULT", result)
            dispatch({
                type: 'GET_ALL_VEHICLES',
                payload: {
                    data: result.data
                }
            })
        })
    }
}