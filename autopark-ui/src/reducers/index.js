import { combineReducers } from 'redux';
import VehiclesReducer from './vehicles-reducer';

const rootReducer = combineReducers({
    vehicles: VehiclesReducer
});

export default rootReducer;