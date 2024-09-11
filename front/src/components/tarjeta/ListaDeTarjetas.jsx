import Tarjeta from './Tarjeta'
import styles from './Tarjeta.module.css'

const ListaDeTarjetas = ({ publicacions }) => {
	return (
		<div className={styles.lista}>
			{publicacions.map((publicacion, index) => (
				<Tarjeta key={index} publicacion={publicacion} />
			))}
		</div>
	)
}

export default ListaDeTarjetas
