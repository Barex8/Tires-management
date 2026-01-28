import PropTypes from "prop-types"

export const TireDetail = ( {handlerTireSelected,handlerRemove,t = {} }) => {
    return (
        <tr>
            <td>{t.tire_size}</td>
            <td>{t.target}</td>
            <td>{t.client_name}</td>
            
            {/* <td>
                <button onClick={() => handlerTireSelected(t)} className="btn btn-secondary btn-sm">
                    update
                </button>
            </td> */}
            {/* <td>
                <button onClick={() => handlerRemove(t.id)} className="btn btn-danger btn-sm">
                    remove
                </button>
            </td> */}
        </tr>
    )
}
TireDetail.propTypes = {
    t:PropTypes.object.isRequired
}