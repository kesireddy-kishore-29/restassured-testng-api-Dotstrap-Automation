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
| 1 | `POST /v1/accounts` | 201 | 486 | `qa-188922b7-d442-4564-91db-34711c6efed8` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-8ea2bb68-8815-4474-bdf3-f3888dd0cedc` |
| 3 | `GET /health` | 200 | 77 | `qa-8072d6a7-94f9-406b-b444-d3f4f79e03fe` |
| 4 | `POST /v1/auth/token` | 200 | 49 | `qa-49699526-e777-4416-9b25-0e93284bf671` |
| 5 | `GET /v1/accounts/me` | 200 | 33 | `qa-ca68d684-9836-4d6e-b179-1eb448e1b0b5` |
| 6 | `PATCH /v1/accounts/me` | 200 | 26 | `qa-6ac34c81-4169-4d16-828e-1a41ee9c7096` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 22 | `qa-f34cc40f-61bb-461b-a8c5-38a99ffe3a0a` |
| 8 | `POST /v1/conversations` | 201 | 19 | `qa-c3f0c141-33e4-44d5-bf06-9f847a883e79` |
| 9 | `GET /v1/conversations` | 200 | 8 | `qa-2808a03b-06d3-4eb5-8bee-da82903b0a90` |
| 10 | `POST /v1/auth/token` | 200 | 10 | `qa-d1f24fef-c8a2-418e-b537-502abf1b2102` |
| 11 | `GET /v1/conversations/{id}` | 200 | 20 | `qa-7726cc1d-afbd-4e87-acb7-fa13c0e51c84` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 12 | `qa-359043e2-2e93-4eca-9dbf-cb8f5e694d8b` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-f5f37dc0-937d-4499-8049-1754269019ef` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 13 | `qa-68811faf-0a2e-4fb2-9bd5-58958b530837` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 10 | `qa-82024568-a63b-4cd1-8283-540863e09b8d` |
| 16 | `GET /v1/credits/balance` | 200 | 6 | `qa-277e83ec-fe86-4dec-b03f-a24d5f6a17e8` |
| 17 | `GET /v1/credits/ledger` | 200 | 9 | `qa-157054ff-7fc6-4dc9-8a8a-d517946297ec` |
| 18 | `POST /v1/credits/purchases` | 201 | 9 | `qa-25669881-4c81-4275-aa9f-c507dabd6908` |
| 19 | `GET /v1/admin/stats` | 403 | 28 | `qa-96dc9d84-cc15-4fd4-a57c-fce4e0d805a8` |
| 20 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-35a30aec-ec85-4cf3-bc03-9af802ddd4a0` |
| 21 | `POST /v1/auth/token` | 401 | 80 | `qa-db3eacc4-c788-46ab-9e29-c6832b6685a6` |
| 22 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-f9170e7e-779a-4d30-9502-0b85aebe4943` |
| 23 | `POST /v1/auth/token` | 401 | 23 | `qa-3a341299-deb0-4182-946c-0eee3ac7d114` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-188922b7-d442-4564-91db-34711c6efed8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-188922b7-d442-4564-91db-34711c6efed8
Content-Type: application/json

--- request body ---
{"handle":"qa-cf1f59bc2cba","displayName":"QA cf1f59bc2cba","password":"****","region":"eu"}

--- response: 201 in 486 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-188922b7-d442-4564-91db-34711c6efed8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-cf1f59bc2cba
X-Served-Region: eu
Content-Length: 181

{"id":"acc_742ec48c-dde5-4f00-b43e-8715fd9549bd","handle":"qa-cf1f59bc2cba","displayName":"QA cf1f59bc2cba","region":"eu","role":"user","createdAt":"2026-11-20T10:09:59.312765059Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8ea2bb68-8815-4474-bdf3-f3888dd0cedc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ea2bb68-8815-4474-bdf3-f3888dd0cedc
Content-Type: application/json

--- request body ---
{"handle":"qa-8576b90f4d72","displayName":"QA 8576b90f4d72","password":"****","region":"us"}

--- response: 201 in 56 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ea2bb68-8815-4474-bdf3-f3888dd0cedc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-8576b90f4d72
X-Served-Region: us
Content-Length: 181

{"id":"acc_7d409ef3-6e02-43da-8cac-a5a709a5c57d","handle":"qa-8576b90f4d72","displayName":"QA 8576b90f4d72","region":"us","role":"user","createdAt":"2026-11-20T10:09:59.715202151Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-8072d6a7-94f9-406b-b444-d3f4f79e03fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8072d6a7-94f9-406b-b444-d3f4f79e03fe
Content-Type: application/json

--- response: 200 in 77 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8072d6a7-94f9-406b-b444-d3f4f79e03fe
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
correlation: qa-49699526-e777-4416-9b25-0e93284bf671

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49699526-e777-4416-9b25-0e93284bf671
Content-Type: application/json

--- request body ---
{"handle":"qa-cf1f59bc2cba","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-49699526-e777-4416-9b25-0e93284bf671
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_742ec48c-dde5-4f00-b43e-8715fd9549bd"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-ca68d684-9836-4d6e-b179-1eb448e1b0b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca68d684-9836-4d6e-b179-1eb448e1b0b5
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca68d684-9836-4d6e-b179-1eb448e1b0b5
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

{"id":"acc_742ec48c-dde5-4f00-b43e-8715fd9549bd","handle":"qa-cf1f59bc2cba","displayName":"QA cf1f59bc2cba","region":"eu","role":"user","createdAt":"2026-11-20T10:09:59.312765059Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-6ac34c81-4169-4d16-828e-1a41ee9c7096

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ac34c81-4169-4d16-828e-1a41ee9c7096
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 26 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ac34c81-4169-4d16-828e-1a41ee9c7096
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

{"id":"acc_742ec48c-dde5-4f00-b43e-8715fd9549bd","handle":"qa-cf1f59bc2cba","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-20T10:09:59.312765059Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-8576b90f4d72
correlation: qa-f34cc40f-61bb-461b-a8c5-38a99ffe3a0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f34cc40f-61bb-461b-a8c5-38a99ffe3a0a
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f34cc40f-61bb-461b-a8c5-38a99ffe3a0a
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

{"handle":"qa-8576b90f4d72","displayName":"QA 8576b90f4d72","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-c3f0c141-33e4-44d5-bf06-9f847a883e79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3f0c141-33e4-44d5-bf06-9f847a883e79
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8576b90f4d72","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3f0c141-33e4-44d5-bf06-9f847a883e79
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
Location: /v1/conversations/cnv_aa3087e2-8345-4089-9275-909a00cea3a7
X-Data-Region: us
Content-Length: 238

{"id":"cnv_aa3087e2-8345-4089-9275-909a00cea3a7","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-cf1f59bc2cba","qa-8576b90f4d72"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.096123113Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-2808a03b-06d3-4eb5-8bee-da82903b0a90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2808a03b-06d3-4eb5-8bee-da82903b0a90
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2808a03b-06d3-4eb5-8bee-da82903b0a90
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

{"items":[{"id":"cnv_aa3087e2-8345-4089-9275-909a00cea3a7","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-cf1f59bc2cba","qa-8576b90f4d72"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.096123113Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d1f24fef-c8a2-418e-b537-502abf1b2102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1f24fef-c8a2-418e-b537-502abf1b2102
Content-Type: application/json

--- request body ---
{"handle":"qa-8576b90f4d72","password":"****"}

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1f24fef-c8a2-418e-b537-502abf1b2102
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d409ef3-6e02-43da-8cac-a5a709a5c57d"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_aa3087e2-8345-4089-9275-909a00cea3a7
correlation: qa-7726cc1d-afbd-4e87-acb7-fa13c0e51c84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7726cc1d-afbd-4e87-acb7-fa13c0e51c84
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7726cc1d-afbd-4e87-acb7-fa13c0e51c84
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

{"id":"cnv_aa3087e2-8345-4089-9275-909a00cea3a7","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-cf1f59bc2cba","qa-8576b90f4d72"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-20T10:10:00.096123113Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_aa3087e2-8345-4089-9275-909a00cea3a7/messages
correlation: qa-359043e2-2e93-4eca-9dbf-cb8f5e694d8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-359043e2-2e93-4eca-9dbf-cb8f5e694d8b
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-359043e2-2e93-4eca-9dbf-cb8f5e694d8b
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

{"items":[{"id":"msg_c24b6f57-d9e1-4d43-8f43-93974eb747f5","conversationId":"cnv_aa3087e2-8345-4089-9275-909a00cea3a7","sender":"qa-cf1f59bc2cba","body":"Hi","createdAt":"2026-11-20T10:10:00.096157648Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_aa3087e2-8345-4089-9275-909a00cea3a7/messages
correlation: qa-f5f37dc0-937d-4499-8049-1754269019ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5f37dc0-937d-4499-8049-1754269019ef
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5f37dc0-937d-4499-8049-1754269019ef
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

{"id":"msg_562a7960-bda6-4d57-b941-9cc70694a4ac","conversationId":"cnv_aa3087e2-8345-4089-9275-909a00cea3a7","sender":"qa-8576b90f4d72","body":"Reply","createdAt":"2026-11-20T10:10:00.233343762Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_aa3087e2-8345-4089-9275-909a00cea3a7/read
correlation: qa-68811faf-0a2e-4fb2-9bd5-58958b530837

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68811faf-0a2e-4fb2-9bd5-58958b530837
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-68811faf-0a2e-4fb2-9bd5-58958b530837
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

{"conversationId":"cnv_aa3087e2-8345-4089-9275-909a00cea3a7","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_aa3087e2-8345-4089-9275-909a00cea3a7/close
correlation: qa-82024568-a63b-4cd1-8283-540863e09b8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82024568-a63b-4cd1-8283-540863e09b8d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-82024568-a63b-4cd1-8283-540863e09b8d
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

{"id":"cnv_aa3087e2-8345-4089-9275-909a00cea3a7","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-cf1f59bc2cba","qa-8576b90f4d72"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.096123113Z","closedAt":"2026-11-20T10:10:00.284570181Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-277e83ec-fe86-4dec-b03f-a24d5f6a17e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-277e83ec-fe86-4dec-b03f-a24d5f6a17e8
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-277e83ec-fe86-4dec-b03f-a24d5f6a17e8
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

{"balance":4,"currency":"credits","accountId":"acc_742ec48c-dde5-4f00-b43e-8715fd9549bd"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-157054ff-7fc6-4dc9-8a8a-d517946297ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-157054ff-7fc6-4dc9-8a8a-d517946297ec
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-157054ff-7fc6-4dc9-8a8a-d517946297ec
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

{"items":[{"id":"led_03044fb4-a32f-44eb-a409-87ac0a6fd9d5","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-20T10:09:59.314828222Z"},{"id":"led_3ee91f1e-c881-4b99-8540-86e8116bb8eb","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_aa3087e2-8345-4089-9275-909a00cea3a7","createdAt":"2026-11-20T10:10:00.096106922Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-25669881-4c81-4275-aa9f-c507dabd6908

--- request headers ---
Accept: application/json
Idempotency-Key: qa-465775b664e84bb39ef0f4508511659c
X-Correlation-Id: qa-25669881-4c81-4275-aa9f-c507dabd6908
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-25669881-4c81-4275-aa9f-c507dabd6908
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
Location: /v1/credits/purchases/pur_e7f0ea03-2a44-4239-97fb-f61774ee60fc
Content-Length: 144

{"id":"pur_e7f0ea03-2a44-4239-97fb-f61774ee60fc","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-20T10:10:00.335096639Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-96dc9d84-cc15-4fd4-a57c-fce4e0d805a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96dc9d84-cc15-4fd4-a57c-fce4e0d805a8
Content-Type: application/json

--- response: 403 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96dc9d84-cc15-4fd4-a57c-fce4e0d805a8
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-96dc9d84-cc15-4fd4-a57c-fce4e0d805a8"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35a30aec-ec85-4cf3-bc03-9af802ddd4a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35a30aec-ec85-4cf3-bc03-9af802ddd4a0
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35a30aec-ec85-4cf3-bc03-9af802ddd4a0
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
correlation: qa-db3eacc4-c788-46ab-9e29-c6832b6685a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db3eacc4-c788-46ab-9e29-c6832b6685a6
Content-Type: application/json

--- request body ---
{"handle":"qa-8576b90f4d72","password":"****"}

--- response: 401 in 80 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db3eacc4-c788-46ab-9e29-c6832b6685a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db3eacc4-c788-46ab-9e29-c6832b6685a6"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f9170e7e-779a-4d30-9502-0b85aebe4943

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9170e7e-779a-4d30-9502-0b85aebe4943
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f9170e7e-779a-4d30-9502-0b85aebe4943
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
correlation: qa-3a341299-deb0-4182-946c-0eee3ac7d114

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a341299-deb0-4182-946c-0eee3ac7d114
Content-Type: application/json

--- request body ---
{"handle":"qa-cf1f59bc2cba","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a341299-deb0-4182-946c-0eee3ac7d114
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a341299-deb0-4182-946c-0eee3ac7d114"}
```
