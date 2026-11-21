# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-aedaf052-2e52-495c-b3eb-03bb941aaa0c` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-69c79477-3f48-4f9d-9c52-692d17204051` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-7f4d8919-338b-4668-9994-892d71b3b015` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-77997c69-29f2-4cc6-bc4d-9dd1b7918e4f` |
| 5 | `POST /v1/credits/purchases` | 422 | 20 | `qa-b1eab999-7d14-4fa4-9c0e-b2f7ce9a1977` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-795f7109-dea4-4d6c-9a2e-73d336a67d2c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-91600926-eb95-43db-befa-f8fa97397097` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-5c007183-88eb-4145-8049-c787e66b0a26` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-bca101a1-0f09-4c02-8818-9ea1904390b9` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-5a11c8f5-6a9b-4fbc-b832-9a5cc451141e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aedaf052-2e52-495c-b3eb-03bb941aaa0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aedaf052-2e52-495c-b3eb-03bb941aaa0c
Content-Type: application/json

--- request body ---
{"handle":"qa-f8e8778d1d2f","displayName":"QA f8e8778d1d2f","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-aedaf052-2e52-495c-b3eb-03bb941aaa0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Location: /v1/accounts/qa-f8e8778d1d2f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a19f1d2-bf0a-4c08-aedb-ae356f8ac58c","handle":"qa-f8e8778d1d2f","displayName":"QA f8e8778d1d2f","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.794839209Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-69c79477-3f48-4f9d-9c52-692d17204051

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69c79477-3f48-4f9d-9c52-692d17204051
Content-Type: application/json

--- request body ---
{"handle":"qa-0ce149cb230f","displayName":"QA 0ce149cb230f","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-69c79477-3f48-4f9d-9c52-692d17204051
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Location: /v1/accounts/qa-0ce149cb230f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3a299713-6cd5-4a36-9323-84706136f709","handle":"qa-0ce149cb230f","displayName":"QA 0ce149cb230f","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.829124101Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7f4d8919-338b-4668-9994-892d71b3b015

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f4d8919-338b-4668-9994-892d71b3b015
Content-Type: application/json

--- request body ---
{"handle":"qa-f8e8778d1d2f","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f4d8919-338b-4668-9994-892d71b3b015
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a19f1d2-bf0a-4c08-aedb-ae356f8ac58c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-77997c69-29f2-4cc6-bc4d-9dd1b7918e4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77997c69-29f2-4cc6-bc4d-9dd1b7918e4f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0ce149cb230f","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-77997c69-29f2-4cc6-bc4d-9dd1b7918e4f
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
Location: /v1/conversations/cnv_9a37683f-719d-4e9e-8a44-b783892bf928
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9a37683f-719d-4e9e-8a44-b783892bf928","subject":"Error contract","status":"open","region":"eu","participants":["qa-f8e8778d1d2f","qa-0ce149cb230f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.895793624Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b1eab999-7d14-4fa4-9c0e-b2f7ce9a1977

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cd80b4655915430b807afc482e2a04fe
X-Correlation-Id: qa-b1eab999-7d14-4fa4-9c0e-b2f7ce9a1977
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1eab999-7d14-4fa4-9c0e-b2f7ce9a1977
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-b1eab999-7d14-4fa4-9c0e-b2f7ce9a1977","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-795f7109-dea4-4d6c-9a2e-73d336a67d2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-795f7109-dea4-4d6c-9a2e-73d336a67d2c
Content-Type: application/json

--- request body ---
{"handle":"qa-0ce149cb230f","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-795f7109-dea4-4d6c-9a2e-73d336a67d2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a299713-6cd5-4a36-9323-84706136f709"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-91600926-eb95-43db-befa-f8fa97397097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91600926-eb95-43db-befa-f8fa97397097
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-91600926-eb95-43db-befa-f8fa97397097
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
correlation: qa-5c007183-88eb-4145-8049-c787e66b0a26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c007183-88eb-4145-8049-c787e66b0a26
Content-Type: application/json

--- request body ---
{"handle":"qa-0ce149cb230f","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c007183-88eb-4145-8049-c787e66b0a26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5c007183-88eb-4145-8049-c787e66b0a26"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bca101a1-0f09-4c02-8818-9ea1904390b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bca101a1-0f09-4c02-8818-9ea1904390b9
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bca101a1-0f09-4c02-8818-9ea1904390b9
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5a11c8f5-6a9b-4fbc-b832-9a5cc451141e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a11c8f5-6a9b-4fbc-b832-9a5cc451141e
Content-Type: application/json

--- request body ---
{"handle":"qa-f8e8778d1d2f","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a11c8f5-6a9b-4fbc-b832-9a5cc451141e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a11c8f5-6a9b-4fbc-b832-9a5cc451141e"}
```
