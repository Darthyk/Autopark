export default function(state = [], action) {
    switch (action.type) {
        case 'GET_ALL_VEHICLES': {
            return action.payload.data;
        }
        default:
            return state;
    }
}