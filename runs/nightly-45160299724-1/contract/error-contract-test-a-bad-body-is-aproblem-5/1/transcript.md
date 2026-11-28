# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-19f8a5ea-0d3c-4fe3-b0ef-2a2f9717f8f5` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-c5092ac8-6748-4ba6-89ff-cbf3e2ac2367` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-1c9dca12-2723-4a95-9e29-901ba74d0637` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-0397d010-b86e-47f1-a692-4593929bd070` |
| 5 | `POST /v1/accounts` | 422 | 10 | `qa-7edbdee8-18a8-4177-b4e7-32133735cddf` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-f5d6e01c-727b-487e-bded-09599721b480` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-7ffac52b-3137-4414-a319-57c10c0dbc78` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-ce4d7f29-17fe-4a0f-9a6f-968480558f70` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-68ef7901-e327-421c-bceb-8e49284ca097` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-5bcb5201-1601-4dfd-999e-e89bf7daa599` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-19f8a5ea-0d3c-4fe3-b0ef-2a2f9717f8f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19f8a5ea-0d3c-4fe3-b0ef-2a2f9717f8f5
Content-Type: application/json

--- request body ---
{"handle":"qa-674421a895fe","displayName":"QA 674421a895fe","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-19f8a5ea-0d3c-4fe3-b0ef-2a2f9717f8f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-674421a895fe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_934db226-0d72-47b2-be79-7c8ae2b5d33d","handle":"qa-674421a895fe","displayName":"QA 674421a895fe","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.828396410Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c5092ac8-6748-4ba6-89ff-cbf3e2ac2367

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5092ac8-6748-4ba6-89ff-cbf3e2ac2367
Content-Type: application/json

--- request body ---
{"handle":"qa-6ca2e0c3e5f4","displayName":"QA 6ca2e0c3e5f4","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5092ac8-6748-4ba6-89ff-cbf3e2ac2367
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-6ca2e0c3e5f4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0491928-c2a7-4810-81bd-d74ccf5f94a8","handle":"qa-6ca2e0c3e5f4","displayName":"QA 6ca2e0c3e5f4","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.903826674Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1c9dca12-2723-4a95-9e29-901ba74d0637

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c9dca12-2723-4a95-9e29-901ba74d0637
Content-Type: application/json

--- request body ---
{"handle":"qa-674421a895fe","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c9dca12-2723-4a95-9e29-901ba74d0637
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_934db226-0d72-47b2-be79-7c8ae2b5d33d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0397d010-b86e-47f1-a692-4593929bd070

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0397d010-b86e-47f1-a692-4593929bd070
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6ca2e0c3e5f4","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0397d010-b86e-47f1-a692-4593929bd070
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
Location: /v1/conversations/cnv_7492bbf6-3320-4c4b-a9e1-7b28b6a46891
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7492bbf6-3320-4c4b-a9e1-7b28b6a46891","subject":"Error contract","status":"open","region":"eu","participants":["qa-674421a895fe","qa-6ca2e0c3e5f4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:58.957777245Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-7edbdee8-18a8-4177-b4e7-32133735cddf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7edbdee8-18a8-4177-b4e7-32133735cddf
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7edbdee8-18a8-4177-b4e7-32133735cddf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-7edbdee8-18a8-4177-b4e7-32133735cddf","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f5d6e01c-727b-487e-bded-09599721b480

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5d6e01c-727b-487e-bded-09599721b480
Content-Type: application/json

--- request body ---
{"handle":"qa-6ca2e0c3e5f4","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5d6e01c-727b-487e-bded-09599721b480
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d0491928-c2a7-4810-81bd-d74ccf5f94a8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ffac52b-3137-4414-a319-57c10c0dbc78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ffac52b-3137-4414-a319-57c10c0dbc78
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ffac52b-3137-4414-a319-57c10c0dbc78
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-ce4d7f29-17fe-4a0f-9a6f-968480558f70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce4d7f29-17fe-4a0f-9a6f-968480558f70
Content-Type: application/json

--- request body ---
{"handle":"qa-6ca2e0c3e5f4","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce4d7f29-17fe-4a0f-9a6f-968480558f70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce4d7f29-17fe-4a0f-9a6f-968480558f70"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68ef7901-e327-421c-bceb-8e49284ca097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68ef7901-e327-421c-bceb-8e49284ca097
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68ef7901-e327-421c-bceb-8e49284ca097
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5bcb5201-1601-4dfd-999e-e89bf7daa599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bcb5201-1601-4dfd-999e-e89bf7daa599
Content-Type: application/json

--- request body ---
{"handle":"qa-674421a895fe","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bcb5201-1601-4dfd-999e-e89bf7daa599
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5bcb5201-1601-4dfd-999e-e89bf7daa599"}
```
