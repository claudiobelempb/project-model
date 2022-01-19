import Link from "next/link";
import Image from "next/image";

import { NavVertical } from "../NavDefault/NavVertical";
import { NavHorizontal } from "../NavDefault/NavHorizontal";

type NavDefaultProps = {
  type: "nav-vertical" | "nav-hozontal";
};

const Nav: React.FC<NavDefaultProps> = ({ type }) => {
  switch (type) {
    case "nav-hozontal":
      return (
        <NavHorizontal>
          <li>
            <Link href={"/"}>
              <a target={"_self"}>Home</a>
            </Link>
          </li>
          <li>
            <Link href={"/"}>
              <a target={"_self"}>Home</a>
            </Link>
          </li>
          <li>
            <Link href={"/"}>
              <a target={"_self"}>Home</a>
            </Link>
          </li>
        </NavHorizontal>
      );
    case "nav-vertical":
      return (
        <NavVertical>
          <li>
            <Link href={"/"}>
              <a target={"_self"}>Home</a>
            </Link>
          </li>
          <li>
            <Link href={"/"}>
              <a target={"_self"}>Home</a>
            </Link>
          </li>
          <li>
            <Link href={"/"}>
              <a target={"_self"}>Home</a>
            </Link>
          </li>
        </NavVertical>
      );
    default:
      return (
        <NavVertical>
          <li>
            <Link href={"/"}>
              <a target={"_self"}>Home</a>
            </Link>
          </li>
        </NavVertical>
      );
  }
};

export { Nav };
