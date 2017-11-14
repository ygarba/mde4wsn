/*****************************************************************************
* Product: QP-nano
* Last Updated for Version: 4.5.00
* Date of the Last Update:  Jun 13, 2012
*
*                    Q u a n t u m     L e a P s
*                    ---------------------------
*                    innovating embedded systems
*
* Copyright (C) 2002-2012 Quantum Leaps, LLC. All rights reserved.
*
* This program is open source software: you can redistribute it and/or
* modify it under the terms of the GNU General Public License as published
* by the Free Software Foundation, either version 2 of the License, or
* (at your option) any later version.
*
* Alternatively, this program may be distributed and modified under the
* terms of Quantum Leaps commercial licenses, which expressly supersede
* the GNU General Public License and are specifically designed for
* licensees interested in retaining the proprietary status of their code.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*
* Contact information:
* Quantum Leaps Web sites: http://www.quantum-leaps.com
*                          http://www.state-machine.com
* e-mail:                  info@quantum-leaps.com
*****************************************************************************/
//#include "qpn_port.h"                                       /* QP-nano port */
#include "qepn.h"
#include "qassert.h"
#include <stdio.h>

Q_DEFINE_THIS_MODULE("qepn")

/**
* \file
* \ingroup qepn qfn
* QEP-nano implementation.
*/

/** empty signal for internal use only */
#define QEP_EMPTY_SIG_        (QSignal)0

/** maximum depth of state nesting (including the top level), must be >= 2 */
#define QEP_MAX_NEST_DEPTH_   (uint8_t)5

/*..........................................................................*/
char_t const Q_ROM * Q_ROM_VAR QP_getVersion(void) {
    static char_t const Q_ROM Q_ROM_VAR version[] = {
        (char_t)((uint8_t)((QP_VERSION >> 12) & 0xFU) + (uint8_t)'0'),
        (char_t)'.',
        (char_t)((uint8_t)((QP_VERSION >>  8) & 0xFU) + (uint8_t)'0'),
        (char_t)'.',
        (char_t)((uint8_t)((QP_VERSION >>  4) & 0xFU) + (uint8_t)'0'),
        (char_t)((uint8_t)(QP_VERSION         & 0xFU) + (uint8_t)'0'),
        (char_t)'\0'
    };
    return version;
}

#ifndef Q_NFSM
/*..........................................................................*/
void QFsm_init(QFsm * const me) {
    Q_REQUIRE((me->temp != Q_STATE_CAST(0))        /* ctor must be executed */
              && (me->state == Q_STATE_CAST(0))); /*initial tran. NOT taken */

                                 /* execute the top-most initial transition */
    Q_ALLEGE((*me->temp)(me) == Q_RET_TRAN);    /* transition must be taken */

    Q_SIG(me) = (QSignal)Q_ENTRY_SIG;
    (void)(*me->temp)(me);                              /* enter the target */
    me->state = me->temp;                    /* change the new active state */
}
/*..........................................................................*/
#ifndef QK_PREEMPTIVE
void QFsm_dispatch(QFsm *const me) {
#else
void QFsm_dispatch(QFsm *const me) Q_REENTRANT {
#endif

    if ((*me->state)(me) == Q_RET_TRAN) {              /* transition taken? */
        Q_SIG(me) = (QSignal)Q_EXIT_SIG;
        (void)(*me->state)(me);                          /* exit the source */

        Q_SIG(me) = (QSignal)Q_ENTRY_SIG;
        (void)(*me->temp)(me);                          /* enter the target */
        me->state = me->temp;                /* record the new active state */
    }
}
#endif                                                            /* Q_NFSM */

//#ifndef Q_NHSM

//below is useless, get rid of it!
void Q_onAssert(char const Q_ROM * const Q_ROM_VAR file, int line) {
    //(void)file;                                   /* avoid compiler warning */
    //(void)line;                                   /* avoid compiler warning */
    //QF_INT_DISABLE();
    //LED_ON_ALL();                                            /* all LEDs on */
    //for (;;) {       /* NOTE: replace the loop with reset for final version */
    //}
	return;
}

