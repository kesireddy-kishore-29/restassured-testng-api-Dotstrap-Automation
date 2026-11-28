# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-a09f155f-d3d0-4b60-86d0-25f5ee8443b4` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-1a8807db-1c82-415d-8c04-11b8dd0e2fa9` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-c67543de-6863-4a85-bce8-d8048a2c7603` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-a78693fc-8365-4411-ab74-9b8218148cbe` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-fa4f0386-4b7c-4aea-996c-e08e223a4f08` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-8996acde-351b-42d8-a147-e9cc68cb2f43` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-c748501b-d678-4d0e-97bc-5079f4102671` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-32641950-beb0-4783-9ca7-c81ac96855ad` |
| 9 | `GET /v1/credits/balance` | 200 | 12 | `qa-8cef3fa3-3a9f-4203-95ab-d13728dcef81` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 16 | `qa-287f8baa-b7fa-4471-912e-cbf5beeace06` |
| 11 | `GET /v1/credits/ledger` | 200 | 20 | `qa-3134f1d1-892c-4a9c-846e-a8ce7e97d4f0` |
| 12 | `POST /v1/auth/token` | 200 | 14 | `qa-6d94baaf-0935-40de-a31c-24fd14aac71e` |
| 13 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-dc19e00e-9f23-4dbe-9f31-1297fbb3af2f` |
| 14 | `POST /v1/auth/token` | 401 | 3 | `qa-05709360-8f98-49cb-b23d-2178b90a59dd` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-d2695e0c-5efe-4651-a00d-942e62df87aa` |
| 16 | `POST /v1/auth/token` | 401 | 8 | `qa-f29caab2-47a8-4b85-8ae9-e053fb84be80` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a09f155f-d3d0-4b60-86d0-25f5ee8443b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a09f155f-d3d0-4b60-86d0-25f5ee8443b4
Content-Type: application/json

--- request body ---
{"handle":"qa-eab14f70722c","displayName":"QA eab14f70722c","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a09f155f-d3d0-4b60-86d0-25f5ee8443b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-eab14f70722c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff0151ac-710b-4e1e-9310-7f9c21c01e78","handle":"qa-eab14f70722c","displayName":"QA eab14f70722c","region":"eu","role":"user","createdAt":"2026-11-20T10:09:52.834333533Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1a8807db-1c82-415d-8c04-11b8dd0e2fa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a8807db-1c82-415d-8c04-11b8dd0e2fa9
Content-Type: application/json

--- request body ---
{"handle":"qa-89ae16ceeffa","displayName":"QA 89ae16ceeffa","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a8807db-1c82-415d-8c04-11b8dd0e2fa9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-89ae16ceeffa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f131d2f3-5cf6-413f-b860-24a7217d5048","handle":"qa-89ae16ceeffa","displayName":"QA 89ae16ceeffa","region":"eu","role":"user","createdAt":"2026-11-20T10:09:52.863116560Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c67543de-6863-4a85-bce8-d8048a2c7603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c67543de-6863-4a85-bce8-d8048a2c7603
Content-Type: application/json

--- request body ---
{"handle":"qa-eab14f70722c","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c67543de-6863-4a85-bce8-d8048a2c7603
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff0151ac-710b-4e1e-9310-7f9c21c01e78"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a78693fc-8365-4411-ab74-9b8218148cbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a78693fc-8365-4411-ab74-9b8218148cbe
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-89ae16ceeffa","subject":"Many messages","message":"1"}

--- response: 201 in 17 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a78693fc-8365-4411-ab74-9b8218148cbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_d69379af-9d23-46bf-83fd-78693c5a775d
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_d69379af-9d23-46bf-83fd-78693c5a775d","subject":"Many messages","status":"open","region":"eu","participants":["qa-eab14f70722c","qa-89ae16ceeffa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:09:52.913628857Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_d69379af-9d23-46bf-83fd-78693c5a775d/messages
correlation: qa-fa4f0386-4b7c-4aea-996c-e08e223a4f08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa4f0386-4b7c-4aea-996c-e08e223a4f08
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 18 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa4f0386-4b7c-4aea-996c-e08e223a4f08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_fdf0951b-1907-48f7-85c1-52fd56c9e9c0","conversationId":"cnv_d69379af-9d23-46bf-83fd-78693c5a775d","sender":"qa-eab14f70722c","body":"2","createdAt":"2026-11-20T10:09:52.967708248Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_d69379af-9d23-46bf-83fd-78693c5a775d/messages
correlation: qa-8996acde-351b-42d8-a147-e9cc68cb2f43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8996acde-351b-42d8-a147-e9cc68cb2f43
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 16 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8996acde-351b-42d8-a147-e9cc68cb2f43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_f5035c14-6bcd-4fc5-84e8-8425448d9347","conversationId":"cnv_d69379af-9d23-46bf-83fd-78693c5a775d","sender":"qa-eab14f70722c","body":"3","createdAt":"2026-11-20T10:09:53.005155301Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_d69379af-9d23-46bf-83fd-78693c5a775d/messages
correlation: qa-c748501b-d678-4d0e-97bc-5079f4102671

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c748501b-d678-4d0e-97bc-5079f4102671
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 11 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c748501b-d678-4d0e-97bc-5079f4102671
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_46b2f742-1290-4185-8470-cf9a87e05cda","conversationId":"cnv_d69379af-9d23-46bf-83fd-78693c5a775d","sender":"qa-eab14f70722c","body":"4","createdAt":"2026-11-20T10:09:53.027370999Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_d69379af-9d23-46bf-83fd-78693c5a775d/messages
correlation: qa-32641950-beb0-4783-9ca7-c81ac96855ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32641950-beb0-4783-9ca7-c81ac96855ad
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 10 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-32641950-beb0-4783-9ca7-c81ac96855ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_fd82693e-9393-4ce2-b205-8d77498ad851","conversationId":"cnv_d69379af-9d23-46bf-83fd-78693c5a775d","sender":"qa-eab14f70722c","body":"5","createdAt":"2026-11-20T10:09:53.044229169Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-8cef3fa3-3a9f-4203-95ab-d13728dcef81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cef3fa3-3a9f-4203-95ab-d13728dcef81
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cef3fa3-3a9f-4203-95ab-d13728dcef81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_ff0151ac-710b-4e1e-9310-7f9c21c01e78"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_d69379af-9d23-46bf-83fd-78693c5a775d/messages
correlation: qa-287f8baa-b7fa-4471-912e-cbf5beeace06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-287f8baa-b7fa-4471-912e-cbf5beeace06
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 16 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-287f8baa-b7fa-4471-912e-cbf5beeace06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_d69379af-9d23-46bf-83fd-78693c5a775d/messages","correlationId":"qa-287f8baa-b7fa-4471-912e-cbf5beeace06"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-3134f1d1-892c-4a9c-846e-a8ce7e97d4f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3134f1d1-892c-4a9c-846e-a8ce7e97d4f0
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3134f1d1-892c-4a9c-846e-a8ce7e97d4f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_7eab1538-331e-440a-8b32-aab9ccd3fb1b","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-20T10:09:52.834346040Z"},{"id":"led_3be34ad0-f6a8-43a1-98a1-f7ea4b2ae3ea","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_d69379af-9d23-46bf-83fd-78693c5a775d","createdAt":"2026-11-20T10:09:52.913601758Z"},{"id":"led_98cfbe39-90a7-4cef-9743-6a0edea4f90b","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_fdf0951b-1907-48f7-85c1-52fd56c9e9c0","createdAt":"2026-11-20T10:09:52.967698355Z"},{"id":"led_261f021b-c215-476f-a406-0cab40b424ac","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_f5035c14-6bcd-4fc5-84e8-8425448d9347","createdAt":"2026-11-20T10:09:53.005139900Z"},{"id":"led_3f898c94-f5b6-49ee-9259-22a15e8d44e5","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_46b2f742-1290-4185-8470-cf9a87e05cda","createdAt":"2026-11-20T10:09:53.027353707Z"},{"id":"led_7d739eeb-fd62-45dc-815b-af59efb7ccc3","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_fd82693e-9393-4ce2-b205-8d77498ad851","createdAt":"2026-11-20T10:09:53.044207358Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-6d94baaf-0935-40de-a31c-24fd14aac71e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d94baaf-0935-40de-a31c-24fd14aac71e
Content-Type: application/json

--- request body ---
{"handle":"qa-89ae16ceeffa","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d94baaf-0935-40de-a31c-24fd14aac71e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f131d2f3-5cf6-413f-b860-24a7217d5048"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc19e00e-9f23-4dbe-9f31-1297fbb3af2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc19e00e-9f23-4dbe-9f31-1297fbb3af2f
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc19e00e-9f23-4dbe-9f31-1297fbb3af2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-05709360-8f98-49cb-b23d-2178b90a59dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05709360-8f98-49cb-b23d-2178b90a59dd
Content-Type: application/json

--- request body ---
{"handle":"qa-89ae16ceeffa","password":"****"}

--- response: 401 in 3 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05709360-8f98-49cb-b23d-2178b90a59dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05709360-8f98-49cb-b23d-2178b90a59dd"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d2695e0c-5efe-4651-a00d-942e62df87aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2695e0c-5efe-4651-a00d-942e62df87aa
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d2695e0c-5efe-4651-a00d-942e62df87aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-f29caab2-47a8-4b85-8ae9-e053fb84be80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f29caab2-47a8-4b85-8ae9-e053fb84be80
Content-Type: application/json

--- request body ---
{"handle":"qa-eab14f70722c","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f29caab2-47a8-4b85-8ae9-e053fb84be80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f29caab2-47a8-4b85-8ae9-e053fb84be80"}
```
