import Image from 'next/image';
import { Movie } from 'types/Movie';

import styles from './styles.module.scss';
import { TypeImage } from './TypeImage';

type MovieCardProps = {
  movie: Movie;
};

const ImageDefault: React.FC<MovieCardProps> = ({ movie }) => {
  return (
    <>
      <Image src={movie.image} alt={movie.title} width={480} height={300} />
    </>
  );
};

export { ImageDefault };
