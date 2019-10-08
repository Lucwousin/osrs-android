public class kn {
    public static final int al = 2;

    kn() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("kn.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static int ab(char arg2, ly arg3) {
        int v0 = arg2 << 4;
        if((Character.isUpperCase(arg2)) || (Character.isTitleCase(arg2))) {
            int v2 = Character.toLowerCase(arg2);
            v0 = (v2 << 4) + 1;
        }

        if(0xBBA485E4 == v2 && ly.ap == arg3) {
            v0 = 0x6E2;
        }

        return v0;
    }

    static char ad(char arg3) {
        char v0 = 'E';
        if(0xC6 == arg3) {
            return v0;
        }

        char v2 = 'e';
        if(arg3 == 230) {
            return v2;
        }

        if(arg3 == 0xDF) {
            return 's';
        }

        if(338 == arg3) {
            return v0;
        }

        if(arg3 == 339) {
            return v2;
        }

        return 0;
    }

    static char aj(char arg5, ly arg6) {
        char v0 = 'Y';
        char v1 = 'o';
        char v2 = 'O';
        int v3 = 0xC0;
        if(arg5 >= v3) {
            int v4 = 0xFF;
            if(arg5 <= v4) {
                if(arg5 >= v3 && arg5 <= 0xC6) {
                    return 'A';
                }

                if(arg5 == 0xC7) {
                    return 'C';
                }

                if(arg5 >= 200 && arg5 <= 203) {
                    return 'E';
                }

                if(arg5 >= 204 && arg5 <= 0xCF) {
                    return 'I';
                }

                if(arg5 == 209 && ly.ap != arg6) {
                    return 'N';
                }

                if(arg5 >= 210 && arg5 <= 0xD6) {
                    return v2;
                }

                if(arg5 >= 0xD9 && arg5 <= 220) {
                    return 'U';
                }

                if(0xDD == arg5) {
                    return v0;
                }

                if(arg5 == 0xDF) {
                    return 's';
                }

                if(arg5 >= 0xE0 && arg5 <= 230) {
                    return 'a';
                }

                if(arg5 == 0xE7) {
                    return 'c';
                }

                if(arg5 >= 0xE8 && arg5 <= 0xEB) {
                    return 'e';
                }

                if(arg5 >= 0xEC && arg5 <= 0xEF) {
                    return 'i';
                }

                if(0xF1 == arg5 && ly.ap != arg6) {
                    return 'n';
                }

                if(arg5 >= 0xF2 && arg5 <= 0xF6) {
                    return v1;
                }

                if(arg5 >= 0xF9 && arg5 <= 0xFC) {
                    return 'u';
                }

                if(arg5 != 0xFD && arg5 != v4) {
                    goto label_96;
                }

                return 'y';
            }
        }

    label_96:
        if(338 == arg5) {
            return v2;
        }

        if(339 == arg5) {
            return v1;
        }

        if(arg5 == 376) {
            return v0;
        }

        return arg5;
    }

    static char an(char arg5, ly arg6) {
        char v0 = 'Y';
        char v1 = 'o';
        char v2 = 'O';
        int v3 = 0xC0;
        if(arg5 >= v3) {
            int v4 = 0xFF;
            if(arg5 <= v4) {
                if(arg5 >= v3 && arg5 <= 0xC6) {
                    return 'A';
                }

                if(arg5 == 0xC7) {
                    return 'C';
                }

                if(arg5 >= 200 && arg5 <= 203) {
                    return 'E';
                }

                if(arg5 >= 204 && arg5 <= 0xCF) {
                    return 'I';
                }

                if(arg5 == 209 && ly.ap != arg6) {
                    return 'N';
                }

                if(arg5 >= 210 && arg5 <= 0xD6) {
                    return v2;
                }

                if(arg5 >= 0xD9 && arg5 <= 220) {
                    return 'U';
                }

                if(0xDD == arg5) {
                    return v0;
                }

                if(arg5 == 0xDF) {
                    return 's';
                }

                if(arg5 >= 0xE0 && arg5 <= 230) {
                    return 'a';
                }

                if(arg5 == 0xE7) {
                    return 'c';
                }

                if(arg5 >= 0xE8 && arg5 <= 0xEB) {
                    return 'e';
                }

                if(arg5 >= 0xEC && arg5 <= 0xEF) {
                    return 'i';
                }

                if(0xF1 == arg5 && ly.ap != arg6) {
                    return 'n';
                }

                if(arg5 >= 0xF2 && arg5 <= 0xF6) {
                    return v1;
                }

                if(arg5 >= 0xF9 && arg5 <= 0xFC) {
                    return 'u';
                }

                if(arg5 != 0xFD && arg5 != v4) {
                    goto label_96;
                }

                return 'y';
            }
        }

    label_96:
        if(338 == arg5) {
            return v2;
        }

        if(339 == arg5) {
            return v1;
        }

        if(arg5 == 376) {
            return v0;
        }

        return arg5;
    }

    static char ap(char arg5, ly arg6) {
        char v0 = 'Y';
        char v1 = 'o';
        char v2 = 'O';
        int v3 = 0xC0;
        if(arg5 >= v3) {
            int v4 = 0xFF;
            if(arg5 <= v4) {
                if(arg5 >= v3 && arg5 <= 0xC6) {
                    return 'A';
                }

                if(arg5 == 0xC7) {
                    return 'C';
                }

                if(arg5 >= 200 && arg5 <= 203) {
                    return 'E';
                }

                if(arg5 >= 204 && arg5 <= 0xCF) {
                    return 'I';
                }

                if(arg5 == 209 && ly.ap != arg6) {
                    return 'N';
                }

                if(arg5 >= 210 && arg5 <= 0xD6) {
                    return v2;
                }

                if(arg5 >= 0xD9 && arg5 <= 220) {
                    return 'U';
                }

                if(0xDD == arg5) {
                    return v0;
                }

                if(arg5 == 0xDF) {
                    return 's';
                }

                if(arg5 >= 0xE0 && arg5 <= 230) {
                    return 'a';
                }

                if(arg5 == 0xE7) {
                    return 'c';
                }

                if(arg5 >= 0xE8 && arg5 <= 0xEB) {
                    return 'e';
                }

                if(arg5 >= 0xEC && arg5 <= 0xEF) {
                    return 'i';
                }

                if(0xF1 == arg5 && ly.ap != arg6) {
                    return 'n';
                }

                if(arg5 >= 0xF2 && arg5 <= 0xF6) {
                    return v1;
                }

                if(arg5 >= 0xF9 && arg5 <= 0xFC) {
                    return 'u';
                }

                if(arg5 != 0xFD && arg5 != v4) {
                    goto label_96;
                }

                return 'y';
            }
        }

    label_96:
        if(338 == arg5) {
            return v2;
        }

        if(339 == arg5) {
            return v1;
        }

        if(arg5 == 376) {
            return v0;
        }

        return arg5;
    }

    static char aq(char arg3) {
        char v0 = 'E';
        if(0xC6 == arg3) {
            return v0;
        }

        char v2 = 'e';
        if(arg3 == 230) {
            return v2;
        }

        if(arg3 == 0xDF) {
            return 's';
        }

        if(338 == arg3) {
            return v0;
        }

        if(arg3 == 339) {
            return v2;
        }

        return 0;
    }
}

