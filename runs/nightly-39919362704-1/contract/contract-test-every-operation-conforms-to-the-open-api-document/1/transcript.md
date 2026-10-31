# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 450 | `qa-fb11d389-9d0d-4053-9882-c28810bf76e3` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-1de93026-caf1-4f90-8d27-bad8ac55ff59` |
| 3 | `GET /health` | 200 | 75 | `qa-d97cda06-a09e-4463-8de9-c0c6e24da997` |
| 4 | `POST /v1/auth/token` | 200 | 34 | `qa-9d24215d-cfad-4ec1-84fd-3aa91b267b8b` |
| 5 | `GET /v1/accounts/me` | 200 | 17 | `qa-9606fd74-6c94-440e-8e45-0265c104c15a` |
| 6 | `PATCH /v1/accounts/me` | 200 | 23 | `qa-2e3e028c-5764-4f0f-890c-11704bedb301` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 26 | `qa-3b7002f9-a84b-49d6-9309-6043b872686b` |
| 8 | `POST /v1/conversations` | 201 | 30 | `qa-9393c9a0-fd48-4ac3-bc66-b3da9946d662` |
| 9 | `GET /v1/conversations` | 200 | 22 | `qa-3fd7b89c-a416-44e0-8cf7-db58e8cdb064` |
| 10 | `POST /v1/auth/token` | 200 | 39 | `qa-91fe163e-1488-4eb0-818f-2d2210b44fe2` |
| 11 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-792538aa-b285-4971-b90f-b194e29bee5b` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 44 | `qa-e4c0c570-c177-4338-b4b6-8c7c144beb6c` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-b40a61a2-711e-4eaa-8ebc-b758a9bcd10f` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 14 | `qa-d4dcdb27-4e2f-4817-8d47-16df19dc4a31` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 11 | `qa-02994836-151f-4f03-8c73-a70d3fa7d529` |
| 16 | `GET /v1/credits/balance` | 200 | 15 | `qa-6d0d0869-3920-48ba-9666-fa8ccd858e8a` |
| 17 | `GET /v1/credits/ledger` | 200 | 18 | `qa-415097c6-6c9a-4fd9-b75e-9e0919d47b18` |
| 18 | `POST /v1/credits/purchases` | 201 | 13 | `qa-74a664d8-11f4-4bd4-91b8-563818a58864` |
| 19 | `GET /v1/admin/stats` | 403 | 25 | `qa-a2eec013-24c4-4894-b39d-b9450104839a` |
| 20 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-52015708-a1ae-4c22-91f7-31fe9d1b74d9` |
| 21 | `POST /v1/auth/token` | 401 | 16 | `qa-709441ec-5661-4d69-8486-5bbf7959fd93` |
| 22 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-fe85f9e6-0d43-4236-82a4-e721007612b3` |
| 23 | `POST /v1/auth/token` | 401 | 12 | `qa-1267a4e0-a589-42d0-9aa4-fe33fdd55e26` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fb11d389-9d0d-4053-9882-c28810bf76e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb11d389-9d0d-4053-9882-c28810bf76e3
Content-Type: application/json

--- request body ---
{"handle":"qa-e1e643a4a084","displayName":"QA e1e643a4a084","password":"****","region":"eu"}

--- response: 201 in 450 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb11d389-9d0d-4053-9882-c28810bf76e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-e1e643a4a084
X-Served-Region: eu
Content-Length: 181

{"id":"acc_45339d82-7376-40df-bb79-f74b7b514064","handle":"qa-e1e643a4a084","displayName":"QA e1e643a4a084","region":"eu","role":"user","createdAt":"2026-10-23T07:41:42.513518203Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1de93026-caf1-4f90-8d27-bad8ac55ff59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1de93026-caf1-4f90-8d27-bad8ac55ff59
Content-Type: application/json

--- request body ---
{"handle":"qa-cec7a70dd19c","displayName":"QA cec7a70dd19c","password":"****","region":"us"}

--- response: 201 in 39 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-1de93026-caf1-4f90-8d27-bad8ac55ff59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-cec7a70dd19c
X-Served-Region: us
Content-Length: 181

{"id":"acc_3c1ac954-b13c-480f-bce5-1a8d5bbfd014","handle":"qa-cec7a70dd19c","displayName":"QA cec7a70dd19c","region":"us","role":"user","createdAt":"2026-10-23T07:41:42.975921301Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-d97cda06-a09e-4463-8de9-c0c6e24da997

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d97cda06-a09e-4463-8de9-c0c6e24da997
Content-Type: application/json

--- response: 200 in 75 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-d97cda06-a09e-4463-8de9-c0c6e24da997
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-9d24215d-cfad-4ec1-84fd-3aa91b267b8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d24215d-cfad-4ec1-84fd-3aa91b267b8b
Content-Type: application/json

--- request body ---
{"handle":"qa-e1e643a4a084","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d24215d-cfad-4ec1-84fd-3aa91b267b8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_45339d82-7376-40df-bb79-f74b7b514064"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-9606fd74-6c94-440e-8e45-0265c104c15a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9606fd74-6c94-440e-8e45-0265c104c15a
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9606fd74-6c94-440e-8e45-0265c104c15a
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
Content-Length: 181

{"id":"acc_45339d82-7376-40df-bb79-f74b7b514064","handle":"qa-e1e643a4a084","displayName":"QA e1e643a4a084","region":"eu","role":"user","createdAt":"2026-10-23T07:41:42.513518203Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-2e3e028c-5764-4f0f-890c-11704bedb301

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e3e028c-5764-4f0f-890c-11704bedb301
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e3e028c-5764-4f0f-890c-11704bedb301
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
Content-Length: 178

{"id":"acc_45339d82-7376-40df-bb79-f74b7b514064","handle":"qa-e1e643a4a084","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-10-23T07:41:42.513518203Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-cec7a70dd19c
correlation: qa-3b7002f9-a84b-49d6-9309-6043b872686b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b7002f9-a84b-49d6-9309-6043b872686b
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b7002f9-a84b-49d6-9309-6043b872686b
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
Content-Length: 74

{"handle":"qa-cec7a70dd19c","displayName":"QA cec7a70dd19c","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-9393c9a0-fd48-4ac3-bc66-b3da9946d662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9393c9a0-fd48-4ac3-bc66-b3da9946d662
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cec7a70dd19c","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9393c9a0-fd48-4ac3-bc66-b3da9946d662
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
Location: /v1/conversations/cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f
X-Data-Region: us
Content-Length: 238

{"id":"cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-e1e643a4a084","qa-cec7a70dd19c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.308689113Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-3fd7b89c-a416-44e0-8cf7-db58e8cdb064

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fd7b89c-a416-44e0-8cf7-db58e8cdb064
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fd7b89c-a416-44e0-8cf7-db58e8cdb064
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
Content-Length: 260

{"items":[{"id":"cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-e1e643a4a084","qa-cec7a70dd19c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.308689113Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-91fe163e-1488-4eb0-818f-2d2210b44fe2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91fe163e-1488-4eb0-818f-2d2210b44fe2
Content-Type: application/json

--- request body ---
{"handle":"qa-cec7a70dd19c","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-91fe163e-1488-4eb0-818f-2d2210b44fe2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3c1ac954-b13c-480f-bce5-1a8d5bbfd014"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f
correlation: qa-792538aa-b285-4971-b90f-b194e29bee5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-792538aa-b285-4971-b90f-b194e29bee5b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-792538aa-b285-4971-b90f-b194e29bee5b
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-e1e643a4a084","qa-cec7a70dd19c"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-23T07:41:43.308689113Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f/messages
correlation: qa-e4c0c570-c177-4338-b4b6-8c7c144beb6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4c0c570-c177-4338-b4b6-8c7c144beb6c
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4c0c570-c177-4338-b4b6-8c7c144beb6c
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
X-Served-Region: us
Content-Length: 215

{"items":[{"id":"msg_ee3d12f5-e7c4-40f1-bf2f-a3bfbcccbf18","conversationId":"cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f","sender":"qa-e1e643a4a084","body":"Hi","createdAt":"2026-10-23T07:41:43.308723096Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f/messages
correlation: qa-b40a61a2-711e-4eaa-8ebc-b758a9bcd10f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b40a61a2-711e-4eaa-8ebc-b758a9bcd10f
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-b40a61a2-711e-4eaa-8ebc-b758a9bcd10f
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_a01f5f02-c44e-4663-8b4b-dd6ab373f343","conversationId":"cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f","sender":"qa-cec7a70dd19c","body":"Reply","createdAt":"2026-10-23T07:41:43.533378375Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f/read
correlation: qa-d4dcdb27-4e2f-4817-8d47-16df19dc4a31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4dcdb27-4e2f-4817-8d47-16df19dc4a31
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4dcdb27-4e2f-4817-8d47-16df19dc4a31
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
Content-Length: 77

{"conversationId":"cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f/close
correlation: qa-02994836-151f-4f03-8c73-a70d3fa7d529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02994836-151f-4f03-8c73-a70d3fa7d529
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-02994836-151f-4f03-8c73-a70d3fa7d529
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
Content-Length: 284

{"id":"cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-e1e643a4a084","qa-cec7a70dd19c"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.308689113Z","closedAt":"2026-10-23T07:41:43.580467377Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-6d0d0869-3920-48ba-9666-fa8ccd858e8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d0d0869-3920-48ba-9666-fa8ccd858e8a
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d0d0869-3920-48ba-9666-fa8ccd858e8a
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
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_45339d82-7376-40df-bb79-f74b7b514064"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-415097c6-6c9a-4fd9-b75e-9e0919d47b18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-415097c6-6c9a-4fd9-b75e-9e0919d47b18
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-415097c6-6c9a-4fd9-b75e-9e0919d47b18
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
Content-Length: 393

{"items":[{"id":"led_944041ef-4bc5-4247-bd25-8aa1d5b8afd1","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-23T07:41:42.513528623Z"},{"id":"led_0af00294-7725-4951-af3c-215caa7c756b","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_c00fc704-b8fe-4f85-8e7d-cf519368743f","createdAt":"2026-10-23T07:41:43.308672232Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-74a664d8-11f4-4bd4-91b8-563818a58864

--- request headers ---
Accept: application/json
Idempotency-Key: qa-065b9c82933045ec9143b41bacee6cb0
X-Correlation-Id: qa-74a664d8-11f4-4bd4-91b8-563818a58864
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-74a664d8-11f4-4bd4-91b8-563818a58864
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_3a617972-bab5-4576-8c71-33e3dbab7d48
Content-Length: 144

{"id":"pur_3a617972-bab5-4576-8c71-33e3dbab7d48","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-10-23T07:41:43.667690943Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-a2eec013-24c4-4894-b39d-b9450104839a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2eec013-24c4-4894-b39d-b9450104839a
Content-Type: application/json

--- response: 403 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2eec013-24c4-4894-b39d-b9450104839a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-a2eec013-24c4-4894-b39d-b9450104839a"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-52015708-a1ae-4c22-91f7-31fe9d1b74d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52015708-a1ae-4c22-91f7-31fe9d1b74d9
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-52015708-a1ae-4c22-91f7-31fe9d1b74d9
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
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-709441ec-5661-4d69-8486-5bbf7959fd93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-709441ec-5661-4d69-8486-5bbf7959fd93
Content-Type: application/json

--- request body ---
{"handle":"qa-cec7a70dd19c","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-709441ec-5661-4d69-8486-5bbf7959fd93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-709441ec-5661-4d69-8486-5bbf7959fd93"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fe85f9e6-0d43-4236-82a4-e721007612b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe85f9e6-0d43-4236-82a4-e721007612b3
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fe85f9e6-0d43-4236-82a4-e721007612b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-1267a4e0-a589-42d0-9aa4-fe33fdd55e26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1267a4e0-a589-42d0-9aa4-fe33fdd55e26
Content-Type: application/json

--- request body ---
{"handle":"qa-e1e643a4a084","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1267a4e0-a589-42d0-9aa4-fe33fdd55e26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1267a4e0-a589-42d0-9aa4-fe33fdd55e26"}
```
