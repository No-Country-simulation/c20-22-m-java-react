import axios from 'axios'
import  { useEffect, useState } from 'react'
import { BASE_URL } from '../../envs'
import styles from './Lostposts.module.css'
import Tarjeta from '../../components/tarjeta/Tarjeta'
import Spiner from '../../components/spiner/Spiner'

export default function Lostposts() {
	const [publicaciones, setPublicaciones] = useState([])
	const [isLoading, setIsLoading] = useState(true)

	useEffect(() => {
		const fetchData = async () => {
			const response = await axios.get(`${BASE_URL}/allOwnerPublishes`)
			// console.log(response.data)
			const publicacionesOrdenadas = response.data.sort((a, b) => {
				return new Date(b.fecha) - new Date(a.fecha) // Orden descendente, más recientes primero
			})

			setPublicaciones(publicacionesOrdenadas)
			setIsLoading(false)
		}
		fetchData()
	}, [])

	return (
		<div className={styles.container}>
			<h2 className={styles.title}>Ayuda a los dueños a encontrar sus mascotas!</h2>
			<div className={styles.cardsContainer}>
				{isLoading && <Spiner />}
				{publicaciones && publicaciones.map((publicacion, index) => <Tarjeta key={index} publicacion={publicacion} />)}</div>
		</div>
	)
}
