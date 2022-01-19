import { ImputDefaultProps } from "./ImputDefaultProps";
import Styles from "./styles.module.scss";

const InputDefault: React.FC<ImputDefaultProps> = ({
  id,
  label,
  isbgcolor,
  iscolor,
  children,
  className,
  ...props
}: ImputDefaultProps) => {
  const isColor = iscolor ?? "color_black-500";
  const isBgColor = isbgcolor ?? "#c3c3c3";
  const isId = id ?? "input" + id;

  switch (props.type) {
    case "text":
      return (
        <div className={`${Styles.input__default}`}>
          <label htmlFor="">{label}</label>
          <input
            onChange={props.onChange}
            placeholder={props.placeholder ?? "Digíte um placeholder"}
            alt={props.alt ?? "Text alternative"}
            type={"text"}
            id={isId}
            value={props.value}
            className={className}
          />
        </div>
      );
    case "password":
      return (
        <div className={`${Styles.input__default}`}>
          <label htmlFor="">{label}</label>
          <input
            onChange={props.onChange}
            placeholder={props.placeholder ?? "Digíte um placeholder"}
            alt={props.alt ?? "Text alternative"}
            type={"password"}
            id={isId}
            value={props.value}
            className={className}
          />
        </div>
      );
    case "number":
      return (
        <div className={`${Styles.input__default}`}>
          <label htmlFor={label}>{label}</label>
          <input
            onChange={props.onChange}
            placeholder={props.placeholder ?? "Digíte um placeholder"}
            alt={props.alt ?? "Text alternative"}
            type={"number"}
            className={className}
            id={isId}
          />
        </div>
      );

    case "select":
      return (
        <div className={`${Styles.input__default}`}>
          <label htmlFor={label}>{label}</label>
          <select
            placeholder={props.placeholder ?? "Digíte um placeholder"}
            id={isId}
            className={className}
          >
            {children}
          </select>
        </div>
      );

    case "textarea":
      return (
        <div className={`${Styles.input__default}`}>
          <label htmlFor={label}>{label}</label>
          <textarea
            onChange={props.onChange}
            placeholder={props.placeholder ?? "Digíte um placeholder"}
            rows={5}
            cols={33}
            id={isId}
            className={className}
          ></textarea>
        </div>
      );

    default:
      return (
        <>
          <label htmlFor={label}>{label}</label>
          <input
            onChange={props.onChange}
            placeholder={props.placeholder ?? "Digíte um placeholder"}
            alt={props.alt ?? "Text alternative"}
            type={"text"}
            id={isId}
            className={className}
          />
        </>
      );
  }
};

export { InputDefault };
