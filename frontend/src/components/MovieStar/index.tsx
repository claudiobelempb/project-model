import Image from 'next/image';

import StarFull from 'assets/images/dsmovie/star-full.svg';
import StarHalf from 'assets/images/dsmovie/star-half.svg';
import StarEmpty from 'assets/images/dsmovie/star-empty.svg';

type ScoreProps = {
  score: number;
};

type StarProps = {
  fill: number;
};

const MovieStar: React.FC<ScoreProps> = ({ score }) => {
  const stars = [StarFull, StarHalf, StarEmpty];
  // EX:
  // getFills(3.5) => [1, 1, 1, 0.5, 0]
  // getFills(4.1) => [1, 1, 1, 1, 0.5]
  function getFills(score: number) {
    const fills = [0, 0, 0, 0, 0];

    const integerPart = Math.floor(score);

    for (let i = 0; i < integerPart; i++) {
      fills[i] = 1;
    }

    const diff = score - integerPart;
    if (diff > 0) {
      fills[integerPart] = 0.5;
    }

    return fills;
  }

  const fills = getFills(score);

  const Star: React.FC<StarProps> = ({ fill }) => {
    if (fill === 0) {
      return <Image src={StarEmpty} alt={'Imagem do Card'} />;
    } else if (fill === 1) {
      return <Image src={StarFull} alt={'Imagem do Card'} />;
    } else {
      return <Image src={StarHalf} alt={'Imagem do Card'} />;
    }
  };

  return (
    <>
      {fills.map((fill, index) => (
        <Star key={index} fill={fill} />
      ))}
    </>
  );
};

export { MovieStar };
