import Link from 'next/link';
import { IButtonDefaultProps } from './IButtonDefaultProps';
import Styles from './styles.module.scss';

const ButtonDefault: React.FC<IButtonDefaultProps> = ({
  size,
  title,
  color,
  bgcolor,
  children,
  className,
  href,
  disabled,
  ...props
}) => {
  const isColor = color ?? '';
  const isBgColor = bgcolor ?? '';
  const isHref = href ?? '';

  switch (size) {
    case 'full':
      return (
        <div
          className={`${Styles.button__container} ${Styles.button__container_full}`}
        >
          <button
            onClick={props.onClick}
            type={props.type ? props.type : 'button'}
            className={`${isBgColor} ${isColor} ${Styles.button__container_full} ${className}`}
            disabled={disabled}
          >
            {title ? title : ''}
            {children}
          </button>
        </div>
      );
    case 'large':
      return (
        <div
          className={`${Styles.button__container} ${Styles.button__container_large}`}
        >
          <button
            onClick={props.onClick}
            type={props.type ? props.type : 'button'}
            className={`${isBgColor} ${isColor} ${Styles.button__default_large} ${className}`}
            disabled={disabled}
          >
            {title ? title : ''}
            {children}
          </button>
        </div>
      );

    case 'medium':
      return (
        <div
          className={`${Styles.button__container} ${Styles.button__container_medium}`}
        >
          <button
            onClick={props.onClick}
            type={props.type ? props.type : 'button'}
            className={`${isBgColor} ${isColor} ${Styles.button__container_medium} ${className}`}
            disabled={disabled}
          >
            {title ? title : ''}
            {children}
          </button>
        </div>
      );

    case 'small':
      return (
        <div
          className={`${Styles.button__container} ${Styles.button__container_small}`}
        >
          <button
            onClick={props.onClick}
            type={props.type ? props.type : 'button'}
            className={`${isBgColor} ${isColor} ${Styles.button__container_small} ${className}`}
            disabled={disabled}
          >
            {children}
            {title ? title : ''}
          </button>
        </div>
      );
    case 'close':
      return (
        <div
          className={`${Styles.button__container} ${Styles.button__container_close}`}
        >
          <button
            onClick={props.onClick}
            type={props.type ? props.type : 'button'}
            className={`${isBgColor} ${isColor} ${Styles.button__container_close} ${className}`}
            disabled={disabled}
          >
            {children}
            {title ? title : ''}
          </button>
        </div>
      );
    case 'icon':
      return (
        <div
          className={`${Styles.button__container} ${Styles.button__container_icon}`}
        >
          <button
            onClick={props.onClick}
            type={props.type ? props.type : 'button'}
            className={`${isBgColor} ${isColor} ${Styles.button__default_icon} ${className}`}
            disabled={disabled}
          >
            {children}
            {title ? title : ''}
          </button>
        </div>
      );

    case 'link':
      return (
        <div
          className={`
           ${Styles.button__container}
            ${Styles.button__container_link}
          `}
        >
          <Link href={isHref}>
            <a className={`${isBgColor} ${isColor} ${className}`}>
              {title ? title : ''}
              {children}
            </a>
          </Link>
        </div>
      );

    default:
      return (
        <div
          className={`${Styles.button__container} ${Styles.button__container_medium}`}
        >
          <button
            onClick={props.onClick}
            type={props.type ? props.type : 'button'}
            className={`${isBgColor} ${isColor} ${Styles.button__default_full} ${className}`}
            disabled={disabled}
          >
            {title ? title : ''}
            {children}
          </button>
        </div>
      );
  }
};

export { ButtonDefault };
